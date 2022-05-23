package flippingBits;

import java.util.Arrays;

public class FlippingBits {

    public static long bitFlip(long n) {
        System.out.println("Input " + n);
        String longStr = Long.toBinaryString(n);
        System.out.println(longStr);
        int i = Integer.parseUnsignedInt("000000000101010");
        //String flipped = Integer.toBinaryString(~Integer.parseInt(longStr));
        //flipped = flipped.substring(flipped.length() - 1, flipped.length() - 32);

        return i;
    }

}
