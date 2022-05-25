package com.tubesmobile.newsapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tubesmobile.newsapp.R
import com.tubesmobile.newsapp.model.ModelArticle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_news.*

class DetailNewsActivity : AppCompatActivity() {

    companion object {
        const val DETAIL_NEWS = "DETAIL_NEWS"
    }

    private var modelArticle: ModelArticle? = null
    private var strNewsURL: String? = null
    private var strTitle: String? = null
    private var strSubTitle: String? = null
    var strContent: String? = null
    var strNameSource: String? = null
    var strImage: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)

        setSupportActionBar(toolbar)
        assert(supportActionBar != null)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        progressBar.max = 100

        //get data intent
        modelArticle = intent.getParcelableExtra(DETAIL_NEWS)
        if (modelArticle != null) {

            strNewsURL = modelArticle?.url
            strTitle = modelArticle?.title
            strSubTitle = modelArticle?.url
            strContent = modelArticle?.content
            strNameSource = modelArticle?.author
            strImage = modelArticle?.urlToImage

            tvTitle.text = strTitle
            tvSubTitle.text = strSubTitle
            tvTitleNews.text = strTitle
            tvNameSource.text = strNameSource
            tvNews.text = strContent
            Glide.with(this).load(strImage).into(imageThumbnail);


        }
    }

}