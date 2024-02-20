package screens.splash

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import screens.navigation.SplashNavigation


@Composable
fun SplashNav(
    navigateToAuth: () -> Unit,
    navigateToMain: () -> Unit
) {
    val navigator = rememberNavigator()

    NavHost(
        navigator = navigator,
        initialRoute = SplashNavigation.Splash.route,
    ) {
        scene(route = SplashNavigation.Splash.route) {
            SplashScreen(
                navigateToAuth = navigateToAuth,
                navigateToMain = navigateToMain
            )
        }
    }
}
