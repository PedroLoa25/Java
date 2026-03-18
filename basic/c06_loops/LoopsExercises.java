package c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercises {

    static void main() {

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> names = new ArrayList<>();
        names.add("Pedro");
        names.add("Eduardo");
        names.add("Loa");

        int index = 0;
        do {
            System.out.println(names.get(index));
            index++;
        } while (index < names.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        System.out.println(sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        for (i = 0; i < numbers.length; i++) {
            System.out.println( numbers[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        var map = new HashMap<String, String>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        for (var item: set) {
            System.out.println(item);
        }

        for (var entry: map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] numbers2 = {1, -2, 3, -4, 5};
        for (int number2: numbers2) {
            if (number2 < 0) {
                break;
            }
            System.out.println(number2);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int num = 5;
        int factorial = 1;
        for (i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
