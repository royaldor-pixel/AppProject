package com.example.appproject.ui.project

import androidx.lifecycle.ViewModel
import com.example.appproject.data.db.entities.ProjectItem
import com.example.appproject.data.repositories.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class ProjectViewModel(private val projectRepository: MyProjectRepository) : ViewModel() {
    fun upsert(item: ProjectItem) = CoroutineScope(Dispatchers.Main).launch {
        projectRepository.upsert(item)
    }

    fun delete(item: ProjectItem) = CoroutineScope(Dispatchers.Main).launch {
        projectRepository.delete(item)
    }

    fun getAllProjectItems() = projectRepository.getAllProjectItems()
}