package example.com.common

import javax.inject.Inject

class Dependency @Inject constructor() {
    val text: String = "Dependency text"
}