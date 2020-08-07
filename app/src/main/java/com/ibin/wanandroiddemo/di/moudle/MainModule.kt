package com.ibin.wanandroiddemo.di.moudle

import com.ibin.wanandroiddemo.mvp.contract.MainContract
import com.ibin.wanandroiddemo.mvp.model.MainModel
import com.jess.arms.di.scope.FragmentScope
import dagger.Module
import dagger.Provides

/**
 * @author sushi
 * @description
 * @date 2020/8/7.
 */
@Module
//构建MainModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
class MainModule(private val view: MainContract.View) {
    @FragmentScope
    @Provides
    fun provideMainView(): MainContract.View {
        return this.view
    }

    @FragmentScope
    @Provides
    fun provideMainModel(model: MainModel): MainContract.Model {
        return model
    }
}