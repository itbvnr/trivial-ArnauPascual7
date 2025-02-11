package cat.itb.m78.exercices

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MenuScreen(navigateToGameScreen: ()-> Unit, navigateToSettingsScreen: ()-> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = navigateToGameScreen){
            Text("New Game")
        }
        Button(onClick = navigateToSettingsScreen){
            Text("Settings")
        }
    }
}