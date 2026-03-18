package c08_oop.exercises_access_modifiers;

// 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
public class Product {

    private double price;

    public Product(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
            System.out.println("El precio del producto es: " + price);
        } else {
            System.out.println("El precio no es valido");
        }
    }
}
