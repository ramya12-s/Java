class StudentDetails {
    String name;
    int age;

    StudentDetails(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        StudentDetails s = new StudentDetails("Anu", 20);

        System.out.println("Student Name: " + s.name);
        System.out.println("Student Age: " + s.age);
    }
}