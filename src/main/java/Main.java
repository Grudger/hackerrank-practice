
import flippingBits.FlippingBits;
import lonelyInteger.LonelyInteger;
import org.jboss.logging.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        //Arrays.stream(input).forEach(a -> a%2 == 0 ? pos =+1 : odd +=1);

        long a = 5;
        log.info(FlippingBits.bitFlip(a));

    }

}
