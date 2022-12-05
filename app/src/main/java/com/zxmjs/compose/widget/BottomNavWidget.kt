package com.zxmjs.compose.widget

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.annotation.IdRes
import androidx.collection.ArrayMap
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner
import com.zxmjs.base.arch.view.SingleClick
import com.zxmjs.compose.R
import com.zxmjs.compose.databinding.WidgetBottomNavBinding

/**
 * 底部Navigation bar
 */
class BottomNavWidget : ConstraintLayout, LifecycleEventObserver {

    constructor(context: Context) : this(context, null, 0)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )

    annotation class Tab {
        companion object {
            var INDEX = 0
            var FOLLOW = 1
            var PUBLISH = 2
            var MESSAGE = 3
            var MINE = 4
        }
    }



    private val binding = WidgetBottomNavBinding.inflate(LayoutInflater.from(context), this,true)
    private val itemViews = ArrayMap<Int, View?>()
    private var onItemClickListener: OnItemClickListener? = null
    private var isStop = false

    init {

        itemViews[Tab.INDEX] = binding.btnNavigationHome
        itemViews[Tab.FOLLOW] = binding.btnNavigationFollow
        itemViews[Tab.PUBLISH] = binding.btnNavigationDiscover
        itemViews[Tab.MESSAGE] = binding.btnNavigationMessage
        itemViews[Tab.MINE] = binding.btnNavigationMine
        val onClickListener: SingleClick = object : SingleClick() {
            override fun onDo(v: View) {
                onStyleChange(v)
                if (onItemClickListener != null) {
                    onItemClickListener?.onItemClick(v, getIndex(v.id))
                }
            }
        }
        for ((_, child) in itemViews) {
            child?.setOnClickListener(onClickListener)
        }
        itemViews[Tab.INDEX]?.isSelected = true
    }

    /**
     * 修改选择样式
     *
     */
    private fun onStyleChange(v: View?) {
        for ((_, child) in itemViews) {
            child?.isSelected = false
        }
        v?.isSelected = true
    }

    /**
     * 修改选择样式
     *
     * @param
     */
    fun onStyleChange(position: Int) {
        if (itemViews[position] != null) {
            onStyleChange(itemViews[position])
        }
    }

    /**
     * 选中table
     *
     * @param tab 哪个tab
     */
    fun callOnClick(@Tab tab: Int) {
        itemViews[tab]?.callOnClick()
    }

    /**
     * 设置条目点击监听
     */
    fun setOnItemClickListener(onItemClickListener: OnItemClickListener?) {
        this.onItemClickListener = onItemClickListener
    }

    private fun getIndex(@IdRes id: Int): Int {
        return when (id) {
            R.id.btn_navigation_home -> {
                1
            }
            R.id.btn_navigation_follow -> {
                2
            }
            R.id.btn_navigation_discover -> {
                3
            }
            R.id.btn_navigation_message -> {
                4
            }
            else -> {
                5
            }
        }
    }


    interface OnItemClickListener {
        fun onItemClick(view: View?, position: Int)
        fun onDoubleClick(view: View?, position: Int)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event) {
            Lifecycle.Event.ON_START -> isStop = false;
            Lifecycle.Event.ON_STOP -> isStop = true;
        }
    }
}