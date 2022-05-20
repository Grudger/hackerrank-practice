package sparseArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SparseArray {

    public static List<Integer> sparse(List<String> strings, List<String> queries) {

        List<Integer> result = new ArrayList<>();
        int[] a = new int[queries.size()];
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            //a[i] = 0;
            System.out.println("Value String to match" + strings.get(i));
            for (int j = 0; j < queries.size(); j++) {
                String q = queries.get(j);
                System.out.println("Search Query " + q);
                System.out.println("Adding to this one with index :" + j + "\t + passing search  " + q);
                System.out.println("before addition " + a[j]);
                if (str.equalsIgnoreCase(q)) {
                    a[j] += 1;
                    System.out.println("After addition " + a[j]);
                }
                System.out.println("ending loop q");
            }
        }
        Arrays.stream(a).boxed().collect(Collectors.toList());
        return Arrays.stream(a).boxed().collect(Collectors.toList());
    }

}
