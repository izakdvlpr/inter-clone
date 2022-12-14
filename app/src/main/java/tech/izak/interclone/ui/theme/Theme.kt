package tech.izak.interclone.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val ColorPalette = darkColors(
  primary = Favorite,
  primaryVariant = Favorite,
  background = Background
)

@Composable
fun InterCloneTheme(content: @Composable () -> Unit) {
  MaterialTheme(
    colors = ColorPalette,
    typography = Typography,
    shapes = Shapes,
    content = content
  )
}