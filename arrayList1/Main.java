package arrayList1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>(3);
        System.out.println("Empty student list: ");
        printStudentList(studentList);

        studentList.add(new Student("Mary", 33));
        studentList.add(new Student("Valentina", 34));
        studentList.add(new Student("Veronica", 36));
        studentList.add(new Student("Daniel", 35));

        System.out.println("Updated student list: ");
        printStudentList(studentList);
    }

    private static void printStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
