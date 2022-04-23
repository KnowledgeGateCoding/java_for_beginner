package in.knowledgegate.learnjava;

public class LearningString {
    public static void main(String[] args) {
        String a = new String("This is my test string");
        String b = "Yes";
        b = "No";

        System.out.println(a.contains("This"));
        System.out.println(a.startsWith("This"));
        System.out.println(a.endsWith("string"));
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.indexOf("is"));
        System.out.println(a.charAt(11));
        System.out.println(a.replace("test", "final"));
    }
}