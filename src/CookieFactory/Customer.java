package CookieFactory;

/**
 * A customer of the cookie factory.
 */
public class Customer {

    private String name;
    private int age;
    private boolean subscribe;
    private int orderedCookiesCounter;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        orderedCookiesCounter = 0;
    }

    void subscribe() {
        subscribe = true;
    }

    public void unsubscribe() {
        subscribe = false;
    }

    /**
     * A discount is available when the customer has already purchased at least 30
     * cookies. It provides him a discount of 10% (non combinable to avoid 100% discount on order)
     * on the next order he does.
     */
    public boolean discount() {
        if (orderedCookiesCounter >= 30) {
            orderedCookiesCounter -= 30;
            return true;
        }
        return false;
    }

    public void incrementCookieCounter(int amount) {
        orderedCookiesCounter += amount;
    }

    boolean isSubscribed() {
        return subscribe;
    }

    @Override
    public String toString() {
        String customer = "Customer's name : " + name;
        customer += "\n Age : " + age;
        if (subscribe) {
            customer += "\nSubscribed to the Loyalty program";
            customer += "\nOrdered cookies counter : " + orderedCookiesCounter;
        } else {
            customer += "\nSubscribed to the Loyalty program";
        }

        return customer;
    }

}
