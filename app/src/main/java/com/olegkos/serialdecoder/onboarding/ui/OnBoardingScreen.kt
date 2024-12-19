package com.olegkos.serialdecoder.onboarding.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.olegkos.serialdecoder.core.nav.Route

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(),
    ){
        Text(text = "onboarding")
    }
}