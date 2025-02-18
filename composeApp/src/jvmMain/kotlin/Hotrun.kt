
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension
import cat.itb.m78.exercices.App
import org.jetbrains.compose.reload.DevelopmentEntryPoint

fun main() = application {
    Window(
        title = "M78Exercices",
        state = rememberWindowState(width = 450.dp, height = 800.dp),
        onCloseRequest = ::exitApplication,
    ) {
        window.minimumSize = Dimension(450, 800)
        DevelopmentEntryPoint {
            App()
        }
    }
}

