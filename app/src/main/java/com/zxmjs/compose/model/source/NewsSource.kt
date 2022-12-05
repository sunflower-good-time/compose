package com.zxmjs.compose.model.source

import com.zxmjs.base.arch.model.NetWorkDataSource
import com.zxmjs.compose.bean.NewsChannelsBean
import com.zxmjs.compose.net.NetApi
import com.zxmjs.compose.net.NewsApiInterface
import com.zxmjs.network.beans.BaseResponse
import io.reactivex.Observable

/**
 * @author : zhoujianfeng
 * CreatData: 2021/9/13
 * desc:
 */

class NewsSource : NetWorkDataSource<Any, NewsChannelsBean>() {
    override fun getCall(request: Any?): Observable<BaseResponse<NewsChannelsBean>> {
        return NetApi.getInstance().ref.create(NewsApiInterface::class.java).newsChannels
    }
}