package example.com.featureb

import dagger.Module
import dagger.android.ContributesAndroidInjector
import example.com.common.di.ActivityScope

@Module
abstract class FeatureBModule {
    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun contributesFeatureBActivityInjector(): FeatureBActivity
}