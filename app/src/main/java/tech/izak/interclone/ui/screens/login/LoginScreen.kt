package tech.izak.interclone.ui.screens.login

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HealthAndSafety
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImagePainter
import coil.compose.ImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import coil.request.ImageRequest
import coil.size.OriginalSize
import coil.size.Size
import tech.izak.interclone.R
import tech.izak.interclone.ui.theme.Favorite
import tech.izak.interclone.ui.theme.InterCloneTheme

@Composable
fun LoginScreen() {
  var password by rememberSaveable { mutableStateOf("") }

  Column(
    modifier = Modifier.padding(30.dp),
    verticalArrangement = Arrangement.SpaceBetween
  ) {
    Column {
      Row(
        modifier = Modifier
          .fillMaxWidth()
          .padding(vertical = 40.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
      ) {
        Image(
          painter = painterResource(R.drawable.logo),
          contentDescription = "avatar",
          modifier = Modifier.height(40.dp)
        )
      }
      Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
          .fillMaxWidth()
          .padding(top = 30.dp),
        backgroundColor = Color.White,
        elevation = 0.dp,
        border = BorderStroke(2.dp, Color(0xFFE6E6EA))
      ) {
        Row(
          modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 15.dp, horizontal = 20.dp),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.SpaceBetween
        ) {
          Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
              painter = rememberAsyncImagePainter("https://media.discordapp.net/attachments/756522215234732195/1015417952939556864/unknown.png"),
              contentDescription = "avatar",
              contentScale = ContentScale.Crop,
              modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(20.dp))
            Column {
              Text(
                "Isaque Lima",
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
              )
              Text(
                "***.000.000-**",
                fontSize = 14.sp,
                color = Color.Black,
                fontWeight = FontWeight.ExtraBold,
              )
            }
          }
          Text(
            "Trocar",
            fontSize = 20.sp,
            color = Favorite,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {},
          )
        }
      }
      Spacer(modifier = Modifier.height(20.dp))
      Column {
        Text(
          "Senha",
          color = Color(0xFF6D6E73),
          fontWeight = FontWeight.Medium,
        )
        Spacer(modifier = Modifier.height(10.dp))
        BasicTextField(
          value = password,
          onValueChange = { password = it },
          visualTransformation = PasswordVisualTransformation(),
          decorationBox = { innerTextField ->
            Row(
              Modifier
                .background(Color(0xFFF5F6FA), RoundedCornerShape(percent = 12))
                .padding(16.dp)
                .fillMaxWidth()
            ) {

              if (password.isEmpty()) {
                Text("Senha", color = Color(0xFFE1E2E6))
              }

              innerTextField()
            }
          },
        )
      }
      Spacer(modifier = Modifier.height(30.dp))
      Button(
        modifier = Modifier
          .fillMaxWidth()
          .height(55.dp),
        shape = RoundedCornerShape(16),
        colors = ButtonDefaults.buttonColors(
          backgroundColor = Favorite,
        ),
        onClick = { /*TODO*/ }) {
        Text("Entrar", fontSize = 20.sp, color = Color.White, fontWeight = FontWeight.Bold)
      }
      Spacer(modifier = Modifier.height(40.dp))
      Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
      ) {
        Text(
          "Esqueci minha senha",
          fontSize = 20.sp,
          color = Favorite,
          fontWeight = FontWeight.Bold,
          modifier = Modifier.clickable {},
        )
      }
    }
    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
      horizontalArrangement = Arrangement.SpaceBetween
    ) {
      Row(modifier = Modifier.clickable {}, verticalAlignment = Alignment.CenterVertically) {
        Icon(Icons.Outlined.HealthAndSafety, tint = Favorite, contentDescription = null)
        Text("iSafe", fontSize = 20.sp, color = Favorite, fontWeight = FontWeight.Bold)
      }
      Text(
        "Trocar ou abrir conta",
        fontSize = 20.sp,
        color = Favorite,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.clickable {},
      )
    }
  }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
  InterCloneTheme {
    LoginScreen()
  }
}