public class Tasksheet122 {
    public static void main(String[] args) {
        Student[] students = new Student[] {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        // Loop through each student and call printFullName method
        for (Student s : students) {
            s.printFullName();
        }
    }
}
