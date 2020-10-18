package hw_07_10_2020.hw_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int course;
        Student Ivanov = new Student("Иван", "Иванов", "02.02.2000", 3);
        Student Petrov = new Student("Петр", "Петров", "05.10.1999", 3);
        Student Nikolaev = new Student("Николай", "Николаев", "10.05.1999", 2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер курса, чтобы вывести список студентов этого курса ");
        course = scanner.nextInt();

        List<Student> list = new ArrayList<>();

        list.add(Ivanov);
        list.add(Nikolaev);
        list.add(Petrov);

        Student.printStudent(list, course);
    }
}
