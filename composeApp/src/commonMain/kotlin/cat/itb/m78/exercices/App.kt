package cat.itb.m78.exercices

import androidx.compose.foundation.interaction.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.*
import androidx.compose.material.icons.*
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.semantics.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.*
import cat.itb.m78.exercices.theme.*
import androidx.navigation.compose.*
import androidx.navigation.*
import kotlinx.coroutines.delay
import kotlinx.serialization.*
import kotlin.math.roundToInt

var rounds: Int = 10

@Composable
internal fun App() = AppTheme {
    NavScreen()
}
/*@Composable
fun Screen1(navigateToScreen2: ()-> Unit){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Button(onClick = navigateToScreen2){
            Text("New Game - GameScreen")
        }
        Button(onClick = navigateToScreen2){
            Text("Settings - SettingsScreen")
        }
    }
}*/
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
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navigateToMenuScreen: ()-> Unit) {
    val difficulties = listOf("Easy", "Normal", "Hard", "Nightmare")
    var expanded by remember { mutableStateOf(false) }
    val rounds = listOf(5,10,15)
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(rounds[1]) }
    var timer by remember { mutableStateOf(30f) }
    /*var expanded by remember { mutableStateOf(false) }
    val textFieldState = rememberTextFieldState(difficulties[0])*/
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        // Difficulty
        Row {
            Text("Difficulty:")
            Button(onClick = { expanded = true },
                shape = RectangleShape) {
                Text("Hola")
            }
            /*IconButton(onClick = { expanded = true }) {
                Icon(Icons.Default.MoreVert, contentDescription = "Localized description")
            }*/
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                DropdownMenuItem(
                    text = { Text("Edit") },
                    onClick = { /* Handle edit! */ },
                    leadingIcon = { Icon(Icons.Outlined.Edit, contentDescription = null) }
                )
                DropdownMenuItem(
                    text = { Text("Settings") },
                    onClick = { /* Handle settings! */ },
                    leadingIcon = { Icon(Icons.Outlined.Settings, contentDescription = null) }
                )
                HorizontalDivider()
                DropdownMenuItem(
                    text = { Text("Send Feedback") },
                    onClick = { /* Handle send feedback! */ },
                    leadingIcon = { Icon(Icons.Outlined.Email, contentDescription = null) },
                    trailingIcon = { Text("F11", textAlign = TextAlign.Center) }
                )
            }
            /*ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = it }
            ) {
                Button(onClick = { expanded = true }) {
                    Text(textFieldState.toString())
                }
                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    difficulties.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {
                                textFieldState.setTextAndPlaceCursorAtEnd(option)
                                expanded = false
                            },
                            contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                        )
                    }
                }
            }*/
        }
        // Rounds
        Row {
            Text("Rounds:")
            Spacer(Modifier.width(20.dp))
            Column(Modifier.selectableGroup()) {
                rounds.forEach { text ->
                    Row(
                        Modifier.selectable(
                            selected = (text == selectedOption),
                            onClick = { onOptionSelected(text) },
                            role = Role.RadioButton
                        )
                    ) {
                        RadioButton(
                            selected = (text == selectedOption),
                            onClick = null
                        )
                        Text(text.toString())
                    }
                }
            }
        }
        Spacer(Modifier.height(20.dp))
        // Time
        Text("Time per round: ${timer.toInt()}")
        Spacer(Modifier.height(10.dp))
        Slider(
            modifier = Modifier.semantics { contentDescription = "Localized Description" }.height(15.dp).width(300.dp),
            value = timer,
            valueRange = 5f..60f,
            onValueChange = { timer = it }
        )
        Spacer(Modifier.height(50.dp))
        Button(onClick = navigateToMenuScreen){
            Text("Return to menu")
        }
    }
}
@Composable
fun ResultScreen(score: Int, navigateToMenuScreen: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text("Score: $score", fontSize = 20.sp)
        Button(onClick = navigateToMenuScreen) {
            Text("Return to menu")
        }
    }
}
/*@Composable
fun Screen2(navigateToScreen3: (String)-> Unit){
    var text by remember{ mutableStateOf("") }
    Column {
        TextField(text, onValueChange = {text = it})
        Button(onClick = {navigateToScreen3(text)}){
            Text("Go to Screen 3")
        }
    }
}*/
/*@Composable
fun Screen3(message: String){
    Text(message)
}*/
/*private sealed interface Screen {
    /*data object Screen1 : Screen
    data object Screen2 : Screen
    data class Screen3(val message: String) : Screen*/
    data object MenuScreen : Screen
    data object GameScreen : Screen
    data object SettingsScreen : Screen
    data class ResultScreen(val score: Int) : Screen
}*/
/*private class ManualNavAppViewModel : ViewModel() {
    val currentScreen = mutableStateOf<Screen>(Screen.Screen1)
    fun navigateTo(screen: Screen) {
        currentScreen.value = screen
    }
}*/
/*@Composable
fun ManualNav() {
    val viewModel = viewModel { ManualNavAppViewModel() }
    val currentScreen = viewModel.currentScreen.value
    when (currentScreen) {
        Screen.Screen1 -> Screen1(
            navigateToScreen2 = { viewModel.navigateTo(Screen.Screen2) }
        )
        is Screen.Screen2 -> Screen2(
            navigateToScreen3 = { viewModel.navigateTo(Screen.Screen3(it)) }
        )
        is Screen.Screen3 -> Screen3(currentScreen.message)
    }
}*/
object Destination {
    /*@Serializable
    data object Screen1
    @Serializable
    data object Screen2
    @Serializable
    data class Screen3(val message: String)*/
    @Serializable
    data object MenuScreen
    @Serializable
    data object GameScreen
    @Serializable
    data object SettingsScreen
    @Serializable
    data class ResultScreen(val score: Int)
}
@Composable
fun NavScreen() {
    val navController = rememberNavController()
    /*NavHost(navController = navController, startDestination = Destination.Screen1) {
        composable<Destination.Screen1> {
            Screen1(
                navigateToScreen2 = { navController.navigate(Destination.Screen2) },
            )
        }
        composable<Destination.Screen2> {
            Screen2 { navController.navigate(Destination.Screen3(it)) }
        }
        composable<Destination.Screen3> { backStack ->
            val message = backStack.toRoute<Destination.Screen3>().message
            Screen3(message)
        }
    }*/
    NavHost(navController = navController, startDestination = Destination.MenuScreen) {
        composable<Destination.MenuScreen> {
            MenuScreen(
                navigateToGameScreen = { navController.navigate(Destination.GameScreen) },
                navigateToSettingsScreen = { navController.navigate(Destination.SettingsScreen) }
            )
        }
        composable<Destination.GameScreen> {
            GameScreen { navController.navigate(Destination.ResultScreen(it)) }
        }
        composable<Destination.SettingsScreen> {
            SettingsScreen(
                navigateToMenuScreen = { navController.navigate(Destination.MenuScreen) }
            )
        }
        composable<Destination.ResultScreen> { backStack ->
            val score = backStack.toRoute<Destination.ResultScreen>().score
            ResultScreen(
                score,
                navigateToMenuScreen = { navController.navigate(Destination.MenuScreen) }
            )
        }
    }
}