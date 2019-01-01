package example.com.daggersharedgraph

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import example.com.daggersharedgraph.di.DaggerAppComponent

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.create()
}