package com.hotwater.justdoit.domain.repository

import com.hotwater.justdoit.data.TaskDao
import com.hotwater.justdoit.domain.model.Task
import javax.inject.Inject

class TaskRepository @Inject constructor(private val taskDao: TaskDao) {

    /** Create */

    suspend fun createTask(task: Task) =
        taskDao.createTask(task)


    /** Read */

    suspend fun getAllTasks(): List<Task> =
        taskDao.getAllTasks()

    suspend fun getDoneTasks(): List<Task> =
        taskDao.getDoneTasks()

    suspend fun getPendingTasks(): List<Task> =
        taskDao.getPendingTasks()

    suspend fun getTask(id: Long): Task =
        taskDao.getTask(id)


    /** Update */

    suspend fun updateTask(task: Task) =
        taskDao.updateTask(task)


    /** Delete */

    suspend fun deleteTask(task: Task) =
        taskDao.deleteTask(task)

    suspend fun deleteAllTasks() =
        taskDao.deleteAllTasks()
}