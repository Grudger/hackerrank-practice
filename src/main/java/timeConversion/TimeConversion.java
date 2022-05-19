package timeConversion;

import org.jboss.logging.Logger;

import java.text.DecimalFormat;

public class TimeConversion {
    static final Logger log = Logger.getLogger(TimeConversion.class);

    private static final DecimalFormat df = new DecimalFormat("00");

    public static String timeConversion(String s) {
        int h = 0;
        String[] arr = {};
        arr = s.split("[a-zA-Z:]");
        String merr = s.substring(s.length() - 2);
        int hour = Integer.parseInt(arr[0]);

        h = hour;
        if (merr.equalsIgnoreCase("AM")) {
            h %= 12;
        } else {
            h = h == 12 ? 12 : h + 12;
        }


        return (df.format(h) + ":" + arr[1] + ":" + arr[2]);

    }

}
