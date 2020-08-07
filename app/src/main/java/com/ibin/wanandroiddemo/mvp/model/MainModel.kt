package com.ibin.wanandroiddemo.mvp.model

import android.app.Application
import com.google.gson.Gson
import com.ibin.wanandroiddemo.mvp.contract.MainContract
import com.jess.arms.di.scope.FragmentScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import javax.inject.Inject

/**
 * @author sushi
 * @description
 * @date 2020/8/7.
 */
@FragmentScope
class MainModel
@Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), MainContract.Model {
    @Inject
    lateinit var mGson: Gson;
    @Inject
    lateinit var mApplication: Application;

    override fun onDestroy() {
        super.onDestroy();
    }
}