package c08_oop;

public class Composition {

    static void main() {

        // Composición
        var car = new Car();
        car.on();
    }

    public static class Engine {

        public void on() {
            System.out.println("Motor encendido");
        }
    }

    public static class Car {

        private final Engine engine = new Engine();

        public void on() {
            engine.on();
        }
    }
}
