package screens.navigation

sealed class MainNavigation(
    val route: String,
    val title: String,
    val selectedIcon: String,
    val unSelectedIcon: String,
) {

    data object Home : MainNavigation(
        route = "Home",
        title = "Home",
        selectedIcon = "home.xml",
        unSelectedIcon = "home_border.xml"
    )

    data object Profile : MainNavigation(
        route = "Profile",
        title = "Profile",
        selectedIcon = "profile.xml",
        unSelectedIcon = "profile_border.xml"
    )
}
