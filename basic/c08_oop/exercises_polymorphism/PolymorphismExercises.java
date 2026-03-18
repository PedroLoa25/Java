package c08_oop.exercises_polymorphism;

import java.util.ArrayList;

public class PolymorphismExercises {

    static void main() { 

        // Exercise 1
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());

        for (var animal : animals) {
            animal.makeSound();
        }

        // Exercise 2
        var circle = new Circle(5);
        var rectangle = new Rectangle(10, 5);
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());

        // Exercise 3
        var printer = new Printer();
        printer.print("Hello");
        printer.print(123);
        printer.print(45.67);

        // Exercise 4
        var greeter = new Greeter();
        greeter.greet();
        greeter.greet("Loa");

        // Exercise 5
        var vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        for (var vehicle : vehicles) {
            vehicle.start();
        }

        // Exercise 6
        sendNotification(new EmailNotification());
        sendNotification(new SMSNotification());

        // Exercise 7
        showAnimalType(new Dog());
        showAnimalType(new Cat());
        showAnimalType(new Horse());

        // Exercise 8
        var converter = new Converter();
        System.out.println(converter.convert(123));
        System.out.println(converter.convert(45.67));
        System.out.println(converter.convert("Hello"));

        // Exercise 9
        var products = new ArrayList<Product>();
        products.add(new Book(100, 10));
        products.add(new Electronic(200, 25));

        for (var product : products) {
            System.out.println(product.getPrice());
        }

        // Exercise 10
        var characters = new ArrayList<Character>();
        characters.add(new Warrior());
        characters.add(new Archer());
        characters.add(new Mage());

//        Character[] charactersArray = {
//                new Warrior(),
//                new Archer(),
//                new Mage()
//        };

        for (var character : characters) {
            character.Attack();
        }
    }

    // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
    public static class Animal {

        public void makeSound() {
            System.out.println("Animal sound");
        }

        public String getType() {
            return getClass().getSimpleName();
        }
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Woof");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public static class Cow extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Moo");
        }
    }

    // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
    public static class Shape {

        public double calculateArea() {
            return 0;
        }
    }

    public static class Circle extends Shape {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    public static class Rectangle extends Shape {

        double width;
        double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
    public static class Printer {

        public void print(String s) {
            System.out.println(s);
        }

        public void print(int i) {
            System.out.println(i);
        }

        public void print(double d) {
            System.out.println(d);
        }
    }

    // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
    public static class Greeter {

        public void greet() {
            System.out.println("Hello");
        }

        public void greet(String name) {
            System.out.println("Hello, " + name);
        }
    }

    // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
    public static class Vehicle {

        public void start() {
            System.out.println("Starting...");
        }
    }

    public static class Car extends Vehicle {

        @Override
        public void start() {
            System.out.println("Car starting...");
        }
    }

    public static class Bike extends Vehicle {

        @Override
        public void start() {
            System.out.println("Bike starting...");
        }
    }

    public static class Truck extends Vehicle {

        @Override
        public void start() {
            System.out.println("Truck starting...");
        }
    }

    // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
    public static class Notification {

        public void send() {
            System.out.println("Sending notification...");
        }
    }

    public static class EmailNotification extends Notification {

        @Override
        public void send() {
            System.out.println("Sending email notification...");
        }
    }

    public static class SMSNotification extends Notification {

        @Override
        public void send() {
            System.out.println("Sending SMS notification...");
        }
    }

    public static void sendNotification(Notification n) {
        n.send();
    }

    // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
    public static void showAnimalType(Animal animal) {
        System.out.println(animal.getType());
    }

    public static class Horse extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Neigh");
        }
    }

    // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
    public static class Converter {

        public String convert(int i) {
            return String.valueOf(i);
        }

        public String convert(double d) {
            return String.valueOf(d);
        }

        public String convert(String s) {
            return s;
        }
    }

    // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
    public static class Product {

        double price;

        public Product(double price) {
            this.price = price;
        }

        public double getPrice() {
            return price;
        }
    }

   public static class Book extends Product {

        double discount;

       public Book(double price, double discount) {
           super(price);
           this.discount = discount;
       }

       @Override
       public double getPrice() {
           return price - (price * discount/100);
       }
   }

   public static class Electronic extends Product {

        double discount;

       public Electronic(double price, double discount) {
           super(price);
           this.discount = discount;
       }

       @Override
       public double getPrice() {
           return price - (price * discount/100);
       }
   }

    // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    public static class Character {

        public void Attack() {
            System.out.println("Ataque!");
        }
    }

    public static class Warrior extends Character {

        @Override
        public void Attack() {
            System.out.println("Ataque de guerrero!");
        }
    }

    public static class Archer extends Character {

        @Override
        public void Attack() {
            System.out.println("Ataque de arquero!");
        }
    }

    public static class Mage extends Character {

        @Override
        public void Attack() {
            System.out.println("Ataque de mago!");
        }
    }
}
