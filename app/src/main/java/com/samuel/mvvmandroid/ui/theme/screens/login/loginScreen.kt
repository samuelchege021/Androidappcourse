package com.samuel.mvvmandroid.ui.theme.screens.login

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.TopAppBar


import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.samuel.mvvmandroid.navigation.Route_register
import com.samuel.mvvmandroid.ui.theme.screens.home.BottomBar
import com.samuel.mvvmandroid.ui.theme.screens.home.Topbar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun LoginScreen(navController: NavHostController) {

    Scaffold(
        topBar = { Topbar()},


        content = {


            var email by  remember { mutableStateOf("") }
            var password by  remember { mutableStateOf("") }
            var islogin by  remember { mutableStateOf("true") }
            Column (horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement=Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
            ){

                Text(text = "login here",
                    color=Color.Red,
                    fontSize=25.sp,
                    fontFamily = FontFamily.SansSerif
                )





                OutlinedTextField(value = email, onValueChange ={email=it},
                    label={Text(text="email")},
                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp))


                OutlinedTextField(value = password, onValueChange ={password=it},
                    label={Text(text="password")},
                    modifier= Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp))



                Button(onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth()) {
                    Text(text="login")

                }
                Button(onClick = { navController.navigate(Route_register) },
                    modifier = Modifier.fillMaxWidth()) {
                    Text(text="Dont have account register?register")

                }

            }},
        bottomBar = { BottomBar(navController) }
                            )










}






@Preview
@Composable
private fun Loginprev() {
    LoginScreen(rememberNavController())
    
}