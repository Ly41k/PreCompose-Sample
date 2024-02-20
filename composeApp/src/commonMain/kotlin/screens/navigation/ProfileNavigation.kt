package screens.navigation

sealed class ProfileNavigation(
    val route: String,
    val objectName: String = "",
    val objectPath: String = ""
) {
    data object Profile : ProfileNavigation(route = "Profile")

    data object EditProfile : ProfileNavigation(route = "EditProfile")

    data object Settings : ProfileNavigation(route = "Settings")

}