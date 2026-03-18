package c10_extras;

import java.util.Scanner;

/**
 * Clase principal que demuestra el uso de entrada de datos,
 * validaciones básicas y estructuras de control en Java.
 */
public class CommentClass {

    static void main() {

        // Crear objeto Scanner para leer datos desde la consola
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre de usuario
        System.out.print("Ingrese su nombre: ");
        String name = scanner.nextLine();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int age = scanner.nextInt();

        // Validar edad mínima
        if (age < 18) {
            System.out.println("Acceso denegado: Debe ser mayor de edad.");
        } else {

            // Generar un ID simple basado en el nombre y edad
            String userId = generateUserId(name, age);

            // Mostrar información del usuario
            System.out.println("Registro exitoso.");
            System.out.println("Usuario: " + name);
            System.out.println("Edad: " + age);
            System.out.println("ID generado: " + userId);
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }

    /**
     * Método que genera un ID de usuario simple combinando
     * el nombre en minúsculas y la edad.
     *
     * @param name Nombre del usuario
     * @param age Edad del usuario
     * @return ID generado
     */
    public static String generateUserId(String name, int age) {

        // Convertir el nombre a minúsculas y eliminar espacios
        String cleanName = name.toLowerCase().replace(" ", "");

        // Concatenar nombre limpio con la edad
        return cleanName + age;
    }
}