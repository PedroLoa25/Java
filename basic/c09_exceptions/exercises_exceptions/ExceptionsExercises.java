package c09_exceptions.exercises_exceptions;

import java.util.Arrays;

public class ExceptionsExercises {

    static void main() {

        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        var a = 10;
        var b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        String str = null;

        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        try {
            System.out.println(stringToNumber("0"));
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        String[] names = {"Pedro", "Loa", "Eduardo"};

        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            for (String name : names) {
                System.out.println(name);
            }
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        int num = -1;

        try {
            if (num < 0) {
                throw new IllegalArgumentException("El número debe ser positivo");
            }

            System.out.println("Numero positivo");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        try {
            TemperatureChecker.checkTemperature(10);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        int num2 = 14;
        int num3 = 2;
        int[] numbers2 = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(num2 / num3);
            System.out.println(numbers2[6]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        try {
            checkPassword("12345");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        LoginSystem loginSystem = new LoginSystem();
        try {
            loginSystem.login("Loa", "123Pepe");
        } catch (LoginFailedException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    // Exercise 4
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    // Exercise 7
    public static class TemperatureException extends Exception {
        public TemperatureException(String message) {
            super(message);
        }
    }

    public static class TemperatureChecker {

        public static void checkTemperature(int temperature) throws TemperatureException {
            if (temperature < -50 || temperature > 50) {
                throw new TemperatureException("La temperatura debe estar entre -50 y 50");
            }

            System.out.println("Temperatura válida: " + temperature + "°C dentro del rango permitido.");
        }
    }

    // Exercise 9
    public static void checkPassword(String pass) {
        if (pass.length() < 8) {
            throw new IllegalArgumentException("La contraseña es demasiado corta. Debe tener al menos 8 caracteres.");
        } else {
            System.out.println("Contraseña valida");
        }
    }

    // Exercise 10
     public static class LoginFailedException extends Exception {

        public LoginFailedException(String message) {
            super(message);
        }
    }

    public static class LoginSystem {

        private final String username = "Loa";
        private final String password = "123Pepe";

        public void login(String username, String password) throws LoginFailedException {
            if (!this.username.equals(username) || !this.password.equals(password)) {
                throw new LoginFailedException("Usuario o contraseña incorrectos");
            } else {
                System.out.println("Login exitoso");
            }
        }
    }
}
