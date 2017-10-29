package CookieFactory;

import CookieFactory.Recipe.Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Represents the cookie factory. It contains its own stock, its recipes book,
 * its employees, and any customers who ordered at least once to the CookieFactory.
 */
public class CookieFactory {

    private List<Recipe> recipes;
    private List<Manager> managers;
    private Stock stock;

    public CookieFactory() {
        recipes = new ArrayList<>();
        managers = new ArrayList<>();
        stock = new Stock();
    }

    public void order(Customer customer, Map<Cookie, Integer> order) {

    }

    public void subscription(Customer customer) {
        if (!customer.isSubscribed()) {
            customer.subscribe();
        } else
            error("this customer has already subscribed to the Loyalty program");
    }

    public void addRecipe(Recipe recipe) {
        if (!recipes.contains(recipe))
            recipes.add(recipe);
    }

    public void addCookieToStock(Cookie cookie, int amount) {
        stock.addCookie(cookie, amount);
    }

    public void addManager(Manager manager) {
        if (!managers.contains(manager))
            managers.add(manager);
    }

    public void removeManager(Manager manager) {
        if (managers.contains(manager))
            managers.remove(manager);
    }

    /**
     * Display on demand of the customer everything he could purchase in the factory.
     */
    public String displayCookieAssortment() {
        StringBuilder cookieAssortment = new StringBuilder("Here are the cookies you can purchase :");

        for (Cookie cookie : stock.getCookieType()) {
            cookieAssortment.append(cookie.toString());
            cookieAssortment.append("\n");
        }

        return cookieAssortment.toString();
    }

    private void error(String message) {
        System.out.println("Error :" + message);
    }

}
