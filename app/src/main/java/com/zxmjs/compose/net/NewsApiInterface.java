package com.zxmjs.compose.net;

import com.zxmjs.compose.bean.NewsChannelsBean;
import com.zxmjs.network.beans.BaseResponse;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Allen on 2017/7/20.
 * 保留所有版权，未经允许请不要分享到互联网和其他人
 */


public interface NewsApiInterface {
    @GET("api/user/index")
    Observable<BaseResponse<NewsChannelsBean>> getNewsChannels();
}
