package c04_conditionals;

public class ConditionalsExercises {

    static void main() {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int age = 18;

        if (age >= 18) {
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("El usuario no puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 3;
        int b = 2;

        if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else if (a == b) {
            System.out.println(a + " es igual que " + b);
        } else {
            System.out.println(b + " es menor que " + a);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        int num = -8;

        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es negativo");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        int num2 = 0;

        if (num2 == 0) { // Primero verificas si es cero
            System.out.println("El numero es cero");
        } else if (num2 % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        int num3 = 101;

        if (1 <= num3 && num3 <= 100) {
            System.out.println("El numero esta en el rango de 1 a 100");
        } else {
            System.out.println("El numero no esta en el rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dato invalido");
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        int nota = 31;

        if (nota >= 70 && nota <= 100) {
            System.out.println("Sobresaliente");
        } else if (nota >= 30 && nota < 70) {
            System.out.println("Aprobado");
        } else if (nota >= 0 && nota < 30) {
            System.out.println("Suspenso");
        } else {
            System.out.println("Nota invalida o incorrecta");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        int edad = 13;
        boolean Acompañante = true;

        if (edad >= 15 || Acompañante) {
            System.out.println("Puede entrar al cine");
        } else {
            System.out.println("No puede entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        char letra = 'u';

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
            letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }

        // 10. Usa tres variables o, p, q y muestra cuál es el mayor de las tres.
        int o = 0;
        int p = 21;
        int q = 22;

        if (o >= p && o >= q) {
            System.out.println("El numero " + o + " es el mayor");
        } else if (p >= o && p >= q) {
            System.out.println("El numero " + p + " es el mayor");
        } else {
            System.out.println("El numero " + q + " es el mayor");
        }
    }
}
