package cat.itb.m78.exercices

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen(navigateToMenuScreen: ()-> Unit) {
    val difficulties = arrayOf("Easy", "Normal", "Hard", "Nightmare")
    var diffSelected by remember { mutableStateOf(difficulty) }
    var expandedDropdown by remember { mutableStateOf(false) }
    val roundsList = arrayOf(5,10,15)
    var (roundsSelected, onRoundsSelected) = remember { mutableStateOf(rounds) }
    var timerSelected by remember { mutableStateOf(timer.toFloat()) }

    if (diffSelected == difficulties[3]) {
        roundsSelected = 30
        timerSelected = 10f
        nightmareDiffAlert()
    }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        // Difficulty
        Row {
            Text("Difficulty:")
            Spacer(Modifier.width(20.dp))
            Button(onClick = { expandedDropdown = true },
                shape = RectangleShape
            ) {
                Text(diffSelected)
            }
            DropdownMenu(expanded = expandedDropdown, onDismissRequest = { expandedDropdown = false }) {
                difficulties.forEach { diff ->
                    DropdownMenuItem(
                        text = { Text(diff) },
                        onClick = {
                            diffSelected = diff
                            expandedDropdown = false
                        }
                    )
                }
            }
        }
        Spacer(Modifier.height(20.dp))
        // Rounds
        Row {
            Text("Rounds:")
            Spacer(Modifier.width(20.dp))
            Column(Modifier.selectableGroup()) {
                roundsList.forEach { round ->
                    Row(
                        Modifier.selectable(
                            selected = (round == roundsSelected),
                            onClick = { onRoundsSelected(round) },
                            role = Role.RadioButton
                        )
                    ) {
                        RadioButton(
                            selected = (round == roundsSelected),
                            onClick = null
                        )
                        Text(round.toString())
                    }
                }
            }
        }
        Spacer(Modifier.height(20.dp))
        // Time
        Text("Time per round: ${timerSelected.toInt()}")
        Spacer(Modifier.height(10.dp))
        Slider(
            modifier = Modifier.semantics { contentDescription = "Localized Description" }.height(15.dp).width(300.dp),
            value = timerSelected,
            valueRange = 5f..60f,
            onValueChange = { timerSelected = it }
        )
        Spacer(Modifier.height(50.dp))
        // Return Button
        Button(onClick = {
            difficulty = diffSelected
            rounds = roundsSelected
            timer = timerSelected.toInt()
            navigateToMenuScreen()
        }){
            Text("Return to menu")
        }
    }
}

@Composable
fun nightmareDiffAlert() {
    var nightmareAlert by remember { mutableStateOf(true) }
    if (nightmareAlert) {
        AlertDialog(
            onDismissRequest = {
                nightmareAlert = false
            },
            title = { Text(text = "Nightmare Difficulty Selected") },
            text = { Text(text = "This difficulty is the hardest. Nightmare difficulty sets the rounds to 30 and the timer to 10.") },
            confirmButton = {
                TextButton(onClick = { nightmareAlert = false }) { Text("Ok") }
            }
        )
    }
}