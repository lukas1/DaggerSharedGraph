package example.com.appb

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import example.com.appb.di.DaggerAppComponent

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> = DaggerAppComponent.create()
}