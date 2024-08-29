package com.samuel.mvvmandroid.ui.theme.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.IconButton


//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person


import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontFamily.Companion.SansSerif
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.samuel.mvvmandroid.R
import com.samuel.mvvmandroid.navigation.Route_Calculator
import com.samuel.mvvmandroid.navigation.Route_Intent

import com.samuel.mvvmandroid.navigation.Route_login

import com.samuel.mvvmandroid.navigation.Route_register

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(navController: NavHostController) {

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "welcome to my page",color=Color.White, fontSize = 25.sp)})      },

        content = {

            Column(modifier= Modifier
                .fillMaxSize()
                .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top) {
                Spacer(modifier = Modifier.height(50.dp))
                Image(
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp),
                    contentScale = ContentScale.None,
                    painter = painterResource(id = R.drawable.img20240312110324),
                    contentDescription = "my image"
                )
                Text(
                    text = "Samuel APP",
                    color = Color.Cyan,
                    fontSize = 30.sp,
                    fontFamily = SansSerif
                )
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "This is my first app",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif
                )

                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "welcome to the android course",
                    color = Color.White,
                    fontSize = 20.sp,
                    fontFamily = FontFamily.Serif

                )
                Spacer(modifier = Modifier.height(50.dp))
                Button(
                    onClick = { navController.navigate(Route_login) },
                    modifier = Modifier.width(150.dp)
                ) {


                    Text(
                        text = "login",
                        color = Color.Red,
                    )


                }



                Button(
                    onClick = { navController.navigate(Route_register) },
                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(

                        Color.Blue,
                        contentColor = Color.White
                    ),

                    shape = CircleShape


                )


                {


                    Text(
                        text = "register",

                        )


                }



                Button(
                    onClick = { navController.navigate(Route_Calculator) },

                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue, contentColor = Color.White),
                    shape = CircleShape
                )
                {
                    Text(text = "calculator")


                }




                Button(
                    onClick = { navController.navigate(Route_Intent) },

                    modifier = Modifier.width(150.dp),
                    colors = ButtonDefaults.buttonColors(Color.Blue, contentColor = Color.White),
                    shape = CircleShape
                )
                {
                    Text(text = "Intent")


                }


            }},
        bottomBar = { BottomBar(navController)}
                            )


}


@Composable
fun Topbar() {
    TopAppBar(title = {Text(text="welcome to my app",color=Color.White, fontSize = 25.sp)})
}

@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    (BottomNavigation(elevation = 10.dp,
        modifier = Modifier.windowInsetsPadding(WindowInsets.systemBars)
        ) {
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0
                navController.navigate(Route_login)
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite, "")
        },
            label = { Text(text = "Favorite") },
            selected = (selectedIndex.value == 1),
            onClick = {
                selectedIndex.value = 1
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") },
            selected = (selectedIndex.value == 2),
            onClick = {
                selectedIndex.value = 2

            })
    })
}







@Preview
@Composable
private fun Homeprev() {
    HomeScreen(rememberNavController())

}


