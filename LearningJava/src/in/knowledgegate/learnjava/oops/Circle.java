package in.knowledgegate.learnjava.oops;

public class Circle implements Shape {

    private static final double PI = 3.14;

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
        System.out.println("I am inside constructor of Circle");
    }

    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public void printArea() {
        System.out.println("Area is:" + (2 * PI * radius));
    }
}
