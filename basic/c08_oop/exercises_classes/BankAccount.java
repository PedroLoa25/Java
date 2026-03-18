package c08_oop.exercises_classes;

// 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
public class BankAccount {

    int balance;

    void deposit(int amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
