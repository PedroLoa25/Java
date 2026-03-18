package c08_oop.exercises_inheritance;

import java.util.ArrayList;
import java.util.Arrays;

public class InheritanceExercises {

    static void main() {

        var car = new Car();
        car.move();
        car.honk();

        var student = new Student();
        student.name = "Pedro";
        student.age = 18;
        student.grade = 20;
        student.study();
        System.out.println(student.name + " " + student.age + " " + student.grade);

        var dog = new Dog();
        dog.makeSound();

        var cat = new Cat();
        cat.makeSound();

        var manager = new Manager();
        manager.name = "Loa";
        manager.salary = 1000;
        manager.department = "IT";
        System.out.println(manager.name + " " + manager.salary + " " + manager.department);

        var circle = new Circle(5);
        System.out.println("Área del círculo: " + circle.calculateArea());

        var rectangle = new Rectangle(4, 5);
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());

        var eagle = new Eagle();
        eagle.fly();

        var phone = new Phone();

        var savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(900);
        System.out.println("Saldo: " + savingsAccount.balance);
        savingsAccount.addInterest(14);
        System.out.println("Saldo: " + savingsAccount.balance);

        var car2 = new Car2();
        car2.describe();

        var bike2 = new Bike2();
        bike2.describe();

        var truck2 = new Truck2();
        truck2.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        var animals = new ArrayList<Animal>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());

        for (var animal : animals) {
            animal.makeSound();
        }
        
    }

    // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
    public static class Vehicle {

        public void move() {
            System.out.println("Moviendo...");
        }
    }

    public static class Car extends Vehicle {

        public void honk() {
            System.out.println("Honk!");
        }
    }

    // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
    public static class Person {

        String name;
        int age;
    }

    public static class Student extends Person {

        int grade;

        public void study() {
            System.out.println("Estoy estudiando");
        }
    }


    // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
    public static class Animal {

        public void makeSound() {
            System.out.println("Animal sound");
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

    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
    public static class Employee {

        String name;
        int salary;
    }

    public static class Manager extends Employee {

        String department;
    }

    // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
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

    // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
    public static class Bird extends Animal {

        @Override
        public void makeSound() {
            System.out.println("Tweet");
        }

        public void fly() {
            System.out.println("Volando...");
        }
    }

    public static class Eagle extends Bird {
        @Override
        public void fly() {
            System.out.println("Águila volando...");
            super.fly();
        }
    }

    // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
    public static class Device {
        public Device() {
            System.out.println("Device created");
        }
    }

    public static class Phone extends Device {
        public Phone() {
            System.out.println("Phone ready");
        }
    }

    // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
    public static class Account {

        double balance;

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }
    }

    public static class SavingsAccount extends Account {

        public void addInterest(int interestRate) {
            balance += balance * interestRate / 100;
        }
    }

    // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
    public static class Vehicle2 {

        public void describe() {
            System.out.println("Vehicle");
        }
    }

    public static class Car2 extends Vehicle2 {

        @Override
        public void describe() {
            System.out.println("Car");
        }
    }

    public static class Bike2 extends Vehicle2 {

        @Override
        public void describe() {
            System.out.println("Bike");
        }
    }

    public static class Truck2 extends Vehicle2 {
        @Override
        public void describe() {
            System.out.println("Truck");
        }
    }
}
