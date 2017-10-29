package CookieFactory;

import CookieFactory.Recipe.Recipe;

/**
 * A unique cookie type.
 */
public class Cookie {

    private Recipe recipe;
    private int weight; //in grams

    public Cookie(Recipe recipe, int weight) {
        this.recipe = recipe;
        this.weight = weight;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public float getPrice() {
        return recipe.getPrice();
    }

    public int getWeight() {
        return weight;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        String cookie = "This cookie's recipe is based on : " + recipe.toString();
        cookie += "for a unit weight of " + weight + "grams.";
        return cookie;
    }

}
