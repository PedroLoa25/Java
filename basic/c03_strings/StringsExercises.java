package c03_strings;

public class StringsExercises {

    static void main() {

        // 1. Concatena dos cadenas de texto.
        String str1 = "Hola";
        String str2 = "mundo";
        System.out.println(str1 + " " + str2);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println(str1.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println("Primero: " + str1.charAt(0) + ", Último: " + str1.charAt(str1.length() - 1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        String palabra = "Pedro";
        System.out.println(palabra.toUpperCase());
        System.out.println(palabra.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        String str3 = "Pedro Eduardo";
        System.out.println(str3.contains("Eduardo"));

        // 6. Formatea un string con un entero.
        int cant = 5;
        String prod = "Leche";
        System.out.println(String.format("He comprado %d unidades de %s", cant, prod));

        // 7. Elimina los espacios en blanco al principio y final de un string.
        String str4 = " Buenos días amigos ";
        System.out.println(str4.trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println(str4.replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.
        String str5 = "Loa";
        String str6 = "Loa";
        System.out.println(str5.equals(str6));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(str5.length() == str6.length());
    }
}
