package com.example.appproject.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity


@Entity(tableName = "project_items")
data class ProjectItem(
    @ColumnInfo(name = "author")
    var author: String,
    @ColumnInfo(name = "title")
    var title: String,
    val chapterId: Int,         //cid
    val desc: String,
    val envelopePic: String,
    val link: String,
    val niceDate: String
)