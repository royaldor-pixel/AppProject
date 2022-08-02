package com.example.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.appproject.R
import com.example.appproject.ui.home.ViewModel
import org.w3c.dom.Text

class ContentFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        val view:View = inflater.inflate((R.layout.fragment_detail_home),container,false)
        displayContent(view)
        return view
    }
    private lateinit var viewModel: ViewModel
    private fun displayContent(view:View) {
        val content:WebView = view.findViewById(R.id.webview)
        val time:TextView = view.findViewById(R.id.content_time)
        val title:TextView = view.findViewById(R.id.content_title)
        viewModel = ViewModelProvider(requireActivity())[ViewModel::class.java]
        viewModel.news.observe(viewLifecycleOwner) {
            time.text = it.niceDate
            title.text = it.title
            content.loadUrl(it.link)
        }
    }
}
