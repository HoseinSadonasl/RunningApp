package com.hoseinsadonasl.runningapp.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(
    entities = [RunDao::class],
    version = 1
)
@TypeConverters(Convertors::class)
abstract class RunDatabase : RoomDatabase() {

    abstract fun getRunDao(): RunDao

}