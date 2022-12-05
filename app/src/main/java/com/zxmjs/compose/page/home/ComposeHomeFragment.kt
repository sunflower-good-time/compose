package com.zxmjs.compose.page.home

import android.view.View
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.fragment.app.activityViewModels
import com.zxmjs.base.arch.view.BasicMvvmFragment
import com.zxmjs.compose.R
import com.zxmjs.compose.databinding.FragmentComposeHomeLayoutBinding
import com.zxmjs.compose.viewmodel.ComposeHomeFragmentViewModel

/**
 * @author:zhoujianfeng
 * CreatData:2022/12/5
 * desc:
 */
class ComposeHomeFragment : BasicMvvmFragment<ComposeHomeFragmentViewModel,FragmentComposeHomeLayoutBinding>() {

    private val viewModel by activityViewModels<ComposeHomeFragmentViewModel>()

    override fun layoutRes(): Int {
        return R.layout.fragment_compose_home_layout
    }

    override fun onInitView(v: View) {
        mBinding.composeView.setContent {
            test()
        }
    }

    @Composable
    fun test() {
        Text("hellow compose")

    }

    override fun onRequestData() {

    }

    override fun onSetListener(v: View) {
    }

    override fun getVModel(): ComposeHomeFragmentViewModel {
        return viewModel
    }
}