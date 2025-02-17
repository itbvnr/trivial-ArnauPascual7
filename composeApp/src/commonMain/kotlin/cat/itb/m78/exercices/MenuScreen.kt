package cat.itb.m78.exercices

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import m78exercices.composeapp.generated.resources.Res
import m78exercices.composeapp.generated.resources.TrivialImage
import org.jetbrains.compose.resources.painterResource

@Composable
fun MenuScreen(navigateToGameScreen: ()-> Unit, navigateToSettingsScreen: ()-> Unit) {
    if (difficulty == "Nightmare") nightmareAlert()
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Trivial", fontSize = 40.sp, fontWeight = FontWeight.Bold)
        Image(
            painter = painterResource(Res.drawable.TrivialImage),
            contentDescription = null,
            modifier = Modifier.size(150.dp)
        )
        Spacer(Modifier.height(50.dp))
        Button(onClick = navigateToGameScreen){
            Text("New Game")
        }
        Button(onClick = navigateToSettingsScreen){
            Text("Settings")
        }
    }
}

@Composable
fun nightmareAlert() {
    var nightmareAlert by remember { mutableStateOf(true) }
    if (nightmareAlert) {
        AlertDialog(
            onDismissRequest = {
                nightmareAlert = false
            },
            title = { Text(text = "Are you sure?") },
            text = { Text(text = "Nightmare difficulty has not been tested to be possible.") },
            confirmButton = {
                TextButton(onClick = {
                    nightmareAlert = false
                }) { Text("Continue") }
            }
        )
    }
}