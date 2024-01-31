package ua.nezhura.hw8;

public class Task1 {


    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "Group A", 4.8);
        Student student2 = new Aspirant("Jane", "Smith", "Group B", 5.0, "Scientific Research");

        Student[] students = {student1, student2};

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}

