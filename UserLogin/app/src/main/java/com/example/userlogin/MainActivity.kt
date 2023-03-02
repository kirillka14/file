package com.example.userlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.userlogin.ui.theme.Back
import com.example.userlogin.ui.theme.UserLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Back
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
@Composable
fun TextInputView() {
    var amountInput by remember { mutableStateOf("") }
    TextField(
        value = amountInput,
        onValueChange = { amountInput = it },
        label = { Text(text = "Имя пользователя") },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii),
        keyboardActions = KeyboardActions(
            onDone = { amountInput = "" }
        ),
     
    
    )
}
@Composable
fun PasswordTextField()
{
    var password by rememberSaveable{mutableStateOf("")}
    var passwordVisibility by remember{ mutableStateOf(false)}
    val icon =if(passwordVisibility)
        painterResource(id = R.drawable.design_ic_visibility)
    else
        painterResource(id = R.drawable.design_ic_visibility_off)
    OutlinedTextField(
        value = password,
        onValueChange ={password = it},
        placeholder = { Text(text = "Пароль")},
        label = { Text(text = "Пароль")},
        trailingIcon =
        {
            IconButton(onClick = { passwordVisibility =!passwordVisibility })
            {
                Icon(painter = icon, contentDescription = "Visibility Icon")
            }
        }
        , visualTransformation =
            if (passwordVisibility) VisualTransformation.None
            else PasswordVisualTransformation()
    , modifier = Modifier.size(380.dp,68.dp)
    )

}
@Composable
fun TextInputView1() {
    var amountInput by remember { mutableStateOf("") }
    TextField(
        value = amountInput,
        onValueChange = { amountInput = it },
        label = { Text(text = "Адрес электронной почты") },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii),
        keyboardActions = KeyboardActions(
            onDone = { amountInput = "" }
        ),


        )
}
@Composable
fun Greeting(name: String) {
    Column() {

        Row()
        {
            Box()
            {
                Text(
                    text = "Регистрация",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(20.dp, 22.dp, 0.dp, 0.dp),
                    color = Color.White
                )


            }
            Spacer(modifier = Modifier.width(170.dp))
            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier.padding(10.dp, 24.dp, 21.dp, 0.dp)
            )
            {

                IconButton(onClick = {}, modifier = Modifier.size(48.dp,48.dp))
                {

                    Image(painter = painterResource(id = R.drawable.backbutton), contentDescription =" @name", modifier =Modifier.size(48.dp,48.dp) )
                }


            }
        }
        Row(modifier = Modifier.padding(12.dp,179.dp,12.dp,0.dp))
        {
            Box(contentAlignment =Alignment.Center,)
            {
                TextInputView()
            }
        }
        Row(modifier = Modifier.padding(12.dp,16.dp,12.dp,0.dp))
        {
            Box(contentAlignment =Alignment.Center,)
            {
                TextInputView1()
            }
        }
        Row(modifier = Modifier.padding(12.dp,16.dp,12.dp,0.dp))
        {
            Box(contentAlignment =Alignment.Center)
            {
                PasswordTextField()
            }
        }
        Row(modifier = Modifier.padding(12.dp,16.dp,12.dp,0.dp))
        {
            Box(contentAlignment = Alignment.BottomCenter)
            {
                Button(onClick = { /*TODO*/ },modifier = Modifier.size(380.dp,68.dp), colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(
                    id = R.color.on
                )))
            
                {
                    Text(text = "Регистрация", color = colorResource(id = R.color.white))
                }    
            }    
        }
    }
}

@Preview(showBackground = true)


@Composable
fun DefaultPreview() {
    UserLoginTheme {
        Greeting("Android")
    }
}