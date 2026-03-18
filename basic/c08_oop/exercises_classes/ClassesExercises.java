package c08_oop.exercises_classes;

import java.util.ArrayList;

public class ClassesExercises {

    static void main() {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        var book = new Book("Java", "Pedro");

//        book.title = "Java";
//        book.author = "Pedro";

        book.showData();

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        var dog = new Dog();
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        book.showData();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        var car = new Car();

        car.brand = "Toyota";
        car.model = "Corolla";

        car.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        var student = new Student();

        student.score = 60;

        student.aprobo();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        var bankAccount = new BankAccount();

        bankAccount.balance = 1000;

        bankAccount.deposit(500);

        bankAccount.showBalance();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        var rectangle = new Rectangle();

        System.out.println(rectangle.calcularArea(5,8));

        System.out.println(rectangle.calcularPerimetro(5,8));

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        var worker = new Worker("Pedro", 1000);

        worker.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        var people = new ArrayList<Person>();
        people.add(new Person("Pedro", 30));
        people.add(new Person("Eduardo", 25));
        people.add(new Person("Loa", 20));

        System.out.println(people);

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        var product = new Product("Leche",246);
        product.disccount(15);
    }
}