import minMax.MinMax;
import org.jboss.logging.Logger;
import sparseArrays.SparseArray;
import timeConversion.TimeConversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //Arrays.stream(input).forEach(a -> a%2 == 0 ? pos =+1 : odd +=1);
        List<String> s = new ArrayList<>();
        List<String> q = new ArrayList<>();
        // strings
        s.add("ab");
        s.add("ab");
        s.add("abc");
        // queries
        q.add("ab");
        q.add("abc");
        q.add("bc");
        // result logger
        log.info(SparseArray.sparse(s, q));


    }

}
