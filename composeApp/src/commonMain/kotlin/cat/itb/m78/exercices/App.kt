package cat.itb.m78.exercices

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.semantics.*
import androidx.compose.ui.unit.*
import cat.itb.m78.exercices.theme.*
import androidx.navigation.compose.*
import androidx.navigation.*
import kotlinx.serialization.*

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
    data class GameScreen(val difficulty: String, val rounds: Int, val timer: Int)
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
        composable<Destination.GameScreen> { backStack ->
            val difficulty = backStack.toRoute<Destination.GameScreen>().difficulty
            val rounds = backStack.toRoute<Destination.GameScreen>().rounds
            val timer = backStack.toRoute<Destination.GameScreen>().timer
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