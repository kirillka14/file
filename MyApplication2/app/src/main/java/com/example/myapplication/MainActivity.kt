package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.print.PrintAttributes
import android.text.style.BackgroundColorSpan
import android.widget.ImageButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Back
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color= Back
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String)
{
  Column()
  {
      Row(modifier = Modifier.padding(27.dp,27.dp,0.dp,0.dp))
       {
                  Text(text = "Список дел ", modifier = Modifier.size(131.dp,28.dp), color = Color.White ,fontSize = 24.sp)
           Spacer(modifier =  Modifier.width(170.dp))
           IconButton(onClick = {}, modifier = Modifier.size(48.dp,48.dp))
           {

               Image(painter = painterResource(id = R.drawable.avatar), contentDescription =" @name", modifier =Modifier.size(48.dp,48.dp) )
           }
       }
       Row(modifier = Modifier.padding(24.dp,69.dp,24.dp,0.dp))
       {

               Card(elevation = 10.dp, shape = Shapes.small,backgroundColor = colorResource(id = R.color.Asssa), modifier = Modifier.size(350.dp,71.dp))  {
                   Column()
                   {
                      Row()
                      {
                          Text(text = "Вечерний поход в кино", modifier = Modifier.padding(16.dp,6.dp,0.dp,0.dp), color = Color.White, fontSize = 16.sp)
                          Text(text = "10.02.2021", modifier = Modifier.padding(67.dp,6.dp,8.dp,0.dp),color = Color.White, fontSize = 11.sp)
                      }
                       Row()
                       {
                           Text(text = "Идем в кино с коллегами!", modifier = Modifier.padding(16.dp,6.dp,0.dp,0.dp),color = Color.White,fontSize = 11.sp)
                           Text(text = "19:40", modifier = Modifier.padding(110.dp,0.dp,8.dp,0.dp),color = Color.White,fontSize = 11.sp)
                       }
                   }


               }




       
       }
      Row(modifier = Modifier.padding(24.dp,16.dp,24.dp,0.dp))
      {
          Card(elevation = 10.dp, shape = Shapes.small,backgroundColor = colorResource(id = R.color.Asssa), modifier = Modifier.size(350.dp,71.dp))  {
              Column()
              {
                  Row()
                  {
                      Text(text = "Забрать заказ Ozon", modifier = Modifier.padding(16.dp,6.dp,0.dp,0.dp), color = Color.White, fontSize = 16.sp)
                      Text(text = "10.02.2021", modifier = Modifier.padding(94.dp,0.dp,0.dp,0.dp),color = Color.White, fontSize = 11.sp)
                  }
                  Row()
                  {
                      Text(text = "Пункт выдачи на ул. Ленина, 103", modifier = Modifier.padding(16.dp,6.dp,0.dp,0.dp),color = Color.White,fontSize = 11.sp)
                      Text(text = "19:40", modifier = Modifier.padding(79.dp,0.dp,0.dp,0.dp),color = Color.White,fontSize = 11.sp)
                  }
              }


          }
      }
      Row(modifier = Modifier.padding(24.dp,16.dp,24.dp,0.dp))
      {
          Card(elevation = 10.dp, shape = Shapes.small,backgroundColor = colorResource(id = R.color.Asssa), modifier = Modifier.size(350.dp,71.dp))  {
              Column()
              {
                  Row()
                  {
                      Text(text = "Запись в автосервис", modifier = Modifier.padding(16.dp,6.dp,0.dp,0.dp), color = Color.White, fontSize = 16.sp)
                      Text(text = "10.02.2021", modifier = Modifier.padding(86.dp,0.dp,0.dp,0.dp),color = Color.White, fontSize = 11.sp)
                  }
                  Row()
                  {
                      Text(text = "Сдать автомобиль в автосервис на ул.\n Бисертская, д. 14. Замена масла"
                              , modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp),color = Color.White,fontSize = 11.sp)
                      Text(text = "19:40", modifier = Modifier.padding(51.dp,0.dp,0.dp,0.dp),color = Color.White,fontSize = 11.sp)
                  }
              }


          }
      }
      Row(modifier = Modifier.padding(48.dp,76.dp,24.dp,0.dp))
      {
         Button(onClick = {}, shape = Shapes.medium ,colors = ButtonDefaults.buttonColors(colorResource(id =R.color.Button )) ,modifier = Modifier.size(312.dp,48.dp))
          {

              Text(text = "Добавить задачу", color = Color.White,fontSize = 18.sp)
              
          }
      }
      Row(modifier = Modifier.padding(48.dp,60.dp,0.dp,0.dp))
      {
          Card(elevation = 10.dp, shape = Shapes.large,backgroundColor = colorResource(id = R.color.Button), modifier = Modifier.size(312.dp,72.dp)) {
            Column()
            {
                Card(elevation = 0.dp,modifier =Modifier.padding(30.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                {
                       IconButton(onClick = {}, modifier = Modifier.size(40.dp,40.dp))
                       {

                          Image(painter = painterResource(id = R.drawable.maskgroup), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                       }



                }
                Text(text = "List", modifier = Modifier.padding(43.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.Back), fontSize = 11.sp
                )
            }
              Column()
              {
                  Card(elevation = 0.dp,modifier =Modifier.padding(100.dp,15.dp,0.dp,0.dp), backgroundColor = Color.Unspecified)
                  {
                      IconButton(onClick = {context.startActivity(Intent(context,AlarmActivity::class.java))}, modifier = Modifier.size(40.dp,40.dp))
                      {

                          Image(painter = painterResource(id = R.drawable.maskalarm), contentDescription =" @name", modifier =Modifier.size(40.dp,40.dp) )
                      }



                  }
                  Text(text = "Alarm", modifier = Modifier.padding(106.dp,0.dp,0.dp,0.dp), color = colorResource(id =R.color.Alarm), fontSize = 11.sp
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
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}