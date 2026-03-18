package c07_functions;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    static void main() {

        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        // ...

        sendEmail();

        sendEmailToUser("loa@gmail.com");

        sendEmailToUser("loa@gmail.com", "Loa");

        var users = new ArrayList<>(Arrays.asList("pedro@gmail.com", "eduardo@gmail.com", "loa@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("loa@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Email enviado");
    }

    // Función con parámetros
    public static void sendEmailToUser(String email) {
        System.out.println("Email enviado a " + email);
    }

    // Sobrecarga de funciones
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Email enviado a " + name + "(" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            sendEmailToUser(email);
        }
    }

    // Función con retorno
    public static boolean sendEmailWithState(String email) {

        if (email.isEmpty()) {
            return false;
        }

        System.out.println("Email enviado a " + email);
        return true;
    }
}
