package com.example.appproject.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson


object Test{

    val str =""
    var articleList = Gson().fromJson(str, ArticleList::class.java)
    fun link():String{
        return articleList.data.datas[0].link
    }
    fun title():String{
        return articleList.data.datas[0].title
    }
    fun collect():Boolean{
        return articleList.data.datas[0].collect
    }
    fun date():String{
        return articleList.data.datas[0].niceDate
    }
}

data class ArticleList(var data: Data)

data class Data(var curPage: Int, var datas: MutableList<ArticleItem>)

data class ArticleItem(var title: String, var link: String,var collect: Boolean, var niceDate:String)
class HomeViewModel:ViewModel() {
    var news = MutableLiveData<ArticleItem>()
    fun getDatas():List<ArticleItem> {
        var articleList:MutableList<ArticleItem> = Test.articleList.data.datas
        return articleList
    }
}
