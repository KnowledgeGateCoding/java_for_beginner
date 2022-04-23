package in.knowledgegate.learnjava;

import java.util.Arrays;

public class LearningArray {
    public static void main(String[] args) {
        int[] marks = new int[] {50, 55, 90, 30};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        int[][] marksNew = new int[][] {{50, 55}, {90, 30}};
        System.out.println(Arrays.deepToString(marksNew));
    }
}