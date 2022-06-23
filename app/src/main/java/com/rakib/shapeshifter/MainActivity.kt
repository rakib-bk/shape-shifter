package com.rakib.shapeshifter

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.LifecycleCoroutineScope
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bkash.businessapp.shared.ui.theme.ShapeShifterTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var repository: ShapeShifterRepository


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShapeShifterTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()

                    var pages: MutableState<List<Page>> = remember {
                        mutableStateOf(mutableListOf())
                    }

                    LaunchedEffect("test") {

                        pages.value = repository.getData("https://rakib10rr3.github.io/api-sample/sdui/page-settings.json")
                    }



                    if (pages.value.isNotEmpty())
                        NavContainer(pages = pages.value, navController = navController, repository = repository)


                }
            }
        }
    }
}

@Composable
fun NavContainer(pages: List<Page>, navController: NavHostController, repository: ShapeShifterRepository) {
    Log.d("rakib", "came here ${pages.size.toString()}")
    NavHost(navController = navController, startDestination = pages[0].id) {
        pages.forEach { page ->
            composable(route = page.id) {
                PageGenerator(page = page) {
                    when (ActionType.valueOf(it?.type.toString())) {
                        ActionType.API -> {

                        }

                        ActionType.Navigation -> {
                            navController.navigate(page.nextPageId)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun PageGenerator(page: Page, onCallToAction: (Cta?) -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        BuildComposables(widget = page.wigets) {
            onCallToAction(it)
        }
    }
}



@Composable
private fun setView(
    data: ArrayList<PageSettings>,
    applicationContext: Context,
    lifecycleScope: LifecycleCoroutineScope
) {
    data.forEach { value ->
//        checkUiType(value, applicationContext, lifecycleScope)
    }
}

@Composable
fun BuildComposables(widget: List<WigetsItem>, onCallToAction: (Cta?) -> Unit) {
    widget.forEach {
        when (Type.valueOf(it.type.toString())) {
            Type.ProceedButton -> ProceedButton(text = "Proceed", enabled = true) {
                onCallToAction(it.cta)
            }
            Type.InputBox -> InputBox(value = "Rakib", labelText = "Enter Id", hintText = it.hint?.get(0)?.value.toString())
            Type.Text -> Text(text = "Hello")
            else -> {}
        }
    }

}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShapeShifterTheme {
        Greeting("Android")
    }
}

enum class Type {
    ProceedButton, InputBox, NavigateUp, Text, VerticalList
}

enum class ActionType {
    API, Navigation
}