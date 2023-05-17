import forExample.Car;
import forExample.SameName;

public class Main {
    public static void main(String[] args) {
        SameName sameNameDef = new SameName();
        sameNameDef.showName();

        SameName sameNamePack = new SameName();
        sameNamePack.showName();

        Car car = new Car();
        car.start();

        Employe employeWithFinal = new Employe("Oleksand", "Malyk", "Oleksandrovich");
        Employe employeFull = new Employe("Ivan", "Moroz", "Stepanovich",
                "Cleaning Master", "Stepa@gmail.com", 27, 5000);
        Employe employeBuhgalter = new Employe("Pasha", "Petrov", "Petrovich",
                "Buxxgalteria@gmail.com", 33, 3000);

        System.out.println(employeWithFinal.toStringWithFinal());
        System.out.println(employeFull.toStringFull());
        System.out.println(employeBuhgalter.toStringBuhgalter());
    }
}