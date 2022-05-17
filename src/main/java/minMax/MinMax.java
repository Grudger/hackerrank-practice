package minMax;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        long minSum = 0, maxSum = 0;
        // min
        for(int i = 0; i < arr.size() - 1;i++){
            minSum += arr.get(i);
        }
        //max
        for(int i = 1; i < arr.size();i++){
            maxSum += arr.get(i);
        }


        System.out.println(minSum + " " + maxSum);

    }

}
