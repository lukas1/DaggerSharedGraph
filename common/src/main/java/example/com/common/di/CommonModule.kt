package example.com.common.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import example.com.common.CommonActivity

@Module(includes = [
    AndroidSupportInjectionModule::class
])
abstract class CommonModule {
    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun contributesCommonActivityInjector(): CommonActivity
}