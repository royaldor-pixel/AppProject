package com.example.appproject.ui.project

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.appproject.R
import com.example.appproject.data.db.ProjectDatabase
import com.example.appproject.data.repositories.MyProjectRepository

class ProjectFragment : Fragment() {
    private lateinit var projectAdapter: ProjectAdapter
    private lateinit var progressbar: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        projectAdapter = ProjectAdapter(requireActivity()) {
        }
        return inflater.inflate(R.layout.fragment_project, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val projectDatabase = ProjectDatabase(requireActivity())
        val projectRepository = MyProjectRepository(projectDatabase)
        val factory = ProjectViewModelFactory(projectRepository)
        val projectViewModel = ViewModelProvider(requireActivity(),factory)[ProjectViewModel::class.java]

        super.onViewCreated(view, savedInstanceState)
    }
}