package c08_oop.exercises_access_modifiers;

// 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("El saldo es: " + balance);
        } else {
            System.out.println("El monto no es valido");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println("El saldo es: " + balance);
        } else {
            System.out.println("El monto no es valido");
        }
    }
}
