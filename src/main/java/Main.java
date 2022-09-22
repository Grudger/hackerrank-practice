
import CountSort.CountingSort;
import flippingBits.FlippingBits;
import lonelyInteger.LonelyInteger;
import org.jboss.logging.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(1);
        i.add(2);
        i.add(2);
        i.add(3);
        i.add(3);
        i.add(16);
        i.add(32);
        i.add(16);
        i.add(5);
        i.add(32);
        i.add(7);
        System.out.println(CountingSort.countingSort(i));

    }

}
