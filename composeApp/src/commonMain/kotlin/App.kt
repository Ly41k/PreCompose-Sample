import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import screens.auth.AuthNav
import screens.main.MainNav
import screens.navigation.AppNavigation
import screens.splash.SplashNav
import screens.theme.AppTheme


@Composable
fun App() {
    PreComposeApp {
        AppTheme {
            val navigator = rememberNavigator()
            Box(modifier = Modifier.fillMaxSize()) {
                NavHost(
                    navigator = navigator,
                    initialRoute = AppNavigation.Splash.route,
                ) {
                    scene(route = AppNavigation.Splash.route) {
                        SplashNav(
                            navigateToMain = {
                                navigator.popBackStack()
                                navigator.navigate(AppNavigation.Main.route)
                            },
                            navigateToAuth = {
                                navigator.popBackStack()
                                navigator.navigate(AppNavigation.Auth.route)
                            }
                        )
                    }
                    scene(route = AppNavigation.Auth.route) {
                        AuthNav(
                            navigateToMain = {
                                navigator.popBackStack()
                                navigator.navigate(AppNavigation.Main.route)
                            }
                        )
                    }

                    scene(route = AppNavigation.Main.route) {
                        MainNav(
                            logout = {
                                navigator.popBackStack()
                                navigator.navigate(AppNavigation.Auth.route)
                            }
                        )
                    }
                }
            }
        }
    }
}
