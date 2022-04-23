package in.knowledgegate.learnjava;

import java.util.Scanner;

public class ConditionalLogicalOperators {
    public static void main(String[] args) {
        int a = 5;
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        System.out.println("a == b " + (a == b));
        System.out.println("a != b " + (a != b));
        System.out.println("a < b " + (a < b));
        System.out.println("a > b " + (a > b));
        System.out.println("a <= b " + (a <= b));
        System.out.println("a >= b " + (a >= b));

        // Logical Operators
        // && || !
        boolean isPassed = true;
        boolean inUniform = false;
        boolean aachaBacha = isPassed || inUniform;
        System.out.println(aachaBacha);
    }
}