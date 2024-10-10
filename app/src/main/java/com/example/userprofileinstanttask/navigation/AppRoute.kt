package com.example.userprofileinstanttask.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.userprofileinstanttask.screen.HomeScreen
import com.example.userprofileinstanttask.screen.SecondProfileScreen
import com.example.userprofileinstanttask.screen.SecondProfileScreenPreview
import com.example.userprofileinstanttask.screen.UserProfileScreen

object Route{
    const val HOME = "home"
    const val PROFILE = "profile"
    const val SECOND_PROFILE = "second_profile"
}

@Composable
fun AppNavHost(){
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination = Route.HOME) {
        composable(route=Route.HOME){
            HomeScreen(navController)
        }
        composable(route="second_profile/{name}/{image}"
        , arguments = listOf(
            navArgument("name"){type = NavType.StringType},
            navArgument("image"){type = NavType.IntType}
        )
        ){backStackEntry->
            val name = backStackEntry.arguments?.getString("name")
            val image = backStackEntry.arguments?.getInt("image")
            SecondProfileScreen(name,image)
        }
    }
}