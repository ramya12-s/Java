class ParameterizedConstructor {
    String name;
    int age;

    ParameterizedConstructor(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        ParameterizedConstructor obj =
            new ParameterizedConstructor("Rahul", 21);

        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}