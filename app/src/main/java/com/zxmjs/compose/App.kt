package com.zxmjs.compose

import com.alibaba.android.arouter.launcher.ARouter
import com.zxmjs.base.arch.AppBuildConfig
import com.zxmjs.base.arch.BaseApplication
import com.zxmjs.compose.net.NetworkRequestInfo
import com.zxmjs.network.ApiBase

/**
 * @author : zhoujianfeng
 * CreatData: 2021/9/10
 * desc:
 */
class App : BaseApplication() {
    override fun onCreate() {
        super.onCreate()

        AppBuildConfig.APP_ID = BuildConfig.APPLICATION_ID
        AppBuildConfig.APP_IDENTITY = "fast-android"
        AppBuildConfig.DEBUG = BuildConfig.DEBUG
        AppBuildConfig.BUILD_TYPE = BuildConfig.BUILD_TYPE
        AppBuildConfig.VERSION_CODE = BuildConfig.VERSION_CODE
        AppBuildConfig.VERSION_NAME = BuildConfig.VERSION_NAME

    }

    override fun onCreate(mainProcess: Boolean, isNewApp: Boolean) {
         if (mainProcess) {
             ApiBase.setNetworkRequestInfo(NetworkRequestInfo())
             ARouter.init(this)
         }
    }

    override fun onReleaseMode(mainProcess: Boolean, isNewApp: Boolean) {
        super.onReleaseMode(mainProcess, isNewApp)
    }

    override fun onDebugMode(mainProcess: Boolean, isNewApp: Boolean) {
        super.onDebugMode(mainProcess, isNewApp)
    }

    override fun onBetaMode(mainProcess: Boolean, isNewApp: Boolean) {
        super.onBetaMode(mainProcess, isNewApp)
    }
}