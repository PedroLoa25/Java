package c10_extras;

import java.util.Random;
import java.util.Scanner;

public class ExtrasExercises {

    // Exercise 4
    static String message = "Hola mundo";

    static void main() {

        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla.
         String str = "Loa";

        if (str == null) {
            System.out.println("La cadena es null.");
        } else if (str.isEmpty() || str.isBlank()) {
            System.out.println("La cadena esta vacía.");
        } else {
            System.out.println("La cadena tiene contenido: " + str);
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String name = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int age = sc.nextInt();
        System.out.println("Tu nombre es " + name + " y tu edad es " + age);

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        final int MAX_SCORE = 100;
        System.out.println(MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del método main(). Muestra ambas.
        System.out.println(message); // Variable global
        String message = "Hola desde main()"; // Variable local
        System.out.println(message); // Variable local

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        System.out.println("Introduce un numero: ");
        Scanner sc2 = new Scanner(System.in);
        var num = sc2.nextInt();

        if (num > 0) {
            System.out.println("El numero es positivo");
        }
        else if (num < 0) {
            System.out.println("El numero es negativo");
        }
        else {
            System.out.println("El numero es cero");
        }

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println(ExampleClass.classVariable);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        var random = new Random();
        System.out.println(random.nextInt(10) + 1);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        CommentClass.main();

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        User.print();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.

    }
}
