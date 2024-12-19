package com.olegkos.serialdecoder

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.olegkos.serialdecoder.core.nav.NavigationHost
import com.olegkos.serialdecoder.ui.theme.SerialDecoderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    enableEdgeToEdge()
        setContent {
            SerialDecoderApp()
        }
    }
}


@Composable
fun SerialDecoderApp(modifier: Modifier = Modifier) {
    SerialDecoderTheme {
        NavigationHost()
    }
}


