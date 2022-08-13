
import java.text.DecimalFormat;

public class DecimalFormatting {

    public static void main(String args[]) {
        double d = 9.4568982982989;
        String pattern = "#.###";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String formattedDouble = decimalFormat.format(d);
        System.out.println("Formatted double d = " + formattedDouble);
    }
}
