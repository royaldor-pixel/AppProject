package com.example.appproject.ui.project

import com.example.wanandroidapi.NetData
import com.example.wanandroidapi.NetResult
import com.example.wanandroidapi.repository.ProjectRepository
import io.mockk.*
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.impl.stub.StubRepository
import kotlinx.coroutines.runBlocking
import net.bytebuddy.matcher.ElementMatchers.any
import org.junit.After
import org.junit.Before
import org.junit.Test

class ProjectViewModelTest {
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
        projectRepository.getProjectList(0,0, object : NetResult<ProjectViewModel.ProjectData> {
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