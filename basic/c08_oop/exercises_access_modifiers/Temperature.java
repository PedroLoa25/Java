package c08_oop.exercises_access_modifiers;

// 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
public class Temperature {

    private double celsius;

    public Temperature(double celsius) {
        this.celsius = celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
            System.out.println("El valor es: " + celsius);
        } else {
            System.out.println("El valor no es valido");
        }
    }
}
