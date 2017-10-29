package CookieFactory;

import java.util.Map;

/**
 * Represents an order from a customer executed by cookie factory.
 */
public class Order {

    private Customer customer;
    private Map<Cookie, Integer> order;

    public Order(Customer customer, Map<Cookie, Integer> order) {
        this.customer = customer;
        this.order = order;
    }

    @Override
    public String toString() {
        String order = "Order from :\n" + customer.toString();
        order += "\nOrder details : ";
        for (Cookie cookie : this.order.keySet()) {
            order += cookie.toString();
            order += "\nAmount ordered : " + this.order.get(cookie);
        }
        return order;
    }
}
