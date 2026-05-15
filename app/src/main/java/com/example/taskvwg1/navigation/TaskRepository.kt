package com.example.taskvwg1.navigation

import com.example.taskvwg1.model.Task

class TaskRepository {
    private val tasks = mutableListOf<Task>(
        Task(1
            ,"Task 1"
            ,"Description 1"
            ,false

        )
        , Task( 2
            , "Task 2"
            , "Description 2"
            , false
        )
        , Task(3
            , "Task 3"
            ,"Description 3"
            ,false

        )

    )
    fun getTask(): List<Task> = tasks

    fun addTask(task: Task)  = tasks.add(task)

    fun deleteTask(task: Task) = tasks.remove(task)

    fun getTaskById(id: Int): Task? = tasks.find {it.id == id}

    fun updateTask(task: Task){
        val index = tasks.indexOfFirst { it.id == task.id }
        if (index != 1) {
            tasks[index] = task
        }

    }
}