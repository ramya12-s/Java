class ConstructorOverloading {
    int a, b;

    ConstructorOverloading() {
        a = 10;
        b = 20;
    }

    ConstructorOverloading(int x, int y) {
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        ConstructorOverloading obj1 = new ConstructorOverloading();
        ConstructorOverloading obj2 = new ConstructorOverloading(30, 40);

        System.out.println("Default Constructor Sum: " + (obj1.a + obj1.b));
        System.out.println("Parameterized Constructor Sum: " + (obj2.a + obj2.b));
    }
}