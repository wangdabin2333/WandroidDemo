package com.ibin.wanandroiddemo.mvp.model.main.home.search

import android.app.Application
import com.google.gson.Gson
import com.ibin.wanandroiddemo.mvp.contract.main.home.search.SearchContract
import com.ibin.wanandroiddemo.mvp.model.api.Api
import com.ibin.wanandroiddemo.mvp.model.entity.ApiResponse
import com.ibin.wanandroiddemo.mvp.model.entity.SearchResponse
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel

import com.jess.arms.di.scope.ActivityScope
import io.reactivex.Observable
import javax.inject.Inject



/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 08/16/2019 20:31
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
class SearchModel
@Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), SearchContract.Model {
    @Inject
    lateinit var mGson: Gson
    @Inject
    lateinit var mApplication: Application

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun getHotData(): Observable<ApiResponse<MutableList<SearchResponse>>> {
        return Observable.just(mRepositoryManager
                .obtainRetrofitService(Api::class.java)
                .getSearchData())
                .flatMap { apiResponseObservable ->
                    apiResponseObservable
                }
    }
}
