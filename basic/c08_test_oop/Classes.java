package c08_test_oop;

import c08_oop.Person;

public class Classes {

    static void main() {

        var person = new Person("Pedro", 18, "123456789A");

//        person.name = "Pedro";
//        person.age = 18;

        person.sayHello();

//        person.name = "Pedro Eduardo";
//        System.out.println(person.name);
    }
}

