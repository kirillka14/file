package com.example.edittext

import android.graphics.drawable.shapes.Shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edittext.ui.theme.Back
import com.example.edittext.ui.theme.EditTextTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EditTextTheme {
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
        label = { Text(text = "Заголовок задачи") },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Ascii),
        keyboardActions = KeyboardActions(
            onDone = { amountInput = "" }
        ),



        )
}
@Composable
fun TimeInputView() {
    var amountInput by remember { mutableStateOf("") }
    TextField(
        value = amountInput,
        onValueChange = { amountInput = it },
        label = { Text(text = "16:30") },
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
                    text = "Изменить задачу",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(20.dp, 22.dp, 0.dp, 0.dp),
                    color = Color.White
                )


            }
            Spacer(modifier = Modifier.width(130.dp))
            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier.padding(0.dp, 24.dp, 21.dp, 0.dp)
            )
            {

                IconButton(onClick = {}, modifier = Modifier.size(48.dp, 48.dp))
                {

                    Image(
                        painter = painterResource(id = R.drawable.backbutton),
                        contentDescription = " @name",
                        modifier = Modifier.size(48.dp, 48.dp)
                    )
                }


            }
        }
        Row()
        {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(12.dp,86.dp,12.dp,0.dp))
            {
                TextInputView()
            }

        }
        Row()
        {
            Box(contentAlignment = Alignment.Center, modifier = Modifier.padding(12.dp,16.dp,12.dp,0.dp))
            {
                TimeInputView()
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EditTextTheme {
        Greeting("Android")
    }
}