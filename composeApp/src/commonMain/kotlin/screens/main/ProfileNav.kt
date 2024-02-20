package screens.main

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import screens.navigation.ProfileNavigation
import screens.profile.EditProfileScreen
import screens.profile.ProfileScreen
import screens.profile.SettingsScreen

@Composable
fun ProfileNav(logout: () -> Unit) {

    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        initialRoute = ProfileNavigation.Profile.route,
    ) {
        scene(route = ProfileNavigation.Profile.route) {
            ProfileScreen(
                navigateToEditProfile = { navigator.navigate(ProfileNavigation.EditProfile.route) },
                navigateToSetting = { navigator.navigate(ProfileNavigation.Settings.route) },
            )
        }

        scene(route = ProfileNavigation.EditProfile.route) {
            EditProfileScreen(popUp = { navigator.popBackStack() })
        }

        scene(route = ProfileNavigation.Settings.route) {
            SettingsScreen(
                popUp = { navigator.popBackStack() },
                logout = logout
            )
        }
    }
}