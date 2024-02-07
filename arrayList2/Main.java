package arrayList2;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mary", 33));
        studentList.add(new Student("Valentina", 34));
        studentList.add(new Student("Veronica", 36));
        studentList.add(new Student("Daniel", 35));
        studentList.add(new Student("Loris", 60));
        studentList.add(new Student("Michele", 39));
        studentList.add(new Student("Nicoletta", 34));
        studentList.add(new Student("Marco", 42));
        studentList.add(new Student("Raf", 39));
        studentList.add(new Student("Roberto", 58));
        studentList.add(new Student("Fiorenza", 65));
        studentList.add(new Student("Matteo", 42));

        System.out.println("Student list: ");
        printStudentList(studentList);

        System.out.println("----------------------------------------------------------------------------");

        studentList.sort(Comparator.comparing(Student::getAge));
        System.out.println("Student list sorted by age: ");
        printStudentList(studentList);

        System.out.println("----------------------------------------------------------------------------");

        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("Student list sorted by name: ");
        printStudentList(studentList);

    }

    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
