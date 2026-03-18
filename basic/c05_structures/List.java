package c05_structures;

import java.util.ArrayList;

public class List {

    static void main() {

        // Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Pedro");
        names.add("Eduardo");
        names.add("Loa");
        System.out.println(names.size());

        // Acceder a los elementos
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        // Modificar los elementos
        names.set(2, "loa@gmail.com");
        System.out.println(names.getLast());

        // Eliminar elementos
        names.remove(2);
        // System.out.println(names.get(2)); // Error
        System.out.println(names.size());

        // Buscar elementos
        System.out.println(names.contains("Pedro"));
        System.out.println(names.contains("loa@gmail.com"));

        // Limpiar ArrayList
        names.add("Pedro");
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}
