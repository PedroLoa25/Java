package c08_oop.exercises_classes;

// 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
public class Student {

    int score;

    public void aprobo() {
        if (score >= 60) {
            System.out.println("Aprobaste");
        } else {
            System.out.println("No aprobaste");
        }
    }
}
