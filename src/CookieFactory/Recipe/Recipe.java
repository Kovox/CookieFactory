package CookieFactory.Recipe;

/**
 * The recipe of a cookie is defined by :
 * - the dough
 * - the flavour
 * - the topping
 * - the mix type
 * - the cooking
 */
public class Recipe {

    private Dough dough;
    private Flavour flavour;
    private Topping topping;
    private Mix mix;
    private Cooking cooking;
    private float price;

    public Recipe(Dough dough, Flavour flavour, Topping topping, Mix mix, Cooking cooking, float price) {
        this.dough = dough;
        this.flavour = flavour;
        this.topping = topping;
        this.mix = mix;
        this.cooking = cooking;
        this.price = price;
    }

    public Dough getDough() {
        return dough;
    }

    public Flavour getFlavour() {
        return flavour;
    }

    public Topping getTopping() {
        return topping;
    }

    public Mix getMix() {
        return mix;
    }

    public Cooking getCooking() {
        return cooking;
    }

    public float getPrice() {
        return price;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setFlavour(Flavour flavour) {
        this.flavour = flavour;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setMix(Mix mix) {
        this.mix = mix;
    }

    public void setCooking(Cooking cooking) {
        this.cooking = cooking;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {

        String recipe = "Recipe details :";
        recipe += "\nDough : " + dough.toString();
        recipe += "\nFlavour : " + flavour.toString();
        recipe += "\nTopping : " + topping.toString();
        recipe += "\nMix type : " + mix.toString();
        recipe += "\nCooking : " + cooking.toString();
        recipe += "\nRecipe's price : " + price + "$";

        return recipe;
    }

}
