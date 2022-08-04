package com.example.appproject.ui.project

import com.example.wanandroidapi.NetData
import com.example.wanandroidapi.NetResult
import com.example.wanandroidapi.repository.ProjectRepository
import io.mockk.*
import io.mockk.impl.annotations.MockK
import junit.framework.TestCase
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

class ProjectViewModelTest :TestCase() {
    @MockK
    lateinit var projectViewModel: ProjectViewModel
    lateinit var projectRepository: ProjectRepository

    @Before
    fun testInit() {
        println("----------------------TEST BEGIN----------------------")
        projectViewModel = ProjectViewModel()
        projectRepository = ProjectRepository
        MockKAnnotations.init(this)
    }

    @Test
    fun `What if the data is null`() {
        val result = projectRepository.getProjectList(0,0, object : NetResult<ProjectViewModel.ProjectData> {
            override fun onResult(netData: NetData<ProjectViewModel.ProjectData>) {
                if (netData.errorCode == 0) {
                    netData.data?.let {
                    }
                }
            }
        })


    }

    @After
    fun testDone() {
        println("----------------------TEST DONE-----------------------")
    }
}