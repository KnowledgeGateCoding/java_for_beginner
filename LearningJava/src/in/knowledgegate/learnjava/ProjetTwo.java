package in.knowledgegate.learnjava;

import java.util.Scanner;

public class ProjetTwo {
    public static void main(String[] args) {
        // s = ut + 1/2at*t
        Scanner scanner = new Scanner(System.in);
        double initialVelocity;
        do {
            System.out.print("Please enter initial velocity:");
            initialVelocity = scanner.nextDouble();
        } while (initialVelocity < 0);
        double time;
        do {
            System.out.print("Please enter time:");
            time = scanner.nextDouble();
        } while (time < 0);

        System.out.print("Please enter acceleration:");
        double acceleration = scanner.nextDouble();
        double distance = (initialVelocity * time)
                + (0.5 * acceleration * Math.pow(time, 2));
        System.out.println("Your distance is:" + distance);
    }
}