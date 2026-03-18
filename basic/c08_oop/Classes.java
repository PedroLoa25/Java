package c08_oop;

public class Classes {

    static void main() {

        var person = new Person("Pedro", -18, "123456789A");

//        person.name = "Pedro";
//        person.age = 18;

        person.sayHello();

        person.name = "Pedro Eduardo";
        System.out.println(person.name);

//        person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(18);
        System.out.println(person.getAge());

        var person2 = new Person("Loa", 19, "123456789B");
        person2.sayHello();
    }
}

