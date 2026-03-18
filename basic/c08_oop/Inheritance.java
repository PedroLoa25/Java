package c08_oop;

public class Inheritance {

    static void main() {

        //Herencia
        var animal = new Animal("Mi animal");
//        animal.name = "Mi animal";
        animal.eat();

        var dog = new Dog("Bruno",5);
//        dog.name = "Bruno";
        dog.eat();

        var cat = new Cat("Perxita");
//        cat.name = "Perxita";
        cat.eat();

        var bird = new Bird("Red");
//        bird.name = "Red";
        bird.eat();
        bird.fly();
    }

    public static class Animal {

        String name;

        public Animal(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }
    }

    public static class Dog extends Animal {

        int age;

        public Dog(String name, int age) {
            super(name);
            this.age = age;
        }

        @Override
        public void eat() {
            System.out.println("El perro con nombre " + name + " esta comiendo");
        }
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal {

        public Bird(String name) {
            super(name);
        }

        public void fly() {
            System.out.println("Esta volando");
        }
    }
}
