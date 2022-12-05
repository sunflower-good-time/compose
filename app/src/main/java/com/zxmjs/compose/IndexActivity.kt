package com.zxmjs.compose

import com.zxmjs.base.arch.view.BaseActivity
import com.zxmjs.compose.databinding.IndexActivityBinding
import com.zxmjs.compose.page.IndexFragment

/**
 * @author:zhoujianfeng
 * CreatData:2022/11/30
 * desc:
 */
class IndexActivity : BaseActivity<IndexActivityBinding>() {
    override fun layoutRes(): Int {
        return R.layout.index_activity
    }

    override fun onInitView() {
        supportFragmentManager.beginTransaction().replace(R.id.frame_body, IndexFragment()).commit()
    }

    override fun onRequestData() {

    }

    override fun onSetListener() {

    }


}