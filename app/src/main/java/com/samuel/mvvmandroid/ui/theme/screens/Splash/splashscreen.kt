package com.samuel.mvvmandroid.ui.theme.screens.Splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.navigation.NavHostController

import kotlinx.coroutines.delay
import androidx.compose.ui.unit.dp
import com.samuel.mvvmandroid.R
import com.samuel.mvvmandroid.navigation.Route_home
import com.samuel.mvvmandroid.navigation.Route_index

@Composable
fun SplashScreen(navController: NavHostController) {

    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate(Route_index)
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "Splash Login",
            modifier = Modifier.size(200.dp)
        )
    }
}