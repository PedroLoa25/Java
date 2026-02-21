package c01_beginner;

public class DataTypes {

    static void main() {

        // Tipos de datos primitivos.

        int myInt = 37;
        System.out.println(myInt);

        double myDouble = 1.71;
        System.out.println(myDouble);
        // float, long, byte

        char myChar = 'p';
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java";
        System.out.println(myString);

        // Tipo de dato en tiempo de compilacion

        System.out.println(myString.getClass().getSimpleName());
    }
}
