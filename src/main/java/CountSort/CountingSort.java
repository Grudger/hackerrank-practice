package CountSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            int f = Collections.frequency(arr, i);
            result.add(i, f);
            System.out.println("index " + i + " Freq " + f);
        }
        return result;
    }

}
