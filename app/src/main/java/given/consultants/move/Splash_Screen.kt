package given.consultants.move

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.logging.Handler


class Splash_Screen : AppCompatActivity() {

    private val SPLASH_TIME: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)

        android.os.Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        }
        , SPLASH_TIME)
    }
}