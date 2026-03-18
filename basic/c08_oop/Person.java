package c08_oop;

public class Person {

    // Atributos
    protected String name;
    private int age;
    private final String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.setAge(age);
        this.id = id;
    }

    // Métodos
    public void sayHello() {
        System.out.println("Hola, soy " + name + " tengo " + age + " años, y mi id es " + id + ".");
    }

    // Getter
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no valida");
        }
    }

    // to String
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
