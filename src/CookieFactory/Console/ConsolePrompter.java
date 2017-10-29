package CookieFactory.Console;

import CookieFactory.*;
import CookieFactory.Recipe.*;

import java.io.IOException;
import java.util.Scanner;

/**
 * Class designed to help doing actions related to the
 * cookie factory in the console.
 * <p>
 * System exit meaning :
 * 0 : everything is ok
 * 1 : something went bad
 */
public class ConsolePrompter {

    private Scanner userInput;
    private CookieFactory cookieFactory;

    private enum Mode {NONE, COOKIE_FACTORY, MANAGER, CUSTOMER}

    private Mode mode;
    private int ioStatus;
    private static final String PROMPTER = "\n\n> ";
    private static final String TYPE_ACTION = "\nType one of the actions below in the console :";
    private static final String INCORRECT_ACTION = "\" doesn't exist.\nPlease choose one the existing actions.\n";

    public ConsolePrompter() {
        userInput = new Scanner(System.in);
        cookieFactory = new CookieFactory();
        setupBasicCookieFactory();
        mode = Mode.NONE;
        ioStatus = 2;
    }

    private void setupBasicCookieFactory() {
        Recipe recipe = new Recipe(Dough.CHOCO, Flavour.CHILI, Topping.M_AND_M, Mix.MIXED, Cooking.CHEWY, 2.50f);
        cookieFactory.addRecipe(recipe);
        Manager manager = new Manager("John Smith", 38, new Date(11, 30));
        cookieFactory.addManager(manager);
        Customer customer = new Customer("Marina Goodstuff", 22);
        cookieFactory.addCustomer(customer);
        Cookie cookie = new Cookie(recipe, 300);
        cookieFactory.addCookieToStock(cookie, 100);
    }

    public void run() throws IOException {
        while (mode == Mode.NONE) {
            launchLoadingScreen();
            scanLoadingScreenInput(userInput.nextLine());
        }
        enterMode();
    }

    private void launchLoadingScreen() {
        String loadingScreen =
                "Type one of the words below in the console to enter a specific mode :";
        loadingScreen += "\ncookie factory mode";
        loadingScreen += "\nmanager mode";
        loadingScreen += "\ncustomer mode";
        loadingScreen += "\nexit";

        System.out.print(loadingScreen + PROMPTER);
    }

    private void cookieFactoryModeInfo() {
        String cookieFactoryMode = "In this mode you'll be able to" +
                " manage the cookie factory's settings.\nFor instance, you" +
                " can manually manage the stock.\nYou can also add new cookies recipes" +
                " or remove some of them.\n";
        System.out.println("\n" + cookieFactoryMode);
    }

    private void managerModeInfo() {
        String managerMode = "In this mode you'll be able to manage cookie factory's" +
                " employees (managers).\nYou can also select a manager and edit either his" +
                " opening time or his profile.\n";
        System.out.println("\n" + managerMode);
    }

    private void customerModeInfo() {
        String customerMode = "In this mode, you'll be able to add a new customer" +
                " of the cookie factory.\nYou can then select a customer and order, " +
                " subscribe, and even edit his profile.\n";
        System.out.println("\n" + customerMode);
    }

    private void scanLoadingScreenInput(String userInput) {
        switch (userInput) {
            case "cookie factory mode":
                cookieFactoryModeInfo();
                mode = Mode.COOKIE_FACTORY;
                break;
            case "manager mode":
                managerModeInfo();
                mode = Mode.MANAGER;
                break;
            case "customer mode":
                customerModeInfo();
                mode = Mode.CUSTOMER;
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                error("\"" + userInput + "\" doesn't exist.\n" +
                        "Please choose one of the existing mode.\n");
                return;
        }
        enterExitPrompter("enter");
        if (ioStatus == 1)
            mode = Mode.NONE;
    }

    private void enterMode() throws IOException {
        switch (mode) {
            case COOKIE_FACTORY:
                while (mode == Mode.COOKIE_FACTORY) {
                    cookieFactoryMode();
                    cfModeAction(userInput.nextLine());
                }
                newLine();
                run();
                break;
            case MANAGER:
                while (mode == Mode.MANAGER) {
                    managerMode();
                    managerModeAction(userInput.nextLine());
                }
                newLine();
                run();
                break;
            case CUSTOMER:
                while (mode == Mode.CUSTOMER) {
                    customerMode();
                    customerModeAction(userInput.nextLine());
                }
                newLine();
                run();
                break;
            default:
                System.exit(1);
        }
    }

