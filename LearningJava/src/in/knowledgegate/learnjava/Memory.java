package in.knowledgegate.learnjava;

import java.awt.*;

public class Memory {
    public static void main(String[] args) {
        // by value
        int a = 5;
        int b = a;
        a = 7;
        System.out.println(b);


        // By reference
        Point p = new Point(1, 2);
        Point q = p;
        p.x = 3;
        System.out.println(q);
    }
}