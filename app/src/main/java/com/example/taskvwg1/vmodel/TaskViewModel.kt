package com.example.taskvwg1.vmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.taskvwg1.model.Task
import androidx.compose.runtime.setValue

class TaskViewModel: ViewModel() {

    private val repository = repository()
    var tasks by mutableStateOf(listOf<Task>())
       private set

    var id by mutableStateOf("")
       private set

    var description by mutableStateOf( "")
        private set

    var title by mutableStateOf("")
        private set

    var isCompleted by mutableStateOf( false)
        private set

    init{
        loadTask()
    }

    fun loadTask(){
        tasks = repository.getTasks()

    }

    fun clearForm() {
        id = ""
        title = ""
        description = ""
        isCompleted = false
    }

    fun addTasks(){
        repository.addTask(Task(
            id.toInt()
            ,title
            ,description
            ,isCompleted
        ))
        loadTask()
    }

    fun deleteTask(task: Task){
        repository.deleteTask(task)
        loadTask()
    }

    fun updateTask(task: Task){
        repository.updateTask(task)
        loadTask()
    }

    fun onTitleChange(value: String){
        id = value
    }
    fun onDescriptionChange(value: String){
        description = value
    }

    fun onIsCompletedChange(value: Boolean){
        isCompleted = value
    }
}