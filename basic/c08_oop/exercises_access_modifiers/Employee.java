package c08_oop.exercises_access_modifiers;

// 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
public class Employee {

    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent/100;
            System.out.println("El salario es: " + salary);
        } else {
            System.out.println("El porcentaje no es valido");
        }
    }
}
