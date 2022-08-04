package com.example.appproject.ui.project

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.appproject.R

@SuppressLint("NotifyDataSetChanged")

class ProjectFragment : Fragment() {
    private val projectViewModel = ProjectViewModel()
    private lateinit var projectAdapter: ProjectAdapter
    private lateinit var progressbar: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        projectAdapter = ProjectAdapter(requireActivity()) {
            onReplaceFragment(it)
        }
        return inflater.inflate(R.layout.fragment_project, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val projectSwipeRefreshLayout = view.findViewById<SwipeRefreshLayout>(R.id.project_refresh)
        val projectRecyclerView = view.findViewById<RecyclerView>(R.id.project_recycler_view)
//        val projectCategoryTabLayout =
//            view.findViewById<TabLayout>(R.id.project_category_tab_layout)
        projectRecyclerView.layoutManager = LinearLayoutManager(requireActivity())
        progressbar = view.findViewById(R.id.progress)

        //添加观察者
        projectViewModel.projectData.observe(requireActivity()) {
            progressbar.visibility = View.GONE
            projectAdapter.addData(it.datas)
            projectRecyclerView.adapter?.notifyDataSetChanged()
        }
        projectViewModel.projectCategory.observe(requireActivity()) {

        }

        projectRecyclerView.adapter = projectAdapter


        //下拉刷新
        projectSwipeRefreshLayout.setOnRefreshListener {
            projectViewModel.onRefresh()
            projectSwipeRefreshLayout.isRefreshing = false
//            projectRecyclerView.adapter?.notifyDataSetChanged()
        }

        initData()

        super.onViewCreated(view, savedInstanceState)
    }

    private fun onReplaceFragment(url: String) {
        parentFragmentManager
            .beginTransaction()
            .replace(R.id.main_activity_fragment_container, ProjectDetailFragment(url))
            .addToBackStack(url)
            .commit()
    }


    private fun initData() {
        if (projectAdapter.isEmpty()) {
            progressbar.visibility = View.VISIBLE
        }
        projectViewModel.onRefresh()
    }
}