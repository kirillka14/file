package com.example.settingalarm

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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.settingalarm.ui.theme.Back
import com.example.settingalarm.ui.theme.SettingalarmTheme
import com.example.settingalarm.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SettingalarmTheme {
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
fun Greeting(name: String) {
    Column() {

        Row()
        {
            Box()
            {
                Text(
                    text = "Будильник",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(20.dp, 22.dp, 0.dp, 0.dp),
                    color = Color.White
                )


            }
            Spacer(modifier = Modifier.width(190.dp))
            Box(
                contentAlignment = Alignment.TopEnd,
                modifier = Modifier.padding(0.dp, 12.dp, 21.dp, 0.dp)
            )
            {

                Image(
                    painter = painterResource(id = R.drawable.avatar),
                    contentDescription = "dd",
                    Modifier.size(60.dp, 60.dp)
                )


            }
        }
        Row()
        {
            Box(contentAlignment = Alignment.TopStart) {
                Text(text = "Профиль пользователя",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(48.dp,24.dp,0.dp,0.dp))
            }
            Box(contentAlignment = Alignment.TopEnd) {

                Text(text = ">",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(48.dp,24.dp,0.dp,0.dp))
            }

        }
        Row()
        {
            Box(contentAlignment = Alignment.TopStart) {
                Text(text = "Дата и время",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(48.dp,24.dp,0.dp,0.dp))
            }
            Box(contentAlignment = Alignment.TopEnd) {

                Text(text = ">",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(150.dp,24.dp,0.dp,0.dp))
            }

        }
        Row()
        {
            Box(contentAlignment = Alignment.TopStart) {
                Text(text = "Настройки звука",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(48.dp,24.dp,0.dp,0.dp))
            }
            Box(contentAlignment = Alignment.TopEnd) {

                Text(text = ">",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(115.dp,24.dp,0.dp,0.dp))
            }

        }
        Row()
        {
            Box(contentAlignment = Alignment.TopStart) {
                Text(text = "Проверить обновления",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(48.dp,24.dp,0.dp,0.dp))
            }
            Box(contentAlignment = Alignment.TopEnd) {

                Text(text = ">",fontSize=22.sp,color= colorResource(id = R.color.white), modifier = Modifier.padding(48.dp,24.dp,0.dp,0.dp))
            }

        }
        Row(modifier = Modifier.padding(48.dp,300.dp,0.dp,0.dp))
        {
            Card(elevation = 10.dp, shape = Shapes.large,backgroundColor = colorResource(id = R.color.on), modifier = Modifier.size(312.dp,72.dp)) {
                Column()
                {
                    Card(elevation = 0.dp,modifier =Modifier.padding(30.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                    {
                        IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                        {

                            Image(painter = painterResource(id = R.drawable.list), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                        }



                    }
                    Text(text = "List", modifier = Modifier.padding(43.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.list), fontSize = 11.sp
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
                    Text(text = "Alarm", modifier = Modifier.padding(106.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.list), fontSize = 11.sp
                    )
                }
                Column()
                {
                    Card(elevation = 0.dp,modifier =Modifier.padding(175.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                    {
                        IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                        {

                            Image(painter = painterResource(id = R.drawable.calendar), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                        }



                    }
                    Text(text = "Calendar", modifier = Modifier.padding(174.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.list), fontSize = 11.sp
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
                    Text(text = "Settings", modifier = Modifier.padding(244.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.back), fontSize = 11.sp
                    )
                }
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SettingalarmTheme {
        Greeting("Android")
    }
}