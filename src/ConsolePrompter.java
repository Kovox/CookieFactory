import CookieFactory.CookieFactory;

import java.util.Scanner;

/**
 * Class designed to help doing actions related to the
 * cookie factory in the console.
 */
public class ConsolePrompter {

    private Scanner userInput;
    private CookieFactory cookieFactory;

    public ConsolePrompter() {
        userInput = new Scanner(System.in);
        cookieFactory = new CookieFactory();
    }

    public void run() {
        launchLoadingScreen();

    }

    private void launchLoadingScreen() {
        String loadingScreen =
                "Type one of the words below in the console to start enter a specific mode :";
        loadingScreen += "\ncookie factory mode";
        loadingScreen += "\nmanager mode";
        loadingScreen += "\ncustomer mode";
        loadingScreen += "\nexit";

        System.out.println(loadingScreen);
    }

    private void cookieFactoryModeInfo() {
        String cookieFactoryMode = "In this mode you'll be able to" +
                "manage the cookie factory's settings. For instance, you" +
                "can manually manage the stock, you can also "
    }

    private void managerModeInfo() {

    }

    private void customerModeInfo() {

    }

}
