package in.knowledgegate.learnjava.advance;

import java.text.NumberFormat;
import java.util.Locale;

public class Format {
    public static void main(String[] args) {
        NumberFormat percentage = NumberFormat.getPercentInstance(Locale.US);
        System.out.println("New increment is:" + percentage.format(.67543));
    }
}