    private void cookieFactoryMode() {
        String cfMode = "--- Cookie Factory Mode ---";
        cfMode += TYPE_ACTION;
        cfMode += "\nadd recipe";
        cfMode += "\nremove recipe";
        cfMode += "\nmanage stock";
        cfMode += "\nexit";

        System.out.print(cfMode + PROMPTER);
    }

    private void cfModeAction(String userInput) {
        switch (userInput) {
            case "add recipe":
                cfModeAddRecipe();
                break;
            case "remove recipe":
                cfModeRemoveRecipe();
                break;
            case "manage stock":
                cfModeManageStock();
                break;
            case "exit":
                newLine();
                exitMode("Cookie Factory Mode");
                break;
            default:
                error("\"" + userInput + INCORRECT_ACTION);
        }
    }

    private void cfModeAddRecipe() {

    }

    private void cfModeRemoveRecipe() {

    }

    private void cfModeManageStock() {

    }

    private void managerMode() {
        String managerMode = "--- Manager Mode ---";
        managerMode += TYPE_ACTION;
        managerMode += "\nhire manager";
        managerMode += "\nfire manager";
        managerMode += "\nedit manager profile";
        managerMode += "\nexit";

        System.out.print(managerMode + PROMPTER);
    }

    private void managerModeAction(String userInput) {
        switch (userInput) {
            case "hire manager":
                managerModeHireManager();
                break;
            case "fire manager":
                managerModeFireManager();
                break;
            case "edit manager profile":
                managerModeEditProfile();
                break;
            case "exit":
                newLine();
                exitMode("Manager Mode");
                break;
            default:
                error("\"" + userInput + INCORRECT_ACTION);
        }
    }

    private void managerModeHireManager() {

    }

    private void managerModeFireManager() {

    }

    private void managerModeEditProfile() {

    }

    private void customerMode() {
        String customerMode = "--- Customer Mode ---";
        customerMode += TYPE_ACTION;
        customerMode += "\norder";
        customerMode += "\nsubscribe";
        customerMode += "\nadd new customer";
        customerMode += "\nremove customer";
        customerMode += "\nedit customer profile";
        customerMode += "\nexit";

        System.out.print(customerMode + PROMPTER);
    }

    private void customerModeAction(String userInput) {
        switch (userInput) {
            case "order":
                customerModeOrder();
                break;
            case "subscribe":
                customerModeSubscribe();
                break;
            case "add new customer":
                customerModeAddCustomer();
                break;
            case "remove customer":
                customerModeRemoveCustomer();
                break;
            case "edit customer profile":
                customerModeEditProfile();
                break;
            case "exit":
                newLine();
                exitMode("Customer Mode");
                break;
            default:
                error("\"" + userInput + INCORRECT_ACTION);
        }
    }

    private void customerModeOrder() {

    }

    private void customerModeSubscribe() {

    }

    private void customerModeAddCustomer() {

    }

    private void customerModeRemoveCustomer() {

    }

    private void customerModeEditProfile() {

    }

    private void exitMode(String currentMode) {
        enterExitPrompter("exit");
        if (ioStatus == 0) {
            System.out.println(currentMode + " exited...");
            mode = Mode.NONE;
        }
    }

    private void enterExitPrompter(String inOut) {
        System.out.print("Are you sure you want to " + inOut + "? (y/n)" + PROMPTER);
        String decision = this.userInput.nextLine();
        if ("yes".equals(decision) || "y".equals(decision)) {
            System.out.println();
            ioStatus = 0;
            return;
        } else if ("no".equals(decision) || "n".equals(decision)) {
            System.out.println();
            ioStatus = 1;
            return;
        }
        error("please type yes (or y), or no (or n).\n");
        enterExitPrompter(inOut);
    }

    private void newLine() {
        System.out.println();
    }

    private void error(String message) {
        System.out.println("\nError : " + message);
    }

}
