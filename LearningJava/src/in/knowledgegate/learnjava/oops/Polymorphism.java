package in.knowledgegate.learnjava.oops;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("Sum is:" + add(5, 6));
        System.out.println("Sum is:" + add(4,5,6));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}