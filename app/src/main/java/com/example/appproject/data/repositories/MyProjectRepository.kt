package com.example.appproject.data.repositories

import com.example.appproject.data.db.ProjectDatabase
import com.example.appproject.data.db.entities.ProjectItem

class MyProjectRepository(
    private val projectDatabase: ProjectDatabase
) {
    suspend fun upsert(item: ProjectItem) = projectDatabase.getProjectDao().upsert(item)

    suspend fun delete(item: ProjectItem) = projectDatabase.getProjectDao().delete(item)

    fun getAllProjectItems() = projectDatabase.getProjectDao().getAllProjectItems()
}