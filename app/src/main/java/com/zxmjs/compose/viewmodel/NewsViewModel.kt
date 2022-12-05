package com.zxmjs.compose.viewmodel

import android.app.Application
import com.zxmjs.base.arch.viewmodel.BaseViewModel
import com.zxmjs.compose.model.source.NewsSource
/**
 * @author : zhoujianfeng
 * CreatData: 2021/9/13
 * desc:
 */
 class NewsViewModel(application: Application) :BaseViewModel(application)  {
    var mArticleSource: NewsSource = NewsSource()

    var age:Int = 10


 }