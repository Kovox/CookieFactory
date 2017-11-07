package CookieFactory;

/**
 * The different places where the huge supra mega corporation: CookieFactory
 * is implanted.
 */
public enum Place {

    PARIS("Paris address"), NEW_YORK("New-York address"), LONDON("London address"), BERNE("Berne address");

    private String address;

    Place(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return address;
    }

}
