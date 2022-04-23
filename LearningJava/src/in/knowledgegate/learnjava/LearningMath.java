package in.knowledgegate.learnjava;

public class LearningMath {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println(java.lang.Math.max(a, b));
        System.out.println(java.lang.Math.min(a, b));

        float percentage = 85.678F;
        System.out.println(java.lang.Math.round(percentage));
        System.out.println(java.lang.Math.floor(percentage));
        System.out.println(java.lang.Math.ceil(percentage));

        int num = 144;
        System.out.println(java.lang.Math.sqrt(num));
        System.out.println(java.lang.Math.pow(num, 3));

        double random = java.lang.Math.random();
        System.out.println(random * 100);
    }
}