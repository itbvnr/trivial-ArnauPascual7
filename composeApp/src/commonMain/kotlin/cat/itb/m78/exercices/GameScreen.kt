package cat.itb.m78.exercices

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun GameScreen(navigateToResultScreen: (Int)-> Unit) {
    var currentRound: Int by remember { mutableStateOf(0) }
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
            if (timeLeft <= 0) {
                currentRound ++
                timeLeft = timer.toFloat() / 100
            }
        }
    }
    if (currentRound >= rounds) {
        currentRound = rounds - 1
        navigateToResultScreen(score)
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        val questions: List<Question> = questionsSelect()
        Text("Round ${currentRound + 1}/$rounds")
        Spacer(Modifier.height(20.dp))
        Text(questions[currentRound].statement, fontSize = 20.sp, textAlign = TextAlign.Center)
        Spacer(Modifier.height(20.dp))
        questions[currentRound].answers.forEach { answer ->
            Button(onClick = {
                currentRound ++
                if (answer.correct) score ++
                timeLeft = timer.toFloat() / 100
            },
                shape = RectangleShape
            ){
                Text(answer.text)
            }
        }
        Spacer(Modifier.height(20.dp))
        LinearProgressIndicator(
            progress = { animatedProgress }
        )
    }
}

fun questionsSelect(): List<Question> {
    if (difficulty == "Normal") return normalQuestions
    if (difficulty == "Hard") return hardQuestions
    if (difficulty == "Nightmare") return nightmareQuestions + hardQuestions
    return easyQuestions
}