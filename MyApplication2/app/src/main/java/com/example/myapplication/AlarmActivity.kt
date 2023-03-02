package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Shapes

class AlarmActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting2("Android",chek =false)
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, chek : Boolean) {
    Column() {

        Row()
        {
            Box()
            {
                Text(text = "Будильник", fontSize =24.sp , modifier =Modifier.padding(20.dp,22.dp,0.dp,0.dp) , color = Color.White)


            }
            Spacer(modifier = Modifier.width(190.dp))
            Box(contentAlignment = Alignment.TopEnd, modifier = Modifier.padding(0.dp,12.dp,21.dp,0.dp))
            {

                Image(painter = painterResource(id = R.drawable.avatar), contentDescription = "dd",Modifier.size(60.dp,60.dp))


            }

        }
        Row()
        {
            Box(contentAlignment = Alignment.CenterStart)
            {
                Text(
                    text = "7:30",
                    fontSize = 48.sp,
                    color = Color.White,
                    modifier = Modifier.padding(20.dp,49.dp,0.dp,0.dp)
                )

            }

            Switch(checked =chek, onCheckedChange = {chek ==it}, modifier = Modifier.padding(220.dp,50.dp), colors = SwitchDefaults.colors(
                uncheckedThumbColor = colorResource(id = R.color.off),
                checkedThumbColor = colorResource(id = R.color.Button)


            ) )
        }
        Row()
        {
            Box(contentAlignment = Alignment.CenterStart)
            {
                Text(
                    text = "8:00",
                    fontSize = 48.sp,
                    color = Color.White,
                    modifier = Modifier.padding(20.dp,0.dp,0.dp,0.dp)
                )

            }


            Switch(checked = chek, onCheckedChange = {chek ==it}, modifier = Modifier.padding(220.dp,5.dp), colors = SwitchDefaults.colors(
                uncheckedThumbColor = colorResource(id = R.color.off),
                checkedThumbColor = colorResource(id = R.color.Button)


            ) )

        }
        Row()
        {
            Box(modifier = Modifier.padding(48.dp,220.dp,0.dp,0.dp), contentAlignment = Alignment.BottomCenter)
            {
                Button(onClick = {}, shape = Shapes.large ,colors = ButtonDefaults.buttonColors(
                    colorResource(id =R.color.Button )
                ) ,modifier = Modifier.size(312.dp,48.dp))
                {

                    Text(text = "Добавить будильник", color = Color.White,fontSize = 18.sp)

                }


            }

        }
        Row(modifier = Modifier.padding(48.dp,35.dp,0.dp,0.dp))
        {
            Card(elevation = 10.dp, shape = Shapes.large,backgroundColor = colorResource(id = R.color.Button), modifier = Modifier.size(312.dp,72.dp)) {
                Column()
                {
                    Card(elevation = 0.dp,modifier =Modifier.padding(30.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                    {
                        IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                        {

                            Image(painter = painterResource(id = R.drawable.list), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                        }



                    }
                    Text(text = "List", modifier = Modifier.padding(43.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.Alarm), fontSize = 11.sp
                    )
                }
                Column()
                {
                    Card(elevation = 0.dp,modifier =Modifier.padding(100.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                    {
                        IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                        {

                            Image(painter = painterResource(id = R.drawable.alarm), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                        }



                    }
                    Text(text = "Alarm", modifier = Modifier.padding(106.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.Back), fontSize = 11.sp
                    )
                }
                Column()
                {
                    Card(elevation = 0.dp,modifier =Modifier.padding(175.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                    {
                        IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                        {

                            Image(painter = painterResource(id = R.drawable.kalendar), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                        }



                    }
                    Text(text = "Calendar", modifier = Modifier.padding(174.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.Alarm), fontSize = 11.sp
                    )
                }
                Column()
                {
                    Card(elevation = 0.dp,modifier =Modifier.padding(245.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                    {
                        IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                        {

                            Image(painter = painterResource(id = R.drawable.setting), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                        }



                    }
                    Text(text = "Settings", modifier = Modifier.padding(244.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.Alarm), fontSize = 11.sp
                    )
                }
            }

        }


    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {

    MyApplicationTheme {
        var ischeked: Boolean =false
        Greeting2("Android",ischeked)
    }
}