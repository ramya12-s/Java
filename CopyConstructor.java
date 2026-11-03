class CopyConstructor {
    String name;

    CopyConstructor(String n) {
        name = n;
    }

    CopyConstructor(CopyConstructor obj) {
        name = obj.name;
    }

    public static void main(String[] args) {
        CopyConstructor obj1 = new CopyConstructor("Ravi");
        CopyConstructor obj2 = new CopyConstructor(obj1);

        System.out.println("Original Object: " + obj1.name);
        System.out.println("Copied Object: " + obj2.name);
    }
}