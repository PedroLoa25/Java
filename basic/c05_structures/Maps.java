package c05_structures;

import java.util.HashMap;
    
public class Maps {

    static void main() {

        // Declaración y creación
        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        // Tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.put("Pedro","pedro@gmail.com");
        names.put("Eduardo","eduardo@gmail.com");
        names.put("Loa","loa@gmail.com");
        System.out.println(names.size());
        System.out.println(names);

        // Acceder a los elementos
        System.out.println(names.get("Eduardo"));
        System.out.println(names.get("Dev"));

        // Verificar elementos
        System.out.println(names.containsKey("Eduardo"));
        System.out.println(names.containsKey("Dev"));
        System.out.println(names.containsValue("eduardo@gmail.com"));
        System.out.println(names.containsValue("dev@gmail.com"));

        // Eliminar elementos
        System.out.println(names.remove("Eduardo"));
        System.out.println(names.remove("Loa"));
        System.out.println(names);

        // Limpiar HashMap
        names.clear();
        System.out.println(names);

        // Modificación elementos
        names.put("Pedro","pedro@gmail.com");
        System.out.println(names);
        names.put("Pedro","pedroeduardo@gmail.com");
        System.out.println(names);
        names.replace("Eduardo","eduardodev@gmail.com"); // Reemplaza el valor si existe
        System.out.println(names);
        names.putIfAbsent("Eduardo","eduardodev@gmail.com");
        System.out.println(names);

        // Otras operaciones
        System.out.println(names.isEmpty());
        var values = names.values();
        System.out.println(values);

    }
}
