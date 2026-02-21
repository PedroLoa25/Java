package c03_strings;

public class Strings {

    static void main() {

        // Declaración
        String name = "Pedro";
        var surname = new String ("Eduardo");

        // Operaciones básicas
        // Concatenación
        System.out.println(name + " " + surname);

        // Longitud
        System.out.println(name.length());

        // Obtener carácter
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 5));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name);

        // Comprobar si contiene
        System.out.println("Hola, Java".contains("Pedro"));
        System.out.println("Hola, Java".toUpperCase().contains("AVA"));

        // Comparación
        System.out.println(name.equals("Pedro"));
        System.out.println(name.equals("pedro"));
        System.out.println(name.equalsIgnoreCase("pedro"));

        // == vs. equals
        var a = "Pedro";
        var b = "Pedro";
        var c = new String("Pedro");

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true

        // Trim
        System.out.println(" Hola, me llamo Pedro ".trim());

        // Replace
        System.out.println(" Hola, me llamo Pedro ".replace("Pedro", "Eduardo"));

        // Format
        var age = 18;
        System.out.println(String.format("Hola, %s. Tengo %d años", name, age));

    }
}
