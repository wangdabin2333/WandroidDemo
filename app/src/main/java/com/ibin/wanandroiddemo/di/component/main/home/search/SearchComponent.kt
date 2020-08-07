package me.hegj.wandroid.di.component.main.home.search

import com.ibin.wanandroiddemo.di.moudle.main.home.search.SearchModule
import com.ibin.wanandroiddemo.mvp.ui.activity.main.home.search.SearchActivity
import dagger.Component
import com.jess.arms.di.component.AppComponent


import com.jess.arms.di.scope.ActivityScope


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
@Component(modules = arrayOf(SearchModule::class), dependencies = arrayOf(AppComponent::class))
interface SearchComponent {
    fun inject(activity: SearchActivity)
}
