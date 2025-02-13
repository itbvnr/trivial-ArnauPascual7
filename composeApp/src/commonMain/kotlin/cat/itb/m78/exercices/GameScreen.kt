package cat.itb.m78.exercices

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlin.random.Random

//https://www.jetbrains.com/help/kotlin-multiplatform-dev/compose-multiplatform-resources-usage.html#strings

@Composable
fun GameScreen(navigateToResultScreen: (Int)-> Unit) {
    var current: Int by remember { mutableStateOf(0) }
    var score: Int by remember { mutableStateOf(0) }
    var timeLeft by remember { mutableFloatStateOf(timer.toFloat() / 100) }
    val animatedProgress by animateFloatAsState(
        targetValue = timeLeft / timer * 100,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    )
    LaunchedEffect(key1 = timeLeft) {
        while (timeLeft > 0) {
            delay(1000L)
            timeLeft -= 0.01f
        }
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        val random: Int = Random.nextInt(0, 3)
        val question: Question = questions[random]
        Text("Round ${current + 1}/$rounds")
        Spacer(Modifier.width(50.dp))
        Text(question.statement, fontSize = 20.sp)
        questions[random].answers.forEach { answer ->
            Button(onClick = {
                current ++
                if (answer.correct) score ++
                timeLeft = timer.toFloat() / 100
            }){
                Text(answer.text)
            }
        }
        /*Row {
            Button(onClick = {
                current ++
                timeLeft = timer.toFloat() / 100
            }){
                Text("Answer1")
            }
            Button(onClick = {
                current ++
                timeLeft = timer.toFloat() / 100
            }){
                Text("Answer2")
            }
        }
        Row {
            Button(onClick = {
                current ++
                timeLeft = timer.toFloat() / 100
            }){
                Text("Answer3")
            }
            Button(onClick = {
                current ++
                timeLeft = timer.toFloat() / 100
            }){
                Text("Answer4")
            }
        }*/
        LinearProgressIndicator(
            progress = { animatedProgress },
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

        }
    }
    if (timeLeft <= 0) {
        current ++
        timeLeft = timer.toFloat() / 100
    }
    if (current >= rounds) {
        current = rounds - 1
        navigateToResultScreen(score)
    }
}