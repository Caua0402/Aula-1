package br.senai.sp.jandira.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.FiniteAnimationSpec
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
//import androidx.navigation.compose.composable
import br.senai.sp.jandira.components.login.screen.loginScreen
import br.senai.sp.jandira.components.menu.menuScreen
import br.senai.sp.jandira.components.pedidos.pedidosScreen
import br.senai.sp.jandira.components.perfil.perfilScreen
import br.senai.sp.jandira.components.ui.theme.ComponentesTheme
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.google.accompanist.navigation.animation.composable


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberAnimatedNavController()
                    AnimatedNavHost(
                        navController = navController,
                        startDestination = "login",
                        enterTransition = {
                            slideIntoContainer(towards = AnimatedContentScope.SlideDirection.Down,
                                animationSpec = tween(1000)
                            ) + fadeIn(tween(4000))
                        },
                        exitTransition = {
                            slideOutOfContainer(
                                towards = AnimatedContentScope.SlideDirection.Start,
                                animationSpec = tween(2000)
                            )
                        }
                    ) {
                        composable(route = "login") { loginScreen(navController) }
                        composable(route = "menu") { menuScreen(navController) }
                        composable(route = "pedidos") { pedidosScreen(navController) }
                        composable(route = "perfil/{nome}") {
                            var name = it.arguments!!.getString("nome")
                            perfilScreen(navController, name!!)
                        }
                    }
                }
            }
        }
    }
}
