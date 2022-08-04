package com.example.appproject.ui.project

import android.app.Activity
import android.os.IInterface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.appproject.R

class ProjectAdapter(
    private val activity: Activity,
    private val projectList: MutableList<ProjectViewModel.Project> = mutableListOf(),
    private val projectLinkCallback : (String) -> Unit
) : RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder>() {


    fun addData(list : MutableList<ProjectViewModel.Project>) {
        projectList.addAll(list)
    }


    fun isEmpty() : Boolean = projectList.isEmpty()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.project_item, parent, false)
        return ProjectViewHolder(view)
    }


    override fun onBindViewHolder(holder: ProjectViewHolder, position: Int) {
        val project = projectList[position]
        val projectLink = project.link
        holder.projectTitle.text = project.title
        holder.projectDescribe.text = project.desc
        holder.projectDate.text = project.niceDate
        holder.projectAuthor.text = project.author
        Glide.with(activity).load(project.envelopePic).into(holder.projectPic)

        holder.projectItem.setOnClickListener {
            projectLinkCallback(projectLink)
        }
    }


    override fun getItemCount(): Int {
        return projectList.size
    }


    class ProjectViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val projectTitle: TextView = view.findViewById(R.id.project_title)
        val projectDescribe: TextView = view.findViewById(R.id.project_describe)
        val projectAuthor: TextView = view.findViewById(R.id.project_author)
        val projectDate: TextView = view.findViewById(R.id.project_date)
        val projectPic: ImageView = view.findViewById(R.id.project_image)
        val projectItem: ConstraintLayout = view.findViewById(R.id.project_item_view)
    }
}