package com.example.appproject.ui.project

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.wanandroidapi.NetData
import com.example.wanandroidapi.NetResult
import com.example.wanandroidapi.repository.ProjectRepository


class ProjectViewModel : ViewModel() {
    private val _projectData = MutableLiveData<ProjectData>()
    private val _projectCategory = MutableLiveData<ProjectCategoryData>()
    val projectData: LiveData<ProjectData> = _projectData
    val projectCategory: LiveData<ProjectCategoryData> = _projectCategory


//    private fun getProjectCategory() {
//        ProjectRepository.getProjectsCategory(object : NetResult<ProjectCategoryData> {
//            override fun onResult(netData: NetData<ProjectCategoryData>) {
//                if (netData.errorCode == 0) {
//                    Log.d("category", netData.data.toString())
//                    netData.data?.let {
//                        projectCategory.postValue(it)
//                    }
//                }
//            }
//        })
//    }

    private fun getProjectResponse() {
        ProjectRepository.getProjectList(1, 294, object : NetResult<ProjectData> {
            override fun onResult(netData: NetData<ProjectData>) {
                if (netData.errorCode == 0) {
                    netData.data?.let {
                        _projectData.postValue(it)
                    }
                }
            }
        })
    }

    data class ProjectCategoryData(
        val data: List<ProjectCategory>
    )

    data class ProjectCategory(
        val name: String,
        val id: Int,
    )

    data class ProjectData(
        val curPage: Int,
        val datas: MutableList<Project>,
        val pageCount: Int,
        val size: Int
    )

    data class Project(
        val author: String,
        val chapterId: Int,         //cid
        val title: String,
        val desc: String,
        val envelopePic: String,
        val link: String,
        val niceDate: String
    )

    fun onRefresh() {
        getProjectResponse()
    }
}