package CookieFactory.Recipe;

/**
 * Topping type for a cookie recipe.
 */
public enum Topping {

    WHITE_CHOCO("White chocolate"), MILK_CHOCO("Milk chocolate"), M_AND_M("M&M’s™"),
    REESE_BUTTERCUP("Reese’s buttercup");

    private String name;

    Topping(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
