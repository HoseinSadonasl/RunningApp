package com.hoseinsadonasl.runningapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface RunDao {

    @Insert
    suspend fun InsertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM running_table ORDER By timestamp")
    fun getAllRunsSortedByTimestamp(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER By timeInMillis")
    fun getAllRunsSortedByTimeInMiLLIS(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER By distanceInMetric")
    fun getAllRunsSortedByDistanc(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER By avgSpeedKMH")
    fun getAllRunsSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("SELECT * FROM running_table ORDER By caloriesBurned")
    fun getAllRunsSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("SELECT SUM(caloriesBurned) FROM running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("SELECT SUM(distanceInMetric) FROM running_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT SUM(avgSpeedKMH) FROM running_table")
    fun getTotalAvgSpeed(): LiveData<Float>


}





