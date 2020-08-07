package com.ibin.wanandroiddemo.di.moudle.start

import com.ibin.wanandroiddemo.mvp.contract.start.LoginContract
import com.ibin.wanandroiddemo.mvp.model.start.LoginModel
import com.jess.arms.di.scope.ActivityScope

import dagger.Module
import dagger.Provides



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
@Module
//构建LoginModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
class LoginModule(private val view: LoginContract.View) {
    @ActivityScope
    @Provides
    fun provideLoginView(): LoginContract.View {
        return this.view
    }

    @ActivityScope
    @Provides
    fun provideLoginModel(model: LoginModel): LoginContract.Model {
        return model
    }
}
