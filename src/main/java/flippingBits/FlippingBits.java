package flippingBits;

import java.text.DecimalFormat;
import java.util.Arrays;

public class FlippingBits {
    //private static final DecimalFormat df = new DecimalFormat("00000000000000000000000000000000");
    public static long bitFlip(long n) {

        int j = Math.toIntExact(~n);
        String binaryString = Integer.toBinaryString(j);
        double convertedDouble = 0;

        for (int i = 0; i < binaryString.length(); i++) {

            if (binaryString.charAt(i) == '1') {
                int len = binaryString.length() - 1 - i;
                System.out.println("length : " + len);
                convertedDouble += Math.pow(2, len);
            }
        }

        int converted = (int) convertedDouble ;
        System.out.println(converted);

        return converted;
    }

}
