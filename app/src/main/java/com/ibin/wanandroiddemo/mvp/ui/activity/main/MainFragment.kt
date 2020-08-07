package com.ibin.wanandroiddemo.mvp.ui.activity.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ibin.wanandroiddemo.R
import com.ibin.wanandroiddemo.di.moudle.MainModule
import com.ibin.wanandroiddemo.mvp.contract.MainContract
import com.ibin.wanandroiddemo.mvp.presenter.MainPresenter
import com.jess.arms.base.BaseFragment
import com.jess.arms.di.component.AppComponent

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : BaseFragment<MainPresenter>(),MainContract.View {

    override fun setupFragmentComponent(appComponent: AppComponent) {
        DaggerMainComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .mainModule(MainModule(this))
                .build()
                .inject(this)
    }

    override fun initData(savedInstanceState: Bundle?) {

    }

    override fun setData(data: Any?) {

    }


    override fun initView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun showMessage(message: String) {
        TODO("Not yet implemented")
    }

}
