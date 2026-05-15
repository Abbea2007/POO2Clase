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
            false

        )

    )
}