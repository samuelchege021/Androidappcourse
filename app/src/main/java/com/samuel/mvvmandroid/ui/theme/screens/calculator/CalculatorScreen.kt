package com.samuel.mvvmandroid.ui.theme.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField


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

import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun CalculatorScreen(navController: NavHostController) {
var firstno by remember { mutableStateOf(TextFieldValue("")) }
 var secondno by remember { mutableStateOf(TextFieldValue("")) }
  var answer by  remember { mutableStateOf("") }

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)) {

           Spacer(modifier = Modifier.height(50.dp))
            Text(text=answer,

                color=Color.Blue,
                fontSize = 30.sp)



            OutlinedTextField(value =firstno , label={Text(text="firstno",color=Color.White, fontSize = 30.sp)},

                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

                onValueChange = {firstno=it})






            Spacer(modifier=Modifier.height(50.dp))



            OutlinedTextField(value =secondno , label={Text(text="secondno",color=Color.White, fontSize = 30.sp)},

        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

    onValueChange = {secondno=it})


    OutlinedTextField(value = answer,label={Text(text="Answer", fontFamily = FontFamily.SansSerif)} ,onValueChange = {answer=it})

OutlinedButton(onClick = { val myfirstno=firstno.text.trim()
    val mysecondno=secondno.text.trim()
    if (myfirstno.isEmpty() ||mysecondno.isEmpty()){
        answer="Please fill in all detail"
    }else{
        val myanswer=myfirstno.toDouble() + mysecondno.toDouble()
        answer=myanswer.toString() }},

    colors=ButtonDefaults.buttonColors(Color.Blue),
    shape= RoundedCornerShape(16.dp),
    modifier = Modifier.fillMaxWidth()
) {



    Text(text = "+",
    fontSize=30.sp)
}
            OutlinedButton(onClick = { val myfirstno=firstno.text.trim()
                val mysecondno=secondno.text.trim()
                if (myfirstno.isEmpty() ||mysecondno.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstno.toDouble() - mysecondno.toDouble()
                    answer=myanswer.toString() }},

                colors=ButtonDefaults.buttonColors(Color.Blue),
                shape= RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {



                Text(text = "_",
                    fontSize=30.sp)
            }



            OutlinedButton(onClick = { val myfirstno=firstno.text.trim()
                val mysecondno=secondno.text.trim()
                if (myfirstno.isEmpty() ||mysecondno.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstno.toDouble() * mysecondno.toDouble()
                    answer=myanswer.toString() }},

                colors=ButtonDefaults.buttonColors(Color.Blue),
                shape= RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {



                Text(text = "*",
                    fontSize=30.sp)
            }


            OutlinedButton(onClick = { val myfirstno=firstno.text.trim()
                val mysecondno=secondno.text.trim()
                if (myfirstno.isEmpty() ||mysecondno.isEmpty()){
                    answer="Please fill in all detail"
                }else{
                    val myanswer=myfirstno.toDouble() /mysecondno.toDouble()
                    answer=myanswer.toString() }},

                colors=ButtonDefaults.buttonColors(Color.Blue),
                shape= RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {



                Text(text = "/",
                    fontSize=30.sp)
            }




        }

    }

@Preview
@Composable
private fun Calculator() {
    CalculatorScreen(rememberNavController())
    
}





