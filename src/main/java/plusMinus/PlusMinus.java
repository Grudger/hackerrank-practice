package plusMinus;

import java.text.DecimalFormat;
import java.util.List;

public class PlusMinus {
    private static final DecimalFormat df = new DecimalFormat("0.000000");

    public int plusMinus(List<Integer> arr) {
        float pos = 0, neg = 0, zero = 0;
        int length = arr.size();

        for (int j : arr) {
            if (j == 0)
                zero += 1;
            else {
                if (j > 0)
                    pos += 1;
                else
                    neg += 1;
            }
        }

        System.out.println(df.format(pos / length));
        System.out.println(df.format(neg / length));
        System.out.println(df.format(zero / length));
        return 0;

    }

}
