package c10_extras;

import c08_oop.Classes;
import c08_oop.Person;

import java.util.Scanner;
//import c08_oop.*;

public class Extras {

    static String globalName = "Loa";

    static void main() {

        // Extras

        // null
        String name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // imports
        new Person("Pedro",18,"1");
        new Classes();

        // Scanner
        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();
        System.out.println("La edad es: " + age);

        // Scope: variables globales y locales
        test();

        // Static

    }

    public static void test() {
        System.out.println(globalName);
    }
}
