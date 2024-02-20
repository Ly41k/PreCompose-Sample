package screens.auth

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import screens.navigation.AuthNavigation

@Composable
internal fun AuthNav(navigateToMain: () -> Unit) {
    val navigator = rememberNavigator()

    NavHost(
        navigator = navigator,
        initialRoute = AuthNavigation.Login.route,
    ) {
        scene(route = AuthNavigation.Login.route) {
            LoginScreen(
                navigateToMain = navigateToMain,
                navigateToForgot = { navigator.navigate(AuthNavigation.ForgotPassword.route) },
                navigateToRegister = { navigator.navigate(AuthNavigation.Register.route) }
            )
        }

        scene(route = AuthNavigation.ForgotPassword.route) {
            ForgotPasswordScreen(
                popUp = { navigator.popBackStack() },
                navigateToRegister = { navigator.navigate(AuthNavigation.Register.route) }
            )
        }
        scene(route = AuthNavigation.Register.route) {
            RegisterScreen(
                navigateToMain = navigateToMain,
                popUp = { navigator.popBackStack() },
                navigateToForgot = { navigator.navigate(AuthNavigation.ForgotPassword.route) }
            )
        }
    }
}
