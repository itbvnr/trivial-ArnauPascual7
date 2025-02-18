package cat.itb.m78.exercices

import androidx.compose.runtime.*
import cat.itb.m78.exercices.theme.*
import androidx.navigation.compose.*
import androidx.navigation.*
import kotlinx.serialization.*

var difficulty: String = "Normal"
var rounds: Int = 10
var timer: Int = 30

@Composable
internal fun App() = AppTheme {
    NavScreen()
}

object Destination {
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
            SettingsScreen{ navController.navigate(Destination.MenuScreen) }
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
