package CookieFactory.Recipe;

/**
 * Cooking type for a cookie recipe.
 */
public enum Cooking {

    CRUNCHY("Crunchy"), CHEWY("Chewy");

    private String name;

    Cooking(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
