package cat.itb.m78.exercices

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.lifecycle.ViewModel
import cat.itb.m78.exercices.theme.AppTheme
import org.jetbrains.compose.reload.DevelopmentEntryPoint
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.*
import androidx.navigation.*
import kotlinx.serialization.Serializable

@Composable
internal fun App() = AppTheme {
    LibNavScreenSample()
    /*Box(Modifier.fillMaxSize()){
        Text("Your app goes here!", Modifier.align(Alignment.Center))
    }*/
}
@Composable
fun Screen1(navigateToScreen2: ()-> Unit){
    Button(onClick = navigateToScreen2){
        Text("Go To screen2")
    }
}
@Composable
fun Screen2(navigateToScreen3: (String)-> Unit){
    var text by remember{ mutableStateOf("") }
    Column {
        TextField(text, onValueChange = {text = it})
        Button(onClick = {navigateToScreen3(text)}){
            Text("Go to Screen 3")
        }
    }
}
@Composable
fun Screen3(message: String){
    Text(message)
}
private sealed interface Screen {
    data object Screen1 : Screen
    data object Screen2 : Screen
    data class Screen3(val message: String) : Screen
}
private class ManualNavAppViewModel : ViewModel() {
    val currentScreen = mutableStateOf<Screen>(Screen.Screen1)
    fun navigateTo(screen: Screen) {
        currentScreen.value = screen
    }
}
@Composable
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
}
object Destination {
    @Serializable
    data object Screen1
    @Serializable
    data object Screen2
    @Serializable
    data class Screen3(val message: String)
}
@Composable
fun LibNavScreenSample() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destination.Screen1) {
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
    }
}