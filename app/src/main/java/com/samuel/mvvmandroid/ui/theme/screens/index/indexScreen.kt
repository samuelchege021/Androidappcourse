package com.samuel.mvvmandroid.ui.theme.screens.index
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import com.samuel.mvvmandroid.navigation.Route_add_product
import com.samuel.mvvmandroid.navigation.Route_view_product


import com.samuel.mvvmandroid.navigation.Route_view_upload


@Composable
fun IndexScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Red),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context= LocalContext.current
//        var productdata=productviewmodel(navController,context)

        Text(text = "Welcome to Home page",
            color = Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick =  { navController.navigate(Route_add_product)

        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Add Productfff")
        }
        Spacer(modifier = Modifier.height(100.dp))



        Button(onClick = { navController.navigate(Route_view_upload)

        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "Upload Product")
        }
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = { navController.navigate(Route_view_product)

        },modifier = Modifier.fillMaxWidth()) {
            Text(text = "View Products")
        }


    }



}

@Preview
@Composable
fun Homepreview() {
    IndexScreen(rememberNavController())
}