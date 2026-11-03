class CircleArea {
    double radius;

    CircleArea(double r) {
        radius = r;
    }

    public static void main(String[] args) {
        CircleArea c = new CircleArea(5);

        double area = 3.14 * c.radius * c.radius;

        System.out.println("Area of Circle: " + area);
    }
}