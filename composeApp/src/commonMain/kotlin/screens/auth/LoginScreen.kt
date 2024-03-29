package screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import data.MockDataRepository
import org.koin.compose.koinInject

@Composable
fun LoginScreen(
    navigateToMain: () -> Unit,
    navigateToForgot: () -> Unit,
    navigateToRegister: () -> Unit
) {

    val repo: MockDataRepository = koinInject()

    Column(
        modifier = Modifier.fillMaxSize().background(Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            text = repo.getMockData(),
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = Color.Red,
            fontWeight = FontWeight.Medium
        )

        Button(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            onClick = { navigateToRegister.invoke() }
        ) {
            Text(text = "Go to Register")
        }

        Button(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            onClick = { navigateToForgot.invoke() }
        ) {
            Text(text = "Go to Forgot Password")
        }

        Button(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp),
            onClick = { navigateToMain.invoke() }
        ) {
            Text(text = "Go to Main")
        }
    }
}