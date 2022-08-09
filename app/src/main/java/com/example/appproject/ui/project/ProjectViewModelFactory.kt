package com.example.appproject.ui.project

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appproject.data.repositories.MyProjectRepository

@Suppress("UNCHECKED_CAST")
class ProjectViewModelFactory(
    private val projectRepository: MyProjectRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProjectViewModel(projectRepository) as T
    }
}