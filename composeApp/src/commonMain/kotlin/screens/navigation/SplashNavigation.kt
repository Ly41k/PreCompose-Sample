package screens.navigation

sealed class SplashNavigation(
    val route: String,
    val objectName: String = "",
    val objectPath: String = ""
) {
    data object Splash : SplashNavigation(route = "Splash")
}