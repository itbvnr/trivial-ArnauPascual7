
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension
import cat.itb.m78.exercices.App

fun main() = application {
    Window(
        title = "M78Exercices",
        state = rememberWindowState(width = 450.dp, height = 800.dp), // Default: Width = 800, Height = 600
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(450, 800) // Default: Width = 350, Height = 600
        App()
    }
}

@Composable
fun AppPreview() { App() }