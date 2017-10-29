package CookieFactory.Recipe;

/**
 * Dough type for a cookie recipe.
 */
public enum Dough {

    PLAIN("Plain"), CHOCO("Chocolate"), PEANUT_BUTTER("Peanut Butter"), OATMEAL("Oatmeal");

    private String name;

    Dough(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
