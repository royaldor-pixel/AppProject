package com.example.appproject.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.appproject.data.db.entities.ProjectItem

interface ProjectDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ProjectItem)

    @Delete
    suspend fun delete(item: ProjectItem)

    @Query("SELECT * FROM project_items")
    fun getAllProjectItems(): LiveData<List<ProjectItem>>
}