public class Employe {
    final private String firstName;
    final private String lastName;
    final private String fathersName;
    private String position;
    private String email;
    private int age;
    private double salary;

    /**
     * Конструктор за замовчуванням неможливо створити не проініціалізувавши final змінні
     // Employe() {
     // }
     **/

    public Employe(String firstName, String lastName, String fathersName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
    }

    /**
     * Конструктор з усіма полями
     **/
    public Employe(String firstName, String lastName, String fathersName, String position, String email, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.position = position;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    /**
     * Конструктор для бухгалтера (без використання посади)
     **/
    public Employe(String firstName, String lastName, String fathersName, String email, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }
}
