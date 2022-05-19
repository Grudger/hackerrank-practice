package sparseArrays;

import java.util.ArrayList;
import java.util.List;

public class SparseArray {

    public static int[] sparse(List<String> strings, List<String> queries) {

        List<Integer> result = new ArrayList<>();
        int[] a = new int[queries.size()];

        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            a[i] = 0;
            for (String q : queries) {
                if (str.equalsIgnoreCase(q))
                    a[i] += 1;
            }
        }

        return a;
    }

}
