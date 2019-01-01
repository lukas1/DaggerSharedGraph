package example.com.daggersharedgraph.di

import dagger.Component
import dagger.android.AndroidInjector
import example.com.daggersharedgraph.App

@Component(modules = [AppModule::class])
interface AppComponent: AndroidInjector<App>