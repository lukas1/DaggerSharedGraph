package example.com.appb.di

import dagger.Module
import example.com.common.di.CommonModule
import example.com.featureb.FeatureBModule

@Module(includes = [
    CommonModule::class,
    FeatureBModule::class
])
abstract class AppModule