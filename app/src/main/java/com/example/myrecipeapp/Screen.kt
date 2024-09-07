package com.example.myrecipeapp

sealed class Screen (val root : String){
    object RecipeScreen : Screen("recipeScreen")
    object DetailScreen : Screen("detailScreen")

}