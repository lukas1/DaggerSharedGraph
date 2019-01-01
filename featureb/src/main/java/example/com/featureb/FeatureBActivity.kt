package example.com.featureb

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import example.com.common.CommonActivity
import kotlinx.android.synthetic.main.activity_feature_b.*
import javax.inject.Inject

class FeatureBActivity : AppCompatActivity() {

    @Inject lateinit var featureBDependency: FeatureBDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_b)

        textView.text = featureBDependency.text

        button.setOnClickListener { startActivity(Intent(this, CommonActivity::class.java)) }
    }
}
