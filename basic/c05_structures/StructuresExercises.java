package c05_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    static void main() {

        // 1. Crea un array con 5 valores e imprime su longitud.
        int[] edades = new int[5];
        edades[0] = 1;
        edades[1] = 2;
        edades[2] = 3;
        edades[3] = 4;
        edades[4] = 5;
        System.out.println(edades.length);

        // 2. Modifica uno de los valores del array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(edades[4]);
        edades[4] = 67;
        System.out.println(edades[4]);

        // 3. Crea un ArrayList vacío.
        var list = new ArrayList<String>();
        System.out.println(list.size());

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        list.add("str1");
        list.add("str2");
        list.add("str3");
        list.add("str4");
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list.size());

        // 5. Crea un HashSet con 2 valores diferentes.
        var hashSet = new HashSet<String>();
        hashSet.add("str1");
        hashSet.add("str2");
        System.out.println(hashSet.size());

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        hashSet.add("str1");
        hashSet.add("str3");
        System.out.println(hashSet);

        // 7. Elimina uno de los elementos del HashSet.
        hashSet.remove("str1");
        System.out.println(hashSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var hashMap = new HashMap<String, Integer>();
        hashMap.put("Pedro", 123456789);
        hashMap.put("Eduardo", 987654321);
        hashMap.put("Loa", 111111111);
        System.out.println(hashMap);

        // 9. Modifica uno de los contactos y elimina otro.
        hashMap.put("Pedro", 987654321);
        hashMap.remove("Eduardo");
        System.out.println(hashMap);

        // 10. Dado un array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] array = new String[5];
        array[0] = "str1";
        array[1] = "str2";
        System.out.println(array[1]);
        System.out.println(array.length);
        var finalList = new ArrayList<>(Arrays.asList(array));
        finalList.add("str2");
        System.out.println(finalList);
        System.out.println(finalList.size());
        var finalSet = new HashSet<>(finalList);
        System.out.println(finalSet);
        System.out.println(finalSet.size());

        var finalMap = new HashMap<String, String>();
        for (String item : finalSet) {
            if (item != null) {
                finalMap.put(item, item);
            }
        }
        System.out.println(finalMap);

    }
}
