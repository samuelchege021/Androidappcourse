package com.samuel.mvvmandroid.navigation

import IntentScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.samuel.mvvmandroid.ui.theme.screens.Log.LogScreen
import com.samuel.mvvmandroid.ui.theme.screens.Reg.RegScreen


import com.samuel.mvvmandroid.ui.theme.screens.home.HomeScreen
import com.samuel.mvvmandroid.ui.theme.screens.login.LoginScreen
import com.samuel.mvvmandroid.ui.theme.screens.Register.RegisterScreen
import com.samuel.mvvmandroid.ui.theme.screens.SimpleList.SimpleList
import com.samuel.mvvmandroid.ui.theme.screens.Splash.SplashScreen
import com.samuel.mvvmandroid.ui.theme.screens.calculator.CalculatorScreen
import com.samuel.mvvmandroid.ui.theme.screens.index.IndexScreen
import com.samuel.mvvmandroid.ui.theme.screens.product.AddProductsScreen
import com.samuel.mvvmandroid.ui.theme.screens.product.UpdateProductsScreen
import com.samuel.mvvmandroid.ui.theme.screens.product.ViewProductsScreen
import com.samuel.mvvmandroid.ui.theme.screens.product.ViewUploadsScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,navController: NavHostController=rememberNavController(),startDestination: String= Route_SplashScreen)
{




    NavHost(navController = navController,modifier=modifier, startDestination = startDestination ){

        composable(Route_home){
            HomeScreen(navController)
        }
        composable(Route_register){
            RegisterScreen(navController)
        }
        composable(Route_login){
            LoginScreen(navController)


        }


        composable(Route_Calculator){
            CalculatorScreen(navController)



        }

        composable(Route_Intent){
            IntentScreen(navController)
        }



        composable(Route_SimpleList){
            SimpleList()
        }

        composable(Route_SplashScreen){
            SplashScreen(navController)
        }

        composable(Route_Registerr){
            RegScreen(navController)
        }


        composable(Route_log){
            LogScreen(navController)



        }

        composable(Route_index){
            IndexScreen(navController)



        }



        composable(Route_add_product) {
            AddProductsScreen(navController  )


        }




        composable(Route_Update_product+ "/{id}"){ passedData ->
            UpdateProductsScreen(navController,passedData.arguments?.getString("id")!!)
        }
        composable(Route_view_upload){
            ViewUploadsScreen(navController)
        }



        composable(Route_view_product){
            ViewProductsScreen(navController)
        }
    }
        }








