package c07_functions;

import java.util.ArrayList;

public class FunctionsExercises {

    static void main() {

        welcome();

        greet("Pedro");

        System.out.println(substract(10, 5));

        System.out.println(square(3));

        isEven(10);

        System.out.println(esMayorDeEdad(17));

        System.out.println(longitud("Hola mundo"));

        System.out.println(media(new int[]{1, 2, 3, 4, 5, 6}));

        System.out.println(factorial(5));

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Hola");
        lista.add("Mundo");
        lista.add("Java");
        recorrerArrayList(lista);
    }

    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void welcome() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void greet(String name) {
        System.out.println("Hola " + name);
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static int substract(int a, int b) {
        return a - b;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static int square(int n) {
        return n * n;
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " es par");
        } else {
            System.out.println(n + " es impar");
        }
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean esMayorDeEdad(int edad) {

        if (edad >= 18) {
            return true;
        }

        return false;
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static String longitud(String cadena) {
        return "La cadena mide " +  cadena.length();
    }

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static double media(int[] numeros) {
        double suma = 0;
        for (int numero: numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }

    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void recorrerArrayList(ArrayList<String> lista) {
        for (String elemento: lista) {
            System.out.println(elemento);
        }
    }
}
