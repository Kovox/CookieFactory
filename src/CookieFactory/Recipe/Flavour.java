package CookieFactory.Recipe;

/**
 * Flavour type for a cookie recipe.
 */
public enum Flavour {

    VANILLA("Vanilla"), CINNAMON("Cinnamon"), CHILI("Chili");

    private String name;

    Flavour(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
