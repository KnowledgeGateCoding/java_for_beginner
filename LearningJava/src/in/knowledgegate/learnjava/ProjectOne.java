package in.knowledgegate.learnjava;

import java.util.Scanner;

public class ProjectOne {
    public static void main(String[] args) {
        // s = ut + 1/2at*t
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter initial velocity:");
        double initialVelocity = scanner.nextDouble();
        System.out.print("Please enter time:");
        double time = scanner.nextDouble();
        System.out.print("Please enter acceleration:");
        double acceleration = scanner.nextDouble();
        double distance = (initialVelocity * time)
                + (0.5 * acceleration * Math.pow(time, 2));
        System.out.println("Your distance is:" + distance);

    }
}