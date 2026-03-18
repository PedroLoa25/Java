package c08_oop.exercises_classes;

// 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
public class Product {

    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void disccount(int percent) {
        price -= (price * percent) / 100;
        System.out.println("El precio del producto es: " + price);
    }
}