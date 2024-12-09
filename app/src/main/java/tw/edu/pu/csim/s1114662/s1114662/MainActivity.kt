package tw.edu.pu.csim.s1114662.s1114662

import android.app.Activity
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.animation.Animation
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContentTransitionScope.SlideDirection.Companion.Start
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import tw.edu.pu.csim.s1114662.s1114662.ui.theme.S1114662Theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S1114662Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT)
                    Start(m = Modifier.padding(innerPadding))
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                }
            }
        }
    }
}
@Composable

fun Start(m: Modifier){
    val activity = (LocalContext.current as? Activity)
    Box (
        modifier = Modifier.fillMaxSize().background(Color(0xff95fe95)).then(m),
        contentAlignment = Alignment.TopCenter ,
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // 顯示文字
            Text(
                text = "2024期末上機考(資管三B毛姿云)"
            )
            // 顯示圖片
            Image(
                painter = painterResource(id = R.drawable.class_b),
                contentDescription = null,
                modifier = Modifier
            )
            Text(
                text = "遊戲持續時間 0 秒",
            )
            Text(
                text = "您的成績 0 分",
            )
            Button(
                onClick = {
                    activity?.finish()
                }
            ) {
                Text("結束App")
            }
        }
    }
}
/*
@Composable
fun Animation() {
    var appear by remember { mutableStateOf(true) } //背景出現
    var expanded by remember { mutableStateOf(true) } //背景延展

    Column(
        Modifier.background(Color(0xff95fe95))
    ) {
    }

    Column {


        Image(
            painter = painterResource(id = R.drawable.class_b),
            contentDescription = "星空背景圖"
        )
        Button(
            onClick = { appear = !appear }
        ) {
            if (appear) Text(text = "星空背景圖消失")
            else Text(text = "星空背景圖出現")
        }
    }
}
*/


/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S1114662Theme {
        Greeting("Android")
    }
}*/