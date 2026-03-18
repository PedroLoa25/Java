package c08_oop.exercises_classes;

// 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
// 3. Añade un constructor a la clase Book que reciba title y author.
public class Book {

    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showData() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
