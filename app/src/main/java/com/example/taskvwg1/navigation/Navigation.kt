package com.example.taskvwg1.navigation

import kotlinx.serialization.Serializable


@Serializable
object TaskList


@Serializable
data class TaskDetail(val taskId: Int)