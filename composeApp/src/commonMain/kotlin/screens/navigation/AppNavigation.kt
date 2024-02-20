package screens.navigation

sealed class AppNavigation(
    val route: String,
    val objectName: String = "",
    val objectPath: String = ""
) {
    data object Splash : AppNavigation(route = "Splash")
    data object Auth : AppNavigation(route = "Auth")
    data object Main : AppNavigation(route = "Main")
}
