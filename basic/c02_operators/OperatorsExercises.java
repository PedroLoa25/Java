package c02_operators;

public class OperatorsExercises {

    static void main() {

        // 1. Crea una variable con el resultado de cada operación aritmética.
        int suma;
        suma = 7 + 5;
        System.out.println(suma);
        int resta;
        resta = 7 - 5;
        System.out.println(resta);
        int multiplicacion;
        multiplicacion = 7 * 5;
        System.out.println(multiplicacion);
        int division;
        division = 10 / 5;
        System.out.println(division);
        int modulo;
        modulo = 7 % 6;
        System.out.println(modulo);


        // 2. Crea una variable para cada tipo de operación de asignación.
        int x = 10;
        System.out.println(x);
        x += 5;
        System.out.println(x);
        x -= 5;
        System.out.println(x);
        x *= 5;
        System.out.println(x);
        x /= 5;
        System.out.println(x);
        x %= 5;
        System.out.println(x);

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(7 >= 5);
        System.out.println(1 == 1);
        System.out.println(8 <= 10);

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(7 <= 5 );
        System.out.println(1 == 2);
        System.out.println(8 >= 10);

        // 5. Utiliza el operador lógico and.
        System.out.println(5 < 4 && 6 > 7); // false
        System.out.println(8 > 1 && 7 > 9); // false
        System.out.println(9 > 5 && 3 > 1); // true

        // 6. Utiliza el operador lógico or.
        System.out.println(5 < 4 || 6 > 7); // false
        System.out.println(8 > 1 || 7 > 9); // true
        System.out.println(9 > 5 || 3 > 1); // true

        // 7. Combina ambos operadores lógicos.
        System.out.println((5 < 4 || 6 > 7) && (8 > 1 || 7 > 4)); // false
        System.out.println((8 > 1 && 7 > 9) || (9 > 5 && 3 > 1)); // true

        // 8. Añade alguna negación.
        System.out.println(!(5 < 4 || 6 > 7) && (8 > 1 || 7 > 4)); // true
        System.out.println(!(8 > 1 && 7 > 9) || (9 > 5 && 3 > 1)); // true

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        int num;
        num = 7;
        System.out.println(num); // 7
        System.out.println(++num); // 8
        System.out.println(--num); // 7
        System.out.println(num++); // 7
        System.out.println(num--); // 8
        System.out.println(-num); // -7
        System.out.println(+num); // 7


        // 10. Combina operadores aritméticos, de comparación y lógicos.
        boolean result1;
        result1 = ((7 % 3 == 1) && (9 * 2 >= 19) || !(8 + 6 == 14)); // false
        System.out.println(result1);

        boolean result2;
        result2 = ((7 % 3 == 1) && !(9 * 2 >= 19) || !(8 + 6 == 14)); // true
        System.out.println(result2);
    }
}
