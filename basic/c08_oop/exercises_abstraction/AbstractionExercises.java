package c08_oop.exercises_abstraction;

public class AbstractionExercises {

    static void main(String[] args) {

        // Exercise 1
        var circle = new Circle(5);
        var rectangle = new Rectangle(4, 6);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Exercise 2
        var guitar = new Guitar();
        var piano = new Piano();
        guitar.play();
        piano.play();

        // Exercise 3
        var animals = new Animal[]{new Dog(), new Cat()};

        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Exercise 4
        Drawable circle2 = new Circle2();
        Drawable square = new Square();
        Drawable triangle = new Triangle();
        circle2.draw();
        square.draw();
        triangle.draw();

        // Exercise 5
        Employee loa = new FullTimeEmployee("Loa", 1000);
        Employee pedro = new PartTimeEmployee("Pedro", 20, 40);
        System.out.println("Salario de " + loa.getName() + ": " + loa.calculateSalary());
        System.out.println("Salario de " + pedro.getName() + ": " + pedro.calculateSalary());

        // Exercise 6
        Movable car = new Car();
        Movable robot = new Robot();
        car.move();
        robot.move();

        // Exercise 7
        Appliance tv = new TV();
        Appliance washingMachine = new WashingMachine();
        tv.turnOn();
        tv.turnOff();
        washingMachine.turnOn();
        washingMachine.turnOff();

        // Exercise 8
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        // Exercise 9
        Document pdf = new PDFDocument();
        Document word = new WordDocument();
        pdf.print();
        word.print();

         // Exercise 10
        Payable invoice = new Invoice();
        Payable employeePayment = new EmployeePayment();
        invoice.pay();
        employeePayment.pay();
    }

    // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
    public static abstract class Shape {

        public abstract double calculateArea();
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

    // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
    public interface Playable {

        void play();
    }

    public static class Guitar implements Playable {

        @Override
        public void play() {
            System.out.println("Tocando la guitarra!");
        }
    }

    public static class Piano implements Playable {

        @Override
        public void play() {
            System.out.println("Tocando el piano!");
        }
    }

    // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
    public static abstract class Animal {

        public abstract void makeSound();
    }

    public static class Dog extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Guau!");
        }
    }

    public static class Cat extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Miau!");
        }
    }

    // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
    public interface Drawable {

        void draw();
    }

    public static class Circle2 implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibujando un circulo!");
        }
    }

    public static class Square implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibujando un cuadrado!");
        }
    }

    public static class Triangle implements Drawable {

        @Override
        public void draw() {
            System.out.println("Dibujando un triangulo!");
        }
    }

    // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
    public static abstract class Employee {

        String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract double calculateSalary();
    }

    public static class FullTimeEmployee extends Employee {

        double salary;

        public FullTimeEmployee(String name, double salary) {
            super(name);
            this.salary = salary;
        }

        @Override
        public double calculateSalary() {
            return salary;
        }
    }

    public static class PartTimeEmployee extends Employee {

        double salary;
        int hours;
        double salaryPerHour;

        public PartTimeEmployee(String name, double salaryPerHour, int hours) {
            super(name);
            this.salaryPerHour = salaryPerHour;
            this.hours = hours;

        }

        @Override
        public double calculateSalary() {
            return salary = salaryPerHour * hours;
        }
    }

    // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
    public interface Movable {

        void move();
    }

    public static class Car implements Movable {

        @Override
        public void move() {
            System.out.println("Moviendo el carro...");
        }
    }

    public static class Robot implements Movable {

        @Override
        public void move() {
            System.out.println("Moviendo el robot...");
        }
    }

    // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
    public static abstract class Appliance {

        public abstract void turnOn();
        public abstract void turnOff();
    }

    public static class TV extends Appliance {

        @Override
        public void turnOn() {
            System.out.println("Encendiendo la TV...");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando la TV...");
        }
    }

    public static class WashingMachine extends Appliance {

        @Override
        public void turnOn() {
            System.out.println("Encendiendo la lavadora...");
        }

        @Override
        public void turnOff() {
            System.out.println("Apagando la lavadora...");
        }
    }

    // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
    public interface Flyable {

        void fly();
    }

    public interface Swimmable {

        void swim();
    }

    public static class Duck implements Flyable, Swimmable {

        @Override
        public void fly() {
            System.out.println("Volando...");
        }

        @Override
        public void swim() {
            System.out.println("Nadando...");
        }
    }

    // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
    public static abstract class Document {

        public abstract void print();
    }

    public static class PDFDocument extends Document {

        @Override
        public void print() {
            System.out.println("Imprimiendo un documento PDF...");
        }
    }

    public static class WordDocument extends Document {

        @Override
        public void print() {
            System.out.println("Imprimiendo un documento Word...");
        }
    }

    // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
    public interface Payable {

        void pay();
    }

    public static class Invoice implements Payable {

        @Override
        public void pay() {
            System.out.println("Pagando la factura...");
        }
    }

    public static class EmployeePayment implements Payable {

        @Override
        public void pay() {
            System.out.println("Pagando el empleado...");
        }
    }
}

