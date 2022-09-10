package tech.izak.interclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import tech.izak.interclone.ui.screens.login.LoginScreen
import tech.izak.interclone.ui.theme.InterCloneTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContent {
      InterCloneTheme {
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colors.background
        ) {
          LoginScreen()
        }
      }
    }
  }
}

//@Composable
//fun Greeting(name: String) {
//  Text(text = "Hello $name!")
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//  InterCloneTheme {
//    Greeting("Android")
//  }
//}