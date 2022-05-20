package sparseArrays;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparseArray {

    public static List<Integer> sparse(List<String> strings, List<String> queries) {
        Map<String, Integer> freq = new HashMap<>();
         List<Integer> list = new ArrayList<>();
        for (String q : queries) {
            list.add(Collections.frequency(strings, q));
        }
        return list;
    }

}
