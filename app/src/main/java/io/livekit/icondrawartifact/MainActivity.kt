package io.livekit.icondrawartifact

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.livekit.icondrawartifact.ui.theme.IconDrawArtifactTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IconDrawArtifactTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                    var alternate by remember { mutableStateOf(true) }
                    val resId = if (alternate) R.drawable.ic_bell else R.drawable.ic_speaker
                    Button(
                        onClick = { alternate = !alternate },
                        modifier = Modifier.size(44.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = resId),
                            contentDescription = "",
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IconDrawArtifactTheme {
        Greeting("Android")
    }
}
