package c10_extras;

// Exercise 9: Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
public class User {

    final static String APP_NAME = "MyApp";
    static String username = "Loa";

    public static void print() {
        System.out.println("App name: " + APP_NAME);
        System.out.println("Username: " + username);
    }
}
