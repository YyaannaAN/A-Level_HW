package ua.nezhura.hw8;

public class Task1 {
    static class Student {
        protected String firstName;
        protected String lastName;
        protected String group;
        protected double averageMark;

        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }

        public double getAverageMark() {
            return averageMark;
        }

        public String getScholarship() {
            if (averageMark == 5) {
                return "Student " + firstName + " " + lastName + " gets scholarship 100 uah";
            } else {
                return "Student " + firstName + " " + lastName + " gets scholarship 80 uah";
            }
        }
    }

    static class Aspirant extends Student {
        private String scientificWork;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }

        @Override
        public String getScholarship() {
            if (getAverageMark() == 5) {
                return "Aspirant " + firstName + " " + lastName + " gets scholarship 200 uah";
            } else {
                return "Aspirant " + firstName + " " + lastName + " gets scholarship 180 uah";
            }
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "Group A", 4.8);
        Student student2 = new Aspirant("Jane", "Smith", "Group B", 5.0, "Scientific Research");

        Student[] students = {student1, student2};

        for (Student student : students) {
            System.out.println(student.getScholarship());
        }
    }
}

