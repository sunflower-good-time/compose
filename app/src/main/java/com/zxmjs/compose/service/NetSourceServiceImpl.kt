//package com.zxmjs.compose.service
//
//import android.content.Context
//import com.alibaba.android.arouter.facade.annotation.Route
//import com.zxmjs.base.arch.service.NetSourceService
//import com.zxmjs.compose.net.NetApi
//import com.zxmjs.network.inter.INewWork
//
///**
// * @author:zhoujianfeng
// * CreatData:2022/9/28
// * desc:
// */
//
//@Route(path = "/app/action/network", name = "网络服务")
//class NetSourceServiceImpl : NetSourceService {
//    override fun getINetWork(): INewWork {
//        return NetApi.getInstance()
//    }
//
//    override fun init(context: Context?) {
//    }
//}