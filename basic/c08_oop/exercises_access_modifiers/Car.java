package c08_oop.exercises_access_modifiers;

// 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
public class Car {

    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    public void accelerate(int amount) {
        if (speed + amount > 120) {
            speed = 120;
            System.out.println("La velocidad es: " + speed + " km/h");
        } else {
            speed += amount;
            System.out.println("La velocidad es: " + speed + " km/h");
        }
    }

    public void brake(int amount) {
        if (speed - amount < 0) {
            speed = 0;
            System.out.println("La velocidad es: " + speed + " km/h");
        } else {
            speed -= amount;
            System.out.println("La velocidad es: " + speed + " km/h");
        }
    }
}
