package com.ibin.wanandroiddemo.mvp.ui.activity

import android.os.Bundle
import com.ibin.wanandroiddemo.R
import com.ibin.wanandroiddemo.mvp.ui.BaseActivity
import com.ibin.wanandroiddemo.mvp.ui.activity.main.MainFragment
import com.jess.arms.di.component.AppComponent
import com.jess.arms.mvp.IPresenter

class MainActivity : BaseActivity<IPresenter>() {

    override fun initData(savedInstanceState: Bundle?) {
        if (findFragment(MainFragment::class.java) == null) {
            loadRootFragment(R.id.main_framelayout, MainFragment.newInstance())
        }
    }

    override fun setupActivityComponent(appComponent: AppComponent) {
        TODO("Not yet implemented")
    }

    override fun initView(savedInstanceState: Bundle?): Int {
        return R.layout.activity_main
    }
}