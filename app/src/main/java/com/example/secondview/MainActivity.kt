package com.example.secondview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.secondview.ui.theme.SecondViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SecondViewTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   MainScreen()
                }
            }
        }
    }
}
@Composable
fun MainScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Magenta)) {
        Image(painter = painterResource(id = R.drawable.sec), contentDescription ="" )
    }
    Column(modifier = Modifier
        .fillMaxSize(),
    verticalArrangement =Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Text(text = "لطفا مشخصات خود را وارد کنید",
        color = Color.White
            )
       Spacer(modifier = Modifier.height(70.dp))
            //first button
            Button(onClick = {},
                colors= ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier
                    .height(40.dp)
                    .width(250.dp)
            )
            {
                Text(text = "نام",
                    color = Color.Black
                )
            }
        Spacer(modifier = Modifier.height(30.dp))
            //second button
            Button(onClick = {},
                colors= ButtonDefaults.buttonColors(backgroundColor = Color.White),
                modifier = Modifier
                    .height(40.dp)
                    .width(250.dp)
            )
            {
                Text(text = "شماره تماس",
                    color = Color.Black,
                    )
            }
        }
    }
@Composable
fun MySecondView(resource : Int){
    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = resource), contentDescription = null)
    }
}
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SecondViewTheme {
        MainScreen()
    }
}