package com.tubesmobile.newsapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.tubesmobile.newsapp.R
import com.tubesmobile.newsapp.adapter.NewsAdapter
import com.tubesmobile.newsapp.model.ModelArticle
import java.util.*

class FragmentSearch : Fragment() {

    companion object {
        const val API_KEY = "79af9b454896485ab5e17ec1d31b7e44"
    }

    var strKeywords: String = ""
    var modelArticle: MutableList<ModelArticle> = ArrayList()
    var newsAdapter: NewsAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }



}