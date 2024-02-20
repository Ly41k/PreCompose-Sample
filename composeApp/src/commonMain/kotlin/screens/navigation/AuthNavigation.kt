package screens.navigation


sealed class AuthNavigation(
    val route: String,
    val objectName: String = "",
    val objectPath: String = ""
) {
    data object Login : AuthNavigation(route = "Splash")
    data object Register : AuthNavigation(route = "Register")
    data object ForgotPassword : AuthNavigation(route = "Forgot")
}