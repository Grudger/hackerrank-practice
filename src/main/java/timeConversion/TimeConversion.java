package timeConversion;

import org.jboss.logging.Logger;

import java.text.DecimalFormat;

public class TimeConversion {
    static final Logger log = Logger.getLogger(TimeConversion.class);

    private static final DecimalFormat df = new DecimalFormat("00");

    public static String timeConversion(String s) {
        int h = 0, m = 0, ss = 0;
        String[] arr = {};
        String merr = "AM";
        arr = s.split("[a-zA-Z:]");
        merr = s.substring(s.length() - 2);
        int hour = Integer.parseInt(arr[0]);

        h = hour;
        if (merr.equalsIgnoreCase("AM") && hour == 12)
            h = 0;
        if (merr.equalsIgnoreCase("PM") && hour != 12)
            h += 12;
        if (h > 23)
            h -= 24;

        m = Integer.parseInt(arr[1]);
        ss = Integer.parseInt(arr[2]);

        return (df.format(h) + ":" + df.format(m) + ":" + df.format(ss));

    }

}
