package diagonalDiff;

import org.jboss.logging.Logger;

import java.util.List;

public class DiagonalDiff {
    private static final Logger log = Logger.getLogger(DiagonalDiff.class);

    public static int diagonalDifference(List<List<Integer>> arr) {

        int primary = 0;
        int secondary = 0;
        for (int j = 0; j < arr.size(); j++) {
            List<Integer> i = arr.get(j);
            if (i.size() > 1) {

                primary += i.get(j);
                secondary += i.get(i.size() - j - 1);
                System.out.println("Primary :" + i.get(j));
                System.out.println("Secondary :" + i.get(i.size() - j - 1));
            }
        }
        return Math.abs(primary - secondary);
    }

}
