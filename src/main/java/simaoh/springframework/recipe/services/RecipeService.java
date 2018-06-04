package simaoh.springframework.recipe.services;

import simaoh.springframework.recipe.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();


}
