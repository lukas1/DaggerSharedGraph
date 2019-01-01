package example.com.featureb

import javax.inject.Inject

class FeatureBDependency @Inject constructor() {
    val text: String = "Feature B Text"
}