package example.com.daggersharedgraph.di

import dagger.Module
import example.com.common.di.CommonModule

@Module(includes = [
    CommonModule::class
])
abstract class AppModule