package example.com.appb.di

import dagger.Component
import dagger.android.AndroidInjector
import example.com.appb.App

@Component(modules = [AppModule::class])
interface AppComponent: AndroidInjector<App>