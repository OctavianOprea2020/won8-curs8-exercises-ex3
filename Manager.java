package javacurs.homework.course08.exercises.ex3;

import java.time.LocalDateTime;
import java.time.Month;

public class Manager implements Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String address;

    public Manager() {
        System.out.println("Calling Manager() constructor");
    }

    public Manager(String firstName, String lastName, LocalDateTime birthday, String address) {
        System.out.println("Calling Manager(firstName, lastName, birthday, address) constructor");
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String getAddress() {
        return address;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public int getAge() {
        int todayYear = LocalDateTime.now().getYear();
        int todayMonth = LocalDateTime.now().getMonthValue();
        int todayDay = LocalDateTime.now().getDayOfMonth();
        System.out.println("Today is: " + todayDay + "." + todayMonth + "." + todayYear);

        int birthdayYear = birthday.getYear();
        int birthdayMonth = birthday.getMonthValue();
        int birthdayDay = birthday.getDayOfMonth();
        System.out.println("Birthday is: " + birthdayDay + "." + birthdayMonth + "." + birthdayYear);

        int age = todayYear - birthdayYear;
        if (todayYear <= birthdayYear) {
            age = 0;
        } else {
            if ((todayMonth < birthdayMonth) || ((todayMonth == birthdayMonth) && (todayDay < birthdayDay))) {
                age -= 1;
            }
        }

        return age;
    }
}
