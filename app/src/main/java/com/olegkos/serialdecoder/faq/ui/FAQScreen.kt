package com.olegkos.serialdecoder.faq.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FAQScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(),
    ){
        Text(text = "faq")
    }
}