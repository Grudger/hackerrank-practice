package lonelyInteger;

import java.util.Collections;
import java.util.List;

public class LonelyInteger {

    public static int lonelyInteger(List<Integer> a) {
        int single = 0;
        for (Integer x: a) {
            if (Collections.frequency(a, x) == 1)
                single = x;
        }
        return single;
    }

}
