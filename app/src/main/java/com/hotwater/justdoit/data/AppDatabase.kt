package com.hotwater.justdoit.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hotwater.justdoit.domain.model.Task

@Database(
    entities = [Task::class],
    exportSchema = false,
    version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun taskDao(): TaskDao
}