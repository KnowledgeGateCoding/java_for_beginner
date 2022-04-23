package in.knowledgegate.learnjava;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your day:");
        String day = scanner.next();
        if (day.equals("1")) {
            System.out.println("Monday");
        } else if (day.equals("2")) {
            System.out.println("Tuesday");
        } else if (day.equals("3")) {
            System.out.println("Wednesday");
        } else {
            System.out.println("Some other day");
        }

        switch (day) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Some other day");

        }

        // ternary operator
        int a = 5;
        int b = a == 5 ? 1 : 2;
        if (a == 5) {
            b = 1;
        } else {
            b = 2;
        }
    }
}