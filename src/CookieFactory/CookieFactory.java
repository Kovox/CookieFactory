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
    private List<Customer> customers;
    private List<Order> orders;
    private Stock stock;

    public CookieFactory() {
        recipes = new ArrayList<>();
        managers = new ArrayList<>();
        customers = new ArrayList<>();
        orders = new ArrayList<>();
        stock = new Stock();
    }

    public void order(Customer customer, Place shopPlace, Date rdv, Map<Cookie, Integer> order) {
        Order newOrder = new Order(customer, shopPlace, rdv, order);
        orders.add(newOrder);
    }

    public void subscription(Customer customer) {
        if (!customer.isSubscribed()) {
            customer.subscribe();
        } else
            info("this customer has already subscribed to the Loyalty program");
    }

    public void addRecipe(Recipe recipe) {
        if (!recipes.contains(recipe))
            recipes.add(recipe);
        else
            info("this cookie recipe is already in the cookie factory database.");
    }

    public void removeRecipe(Recipe recipe) {
        if (recipes.contains(recipe))
            recipes.remove(recipe);
        else
            error("you can't remove a recipe that doesn't exist.");
    }

    public void addCookieToStock(Cookie cookie, int amount) {
        stock.addCookie(cookie, amount);
    }

    public void addManager(Manager manager) {
        if (!managers.contains(manager))
            managers.add(manager);
        else
            info("this manager is already in the cookie factory database.");
    }

    public void removeManager(Manager manager) {
        if (managers.contains(manager))
            managers.remove(manager);
        else
            error("you can't fire a manager who doesn't exist.");
    }

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer))
            customers.add(customer);
        else
            info("this customer is already in the cookie factory database.");
    }

    public void removeCustomer(Customer customer) {
        if (customers.contains(customer))
            customers.remove(customer);
        else
            error("you can't remove a customer who doesn't exist.");
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
        System.out.println("Error : " + message);
    }

    private void info(String message) {
        System.out.println("Info : " + message);
    }

}
