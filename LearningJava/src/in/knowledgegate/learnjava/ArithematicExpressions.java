package in.knowledgegate.learnjava;

public class ArithematicExpressions {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        int e = 5;
        e = e+1;
        System.out.println(++e);

        // BODMAS
        int x = (5 + 6) - 8 * 10 / 5;

        int p = 10;
        int q = 20;

        p += q;
        System.out.println(p);
    }
}