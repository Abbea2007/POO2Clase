package com.example.taskvmg1.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.taskvwg1.navigation.TaskDetail
import com.example.taskvwg1.navigation.TaskList

@Composable
fun AppNavigation()
{
    val navController = rememberNavController()

    NavHost (navController = navController,
        startDestination = TaskList
    )

    {
        composable<TaskList>{
            TaskListScreen(navController)

        }
        composable<TaskDetail> {backStackEntry ->
            val taskId = backStackEntry.toRoute<TaskDetail>()
            TaskDetailScreen(navController,taskId)
        }

    }
}