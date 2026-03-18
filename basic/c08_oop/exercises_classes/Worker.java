package c08_oop.exercises_classes;

// 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
public class Worker {

    String name;
    int salary;

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void showSalary() {
        System.out.println("Salario: " + salary);
    }
}
