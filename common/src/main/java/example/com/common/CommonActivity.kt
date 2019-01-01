package example.com.common

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_common.*
import javax.inject.Inject

class CommonActivity : AppCompatActivity() {

    @Inject lateinit var dependency: Dependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)

        textView.text = dependency.text
    }
}