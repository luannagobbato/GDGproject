package com.example.luanna.myapp.utils;
import com.example.luanna.myapp.models.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luanna on 19/05/2017.
 */

// Lista com os ingredientes e receitas
public class Cons {
    public static List<Recipe> getRecipes(){
        List<Recipe> recipes = new ArrayList<>();
        List<RecipeIngredient> recipeIngredients = getRecipeIngredients();
        String example = "Unte uma assadeira média com óleo e jogue um pouco de farinha de trigo espalhando por toda a superfície e laterais. Retire os excessos de farinha da assadeira. Separe as gemas das claras e bata as claras em ponto de neve na batedeira em velocidade alta por 5 minutos Pegue uma panela pequena e misture o chocolate em pó com água e leve ao fogo até ferver. Em uma tigela bata bem o açúcar com as gemas até ficar cremoso. Adicione óleo e continue a bater. Junte a calda ainda quente de chocolate e misture bem. Acrescente farinha aos poucos mexendo sempre para ficar homogêneo. Para evitar pequenas bolinhas na mistura, peneire juntos, com um coador pequeno, o fermento em pó e o bicarbonato de sódio por cima da massa e misture bem. Junte delicadamente as claras batidas em neve até ficar uma massa cremosa e uniforme. Vire a massa na assadeira previamente untada. Ponha para assar em forno médio por aproximadamente 40 minutos. O tempo de assar pode variar um pouco de acordo com o forno e a assadeira. Depois de esfriar, desenforme o bolo. Utilize uma faquinha para passar ao redor do bolo e levantá-lo um pouco. Vire a forma em cima de um prato grande e desvire novamente o bolo.";

        List<RecipeIngredient> recipe1 = new ArrayList<>();
        recipe1.add(recipeIngredients.get(0));
        recipe1.add(recipeIngredients.get(3));
        recipe1.add(recipeIngredients.get(7));
        List<RecipeIngredient> recipe2 = new ArrayList<>();
        recipe2.add(recipeIngredients.get(1));
        recipe2.add(recipeIngredients.get(2));
        recipe2.add(recipeIngredients.get(3));
        List<RecipeIngredient> recipe3 = new ArrayList<>();
        recipe3.add(recipeIngredients.get(5));
        recipe3.add(recipeIngredients.get(3));
        recipe3.add(recipeIngredients.get(2));
        List<RecipeIngredient> recipe4 = new ArrayList<>();
        recipe4.add(recipeIngredients.get(3));
        recipe4.add(recipeIngredients.get(6));
        recipe4.add(recipeIngredients.get(7));

        recipes.add(new Recipe("Bombom de Paçoca", example, "150min", 15.00, 10, recipe1));
        recipes.add(new Recipe("Bolo de Cenoura", example, "130min", 70.00, 20, recipe2));
        recipes.add(new Recipe("Pudim de Leite", example, "100min", 20.00, 30, recipe3));
        recipes.add(new Recipe("Torta de Requeijão", example, "90min", 15.00, 40, recipe4));

//        recipes.add(new Recipe("http://is5.mzstatic.com/image/thumb/Music122/v4/50/89/c3/5089c3f8-ed7c-cdeb-fe3b-2931deee3a98/source/1200x630bb.jpg", "Bombom De Paçoquita"));
//        recipes.add(new Recipe("https://images.genius.com/79a2201c67a9aa386cda76562666c62d.500x500x1.jpg", "Bolo de Chocolate"));
//        recipes.add(new Recipe("http://sassipan.com.br/site/wp-content/uploads/2014/09/Torta-de-requeij%C3%A3o-com-lim%C3%A3o.jpg", "Torta de Requeijão"));
//        recipes.add(new Recipe("https://www.altoastral.com.br/wp-content/uploads/2004/01/torta-limao-superfacil.jpg", "Torta de Limão"));
//        recipes.add(new Recipe("http://gastrolandia.com.br/wp-content/uploads/2015/12/Captura-de-Tela-2015-12-14-a%CC%80s-16.28.12.png", "Pudim de Leite"));
//        recipes.add(new Recipe("http://www.daltonrangel.com.br/wp-content/uploads/2015/08/Bolo-de-fub%C3%A1-cremoso.jpg", "Bolo de Fubá"));
//        recipes.add(new Recipe("https://s-media-cache-ak0.pinimg.com/736x/ef/de/3e/efde3edfd916218cf2b4e77b3f10d1c0.jpg", "Mousse de maracujá"));
//        recipes.add(new Recipe("https://img.r7.com/images/2015/08/11/4f5l7u8eu4_4u05e2lbd0_file?dimensions=780x536&no_crop=true", "Brigadeiro"));
//        recipes.add(new Recipe("http://www.receitas-sem-fronteiras.com/uploads/media/86139_highlight-42.jpg?1393611640", "Bem casado"));

        return recipes;
    }

    public static List<Ingredient> getIngredients(){
        List<Ingredient> ingredients = new ArrayList<>();

        ingredients.add(new Ingredient("Chocolate", 1000, 15.00));
        ingredients.add(new Ingredient("Leite condensado", 1000, 16.00));
        ingredients.add(new Ingredient("Leite", 1000, 2.00));
        ingredients.add(new Ingredient("Ovos", 30, 10.00));
        ingredients.add(new Ingredient("Manteiga", 150, 5.00));

        return ingredients;
    }

    public static List<RecipeIngredient> getRecipeIngredients(){
        List<RecipeIngredient> recipeIngredients = new ArrayList<>();
        List<Ingredient> ingredients = Cons.getIngredients();

        recipeIngredients.add(new RecipeIngredient(ingredients.get(0),200));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(0),300));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(1),600));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(2),300));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(3),222));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(3),600));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(4),300));
        recipeIngredients.add(new RecipeIngredient(ingredients.get(4),222));

        return recipeIngredients;
    }

}
