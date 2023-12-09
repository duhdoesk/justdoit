package com.hotwater.justdoit.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.hotwater.justdoit.domain.model.Task

@Dao
interface TaskDao {

    /** Create */

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createTask(task: Task)


    /** Read */

    @Query("SELECT * from tasks_table")
    suspend fun getAllTasks(): List<Task>

    @Query("SELECT * from tasks_table where is_done = 1")
    suspend fun getDoneTasks(): List<Task>

    @Query("SELECT * from tasks_table where is_done = 0")
    suspend fun getPendingTasks(): List<Task>

    @Query("SELECT * from tasks_table where id=:id")
    suspend fun getTask(id: Long): Task


    /** Update */

    @Update
    suspend fun updateTask(task: Task)


    /** Delete */

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("DELETE from tasks_table")
    suspend fun deleteAllTasks()
}