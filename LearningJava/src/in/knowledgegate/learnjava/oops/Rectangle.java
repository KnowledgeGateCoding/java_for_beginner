package in.knowledgegate.learnjava.oops;

/**
 * public
 * protected
 * Default
 * private
 */
public class Rectangle implements Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        System.out.println("I am inside constructor in Rectangle");
    }

    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    public void printArea() {
        System.out.println("Area is:" + (length*breadth));
    }
}
