class Student {
    private String firstName;
    private String lastName;

    // Constructor to initialize the student with first name and last name
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to print the full name
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }
}
