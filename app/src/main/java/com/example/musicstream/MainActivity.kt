package com.example.musicstream

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicstream.ui.theme.MusicStreamTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MusicStreamTheme {
                    Music()
                }
            }
        }
    }

@Composable
fun Music(){
    Column {
        TopBar()
        MyApp()
        Trendng()
        Recent()
        Bottom()
    }

}
@Composable
fun TopBar(){
    Row(modifier = Modifier.padding(15.dp)) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .padding(vertical = 20.dp)
                .size(50.dp)
        )
        Text(
            text = "Music Streaming",
            color = Color.Blue,
            fontSize = 25.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(vertical = 22.dp)
        )

            Image(
                painter = painterResource(id = R.drawable.search),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 40.dp, horizontal = 20.dp)
            )


            Image(
                painter = painterResource(id = R.drawable.menu),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 40.dp, horizontal = 20.dp)
            )


    }
}

@Composable
fun MyApp() {
    Row (modifier = Modifier.padding(20.dp)){
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "songs")
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "Genre")
        }
        Button(
            onClick = { /* Handle button click */ },
            modifier = Modifier
                .padding(10.dp)
        ) {
            Text(text = "Favourite")
        }
    }

}
@Composable
fun Trendng(){
    Column {
        Text(
            text = "Trending Songs",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif
        )
        Row {
            Image(
                painter = painterResource(id = R.drawable.at1),
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .size(70.dp)
            )
            Text(
                text = "MT_manando_Yearo_Awida",
                modifier = Modifier.padding(25.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.mee),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 25.dp)
            )
        }
        Row {
            Image(
                painter = painterResource(id = R.drawable.at2),
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .size(70.dp)
            )
            Text(
                text = "MT_manando_Yearo_Awida",
                modifier = Modifier.padding(25.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.mee),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 25.dp)
            )
        }

        Row {
            Image(
                painter = painterResource(id = R.drawable.at3),
                contentDescription = null,
                modifier = Modifier
                    .padding(5.dp)
                    .size(70.dp)
            )
            Text(
                text = "MT_manando_Yearo_Awida",
                modifier = Modifier.padding(25.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.mee),
                contentDescription = null,
                modifier = Modifier.padding(vertical = 25.dp)
            )
        }
    }
}
@Composable
fun Recent(){
        Column {
            Text(
                text = "Recent played",
                color = Color.Blue,
                fontFamily = FontFamily.SansSerif
            )
            Row {
                Image(
                    painter = painterResource(id = R.drawable.art4),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(70.dp)
                )
                Text(
                    text = "MT_manando_Yearo_Awida",
                    modifier = Modifier.padding(25.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.mee),
                    contentDescription = null,
                    modifier = Modifier.padding(vertical = 25.dp)
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.at5),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(70.dp)
                )
                Text(
                    text = "MT_manando_Yearo_Awida",
                    modifier = Modifier.padding(25.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.mee),
                    contentDescription = null,
                    modifier = Modifier.padding(vertical = 25.dp)
                )
            }
            Row {
                Image(
                    painter = painterResource(id = R.drawable.at6),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(70.dp)
                )
                Text(
                    text = "MT_manando_Yearo_Awida",
                    modifier = Modifier.padding(25.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.mee),
                    contentDescription = null,
                    modifier = Modifier.padding(vertical = 25.dp)
                )
            }

        }

}
@Composable
fun Bottom(){
    Row {
        Image(
            painter = painterResource(id = R.drawable.home),
            contentDescription = null,
            modifier = Modifier.padding(horizontal =30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.playlist),
            contentDescription = null,
            modifier = Modifier.padding( horizontal = 30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.account),
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 30.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.settings),
            contentDescription = null,
            modifier = Modifier.padding(horizontal = 30.dp)
        )
    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MusicStreamTheme {
        Music()
    }
}