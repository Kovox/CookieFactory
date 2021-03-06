package CookieFactory;

import java.util.Map;

/**
 * Represents an order from a customer executed by cookie factory.
 */
public class Order {

    private Customer customer;
    private Stock cfStock;
    private Place shopPlace;
    private Date rdv;
    private Map<Cookie, Integer> cookieOrder;

    Order(Customer customer, Stock cfStock, Place shopPlace, Date rdv, Map<Cookie, Integer> cookieOrder) {
        this.customer = customer;
        this.cfStock = cfStock;
        this.shopPlace = shopPlace;
        this.rdv = rdv;
        this.cookieOrder = cookieOrder;
    }

    public void takeOrder(Cookie cookie, int amount) {
        cfStock.addCookieToStorehouse(cookie, amount);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Place getShopPlace() {
        return shopPlace;
    }

    public Date getRdv() {
        return rdv;
    }

    public Map<Cookie, Integer> getOrder() {
        return cookieOrder;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setShopPlace(Place shopPlace) {
        this.shopPlace = shopPlace;
    }

    public void setRdv(Date rdv) {
        this.rdv = rdv;
    }

    public void setOrder(Map<Cookie, Integer> cookieOrder) {
        this.cookieOrder = cookieOrder;
    }

    @Override
    public String toString() {
        StringBuilder order = new StringBuilder("Order from :\n" + customer.toString());
        order.append("\nOrder details : ");
        for (Cookie cookie : cookieOrder.keySet()) {
            order.append(cookie.toString());
            order.append("\nAmount ordered : ").append(cookieOrder.get(cookie));
        }
        return order.toString();
    }

}
