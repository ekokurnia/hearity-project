package com.hearity_capstone.hearity

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.hearity_capstone.hearity.graphs.RootNavigationGraph
import com.hearity_capstone.hearity.ui.theme.HearityTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Splash Screen for Android 12+
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val splashScreen = installSplashScreen()
            splashScreen.setKeepOnScreenCondition { true }
            CoroutineScope(Dispatchers.Main).launch {
                delay(2000)
                splashScreen.setKeepOnScreenCondition { false }
            }
        }
        setContent {
            HearityTheme {
                Surface {
                    RootNavigationGraph(navController = rememberNavController())
                }
            }
        }
    }
}


