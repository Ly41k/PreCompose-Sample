package screens.navigation

sealed class HomeNavigation(
    val route: String,
    val objectName: String = "",
    val objectPath: String = "",
) {
    data object Home : HomeNavigation(route = "Home")
    data object Products : HomeNavigation(route = "Products")
    data object Details : HomeNavigation(route = "Details")
}
