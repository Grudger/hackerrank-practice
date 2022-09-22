package pangram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;

public class Pangram {

    public static String pangrams(String s) {

        StringBuilder sb = new StringBuilder(s.toLowerCase().replaceAll("[^a-z^ ]+", ""));
        List<Integer> uniqueList = new ArrayList<>();
        sb.chars().distinct().forEach(uniqueList::add);
        System.out.println(uniqueList.size());
        if (uniqueList.size() == 27 )
            return "Pangram";
        else return
                "Not Pangram";
    }

}
