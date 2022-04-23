package in.knowledgegate.learnjava;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter you name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("Please enter your age: ");
        short age = scanner.nextShort();
        System.out.println("Your age is:" + age);
    }
}