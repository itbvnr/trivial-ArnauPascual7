package cat.itb.m78.exercices

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GameScreen(navigateToResultScreen: (Int)-> Unit) {
    var current: Int by remember { mutableStateOf(0) }
    var score: Int by remember { mutableStateOf(0) }
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
    }
    if (current >= rounds) {
        current = 9
        navigateToResultScreen(score)
    }
}