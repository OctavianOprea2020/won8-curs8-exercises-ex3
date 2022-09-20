package javacurs.homework.course08.exercises.ex3;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String strDatewithTime = "1930-10-04T10:11:30";
        LocalDateTime aLDT = LocalDateTime.parse(strDatewithTime);

        Manager manager = new Manager("Joe", "Doe", aLDT, "Bucharest");
        System.out.println("Manager's Full Name is: " + manager.getFullName() + ".");
        System.out.println("Manager's A|ge is: " + manager.getAge() + " years old.");

        System.out.println("");
        strDatewithTime = "1989-05-31T11:15:20";
        aLDT = LocalDateTime.parse(strDatewithTime);

        Manager manager2 = new Manager("Mary", "Smith", aLDT, "Paris");
        System.out.println("Manager's Full Name is: " + manager2.getFullName() + ".");
        System.out.println("Manager's Age is: " + manager2.getAge() + " years old.");

        System.out.println("");
        strDatewithTime = "2022-01-01T15:20:50";
        aLDT = LocalDateTime.parse(strDatewithTime);

        Manager manager3 = new Manager("Liz", "King", aLDT, "London");
        System.out.println("Manager's Full Name is: " + manager3.getFullName() + ".");
        System.out.println("Manager's Age is: " + manager3.getAge() + " years old.");
    }
}
