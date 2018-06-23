package CookieFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents the stock of the factory.
 */
public class Stock {

    private List<Cookie> cookieType; // Useless ?
    private Map<Cookie, Integer> cookiesStock;
    private Map<Cookie, Integer> storehouse;

    Stock() {
        cookieType = new ArrayList<>();
        cookiesStock = new HashMap<>();
    }

    void addCookie(Cookie cookie, int amount) {
        checkType(cookie);
        if (cookiesStock.containsKey(cookie))
            cookiesStock.put(cookie, cookiesStock.get(cookie) + amount);
        else cookiesStock.put(cookie, amount);
    }

    void addCookieToStorehouse(Cookie cookie, int amount) {

    }

    private void checkType(Cookie cookie) {
        if (cookieType.isEmpty())
            cookieType.add(cookie);
        else for (Cookie c : cookieType) {
            if (c != cookie) {
                cookieType.add(cookie);
                break;
            }
        }
    }

    /**
     * Checks if the cookie can be made by the factory.
     *
     * @param cookie the cookie's type.
     * @return true if the factory can produce this cookie, false otherwise.
     */
    public boolean hasCookieType(Cookie cookie) {
        return cookiesStock.containsKey(cookie);
    }

    /**
     * Add a new cookie type the factory can produce
     *
     * @param cookie the new cookie's type.
     */
    public void addCookieType(Cookie cookie) {
        if (cookieType.contains(cookie))
            cookieType.add(cookie);
    }

    /**
     * Remove a cookie type the factory won't produce anymore.
     *
     * @param cookie the cookie type to remove.
     */
    public void removeCookieType(Cookie cookie) {
        cookieType.remove(cookie);
    }

    List<Cookie> getCookieType() {
        return cookieType;
    }

    public Map<Cookie, Integer> getCookiesStock() {
        return cookiesStock;
    }

}
