package c01_beginner;

public class VariablesAndConstants {

    static void main() {

        // Variables

        String name = "Pedro";
        System.out.println(name);

        name = "Eduardo";
        System.out.println(name);

        // name = 18; Error (no podemos cambiar el tipo de dato)

        int age = 18;
        System.out.println(age);

        var email = "ploayza1234@gmail.com";
        System.out.println(email);

        var year = 2025;
        System.out.println(year);

        // Constantes

        final String EMAIL = "ploayza1234@gmail.com";
        // EMAIL = "eloayza@gmail.com"; Es constante
        System.out.println(EMAIL);
    }
}