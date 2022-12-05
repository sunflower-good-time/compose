package com.zxmjs.compose.page

import android.view.View
import androidx.fragment.app.activityViewModels
//import androidx.fragment.app.activityViewModels
import com.zxmjs.base.arch.view.BasicMvvmFragment
import com.zxmjs.compose.R
import com.zxmjs.compose.databinding.FragmentIndexLayoutBinding
import com.zxmjs.compose.viewmodel.IndexViewModel

/**
 * @author:zhoujianfeng
 * CreatData:2022/10/21
 * desc: 用于承载主体内容的 fragment
 */
class IndexFragment  : BasicMvvmFragment<IndexViewModel, FragmentIndexLayoutBinding>() {

    private val mNavIndexViewModel by activityViewModels<IndexViewModel>()

    override fun layoutRes(): Int {
        return R.layout.fragment_index_layout
    }

    override fun onInitView(v: View) {

    }

    override fun onRequestData() {

    }

    override fun onSetListener(v: View) {

    }

    override fun getVModel(): IndexViewModel {
        return mNavIndexViewModel
    }

}