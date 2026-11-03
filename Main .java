class Main {
    public static void main(String[] args) {
        int age = 20;

        if (age <= 13)
            System.out.println("Child");
        else if (age <= 18)
            System.out.println("Teen");
        else if (age <= 40)
            System.out.println("Major");
        else if (age <= 60)
            System.out.println("Middle");
        else
            System.out.println("Senior");
    }
}