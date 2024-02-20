package screens.main

import androidx.compose.runtime.Composable
import moe.tlaster.precompose.navigation.NavHost
import moe.tlaster.precompose.navigation.rememberNavigator
import screens.home.DetailsScreen
import screens.home.HomeScreen
import screens.home.ProductsScreen
import screens.navigation.HomeNavigation


@Composable
fun HomeNav() {

    val navigator = rememberNavigator()
    NavHost(
        navigator = navigator,
        initialRoute = HomeNavigation.Home.route,
    ) {
        scene(route = HomeNavigation.Home.route) {
            HomeScreen(
                navigateToDetails = { navigator.navigate(HomeNavigation.Details.route) },
                navigateToProducts = { navigator.navigate(HomeNavigation.Details.route) }
            )
        }

        scene(route = HomeNavigation.Details.route) {
            DetailsScreen(popUp = { navigator.popBackStack() })
        }

        scene(route = HomeNavigation.Products.route) {
            ProductsScreen(popUp = { navigator.popBackStack() })
        }
    }
}
