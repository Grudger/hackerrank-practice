
import lonelyInteger.LonelyInteger;
import org.jboss.logging.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //Arrays.stream(input).forEach(a -> a%2 == 0 ? pos =+1 : odd +=1);
        int[] x =  {1, 2, 3, 4, 3, 2, 1};
        List<Integer> a = Arrays.stream(x).boxed().collect(Collectors.toList());
        log.info(LonelyInteger.lonelyInteger(a));

    }

}
