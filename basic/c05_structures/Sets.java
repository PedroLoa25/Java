package c05_structures;

import java.util.HashSet;

public class Sets {

    static void main() {

        // Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Pedro");
        names.add("Eduardo");
        names.add("Loa");
        names.add("loa@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Eliminar elementos
        names.remove("Pedro");
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Pedro"));
        System.out.println(names.contains("loa@gmail.com"));

        System.out.println(names);
        names.add("Eduardo");
        names.add("Eduardo");
        names.add("Eduardo");
        System.out.println(names);

        // Conjuntos
        // names.addAll(numbers); Error
        var countries = new HashSet<String>();
        countries.add("Perú");
        countries.add("Chile");
        countries.add("Colombia");
        countries.add("Loa");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);
    }
}
