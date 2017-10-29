package CookieFactory.Recipe;

/**
 * Mix type for a cookie recipe.
 */
public enum Mix {

    MIXED("Mixed"), TOPPED("Topped");

    private String name;

    Mix(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
