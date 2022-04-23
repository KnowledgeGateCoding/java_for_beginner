package in.knowledgegate.learnjava;

public class Loops {
    public static void main(String[] args) {
        // while loop
        int a = 5; // initialisation
        while (a < 10) { // condition -check
            System.out.println(a);
            a++; // increment
        }

        // for loop
        for (int b = 10; b > 0; b--) {
            System.out.println(b);
        }

        // do-while loop
        int c = 5;
        do {
            System.out.println(c);
            c++;
        } while (c < 10);

        // for-each
        int[] marks = new int[]{50, 51, 52, 53};
        for (int i = 0; i < 4; i++) {
            System.out.println(marks[i]);
        }
        for (int mark : marks) {
            System.out.println(mark);
        }

        // Break and continue
        int d = 5;
        while (true) {
            d++;
            if (d == 8) continue;
            if (d == 10) break;
            System.out.println(d);
        }


    }
}