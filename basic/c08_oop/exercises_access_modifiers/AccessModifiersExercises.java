package c08_oop.exercises_access_modifiers;

public class AccessModifiersExercises {

    static void main() {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person = new Person("Pedro", 18);
        System.out.println(person.getAge());
        person.setAge(20);
        System.out.println(person.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var product = new Product(50);
        product.setPrice(100);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        var bankAccount = new BankAccount(1000);
        bankAccount.deposit(500);
        bankAccount.withdraw(100);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        var book = new Book("Lord of the Mysteries");
        System.out.println(book.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperature = new Temperature(10);
        temperature.setCelsius(-100);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        var user = new User("pedro", "123456");
        user.checkPassword("123456");
        user.setUsername("juan");
        user.setPassword("222111");
        user.checkPassword("222111");

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var employee = new Employee(1450);
        employee.raiseSalary(50);

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangle = new Rectangle(5, 8);
        System.out.println("El área es: " + rectangle.calculateArea());
        rectangle.setWidth(10);
        rectangle.setHeight(15);
        System.out.println("El área es: " + rectangle.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        var student = new Student(60);
        System.out.println(student.isPassed());
        student.setGrade(50);
        System.out.println(student.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        var car = new Car(100);
        car.accelerate(50);
        car.brake(20);
    }
}
