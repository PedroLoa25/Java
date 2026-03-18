package c09_exceptions;

public class Exceptions {

    static void main() {

        // Manejo de excepciones

        // try catch
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        // try con multiples catch
        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Pedro";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Division no posible: " + e);
        } catch (NullPointerException e) {
            System.out.println("Ocurrió un null pointer: " + e);
        } catch (Exception e) {
            System.out.println("Ocurrió un error no esperado: " + e);
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad : " + e.getMessage());
        }

        // Excepción personalizada
        try {
            throwExample.checkScore(500);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }
}
