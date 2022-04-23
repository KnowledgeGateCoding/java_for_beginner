package in.knowledgegate.learnjava.advance;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println("division is:" + (a / b));
        } catch (Exception e) {
            System.out.println("Division is not possible");
        } finally {
            System.out.println("I am in finally");
        }
    }
}