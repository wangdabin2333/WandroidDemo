package com.ibin.wanandroiddemo.mvp.model.start

import android.app.Application
import com.google.gson.Gson
import com.ibin.wanandroiddemo.mvp.contract.start.LoginContract
import com.ibin.wanandroiddemo.mvp.model.api.Api
import com.ibin.wanandroiddemo.mvp.model.entity.ApiResponse
import com.ibin.wanandroiddemo.mvp.model.entity.UserInfoResponse
import com.jess.arms.di.scope.ActivityScope
import com.jess.arms.integration.IRepositoryManager
import com.jess.arms.mvp.BaseModel
import io.reactivex.Observable
import javax.inject.Inject


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 07/05/2019 16:59
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
class LoginModel
@Inject
constructor(repositoryManager: IRepositoryManager) : BaseModel(repositoryManager), LoginContract.Model {
    @Inject
    lateinit var mGson: Gson
    @Inject
    lateinit var mApplication: Application

    override fun register(username: String, password: String, password1: String): Observable<ApiResponse<Any>> {
        return Observable.just(mRepositoryManager
                .obtainRetrofitService(Api::class.java)
                .register(username, password, password1))
                .flatMap { apiResponseObservable ->
                    apiResponseObservable
                }
    }


    override fun login(username: String, password: String): Observable<ApiResponse<UserInfoResponse>> {
        return Observable.just(mRepositoryManager
                .obtainRetrofitService(Api::class.java)
                .login(username, password))
                .flatMap { apiResponseObservable ->
                    apiResponseObservable
                }
    }


    override fun onDestroy() {
        super.onDestroy()
    }
}
