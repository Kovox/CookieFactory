package CookieFactory;

/**
 * A manager of the cookie factory.
 */
public class Manager {

    private String name;
    private int age;
    private Date openingTime;

    public Manager(String name, int age, Date openingTime) {
        this.name = name;
        this.age = age;
        this.openingTime = openingTime;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getOpeningTime() {
        return openingTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOpeningTime(Date openingTime) {
        this.openingTime = openingTime;
    }

    @Override
    public String toString() {
        String manager = "Manager's name : " + name;
        manager += "\nAge : " + age;
        manager += "\nOpening time : " + openingTime.toString();

        return manager;
    }

}
