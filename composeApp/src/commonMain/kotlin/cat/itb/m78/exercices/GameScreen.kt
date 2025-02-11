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
            println(timeLeft)
        }
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text("Round ${current + 1}/$rounds")
        Spacer(Modifier.width(50.dp))
        Text("Question?", fontSize = 20.sp)
        Row {
            Button(onClick = { current ++
                score ++}){
                Text("Answer1")
            }
            Button(onClick = { current ++ }){
                Text("Answer2")
            }
        }
        Row {
            Button(onClick = { current ++ }){
                Text("Answer3")
            }
            Button(onClick = { current ++ }){
                Text("Answer4")
            }
        }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            LinearProgressIndicator(
                progress = { animatedProgress },
            )
            /*Slider(
                modifier = Modifier.width(300.dp),
                value = progress,
                valueRange = 0f..1f,
                onValueChange = { progress = it },
            )*/
        }
    }
    if (current >= rounds || timeLeft <= 0) {
        current = rounds - 1
        navigateToResultScreen(score)
    }
}