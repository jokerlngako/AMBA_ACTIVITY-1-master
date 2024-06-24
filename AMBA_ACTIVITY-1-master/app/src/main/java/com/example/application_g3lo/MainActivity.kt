package com.example.application_g3lo


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.application_g3lo.ui.theme.Application_G3LOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Application_G3LOTheme {

                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(R.drawable.taskscheck),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.padding(start = 60.dp,end=60.dp).fillMaxWidth()
        )
        Text(
            text = "All Tasks Completed.",
            fontWeight = FontWeight.Bold,
            modifier=  Modifier.padding(start = 24.dp,end=8.dp)
        )
        Text(
            text = "Nice Work!",
            fontSize = 16.sp
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Application_G3LOTheme {
        Greeting()
    }
}