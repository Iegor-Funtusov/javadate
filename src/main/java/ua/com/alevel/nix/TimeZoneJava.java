package ua.com.alevel.nix;

import java.util.Arrays;
import java.util.TimeZone;

/**
 * @author Iehor Funtusov, created 19/07/2020 - 11:28 AM
 */

public class TimeZoneJava {

    public void dateTest() {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println("timeZone = " + timeZone);
        System.out.println("timeZone = " + timeZone.getDisplayName());
        System.out.println("timeZone = " + timeZone.getID());
        runTimeZone(timeZone);
    }

    private void runTimeZone(TimeZone timeZone) {
        int rawOffset = timeZone.getRawOffset();
        System.out.println("rawOffset = " + rawOffset);

        String[] timezones = TimeZone.getAvailableIDs();

        for (int i = 0; i < timezones.length; i++) {
            timeZone = TimeZone.getTimeZone(timezones[i]);
            drawTimeZoneParam(timeZone);
        }

        System.out.println("all TimeZones");
        timezones = TimeZone.getAvailableIDs(rawOffset);
        for (int i = 0; i < timezones.length; i++) {
            timeZone = TimeZone.getTimeZone(timezones[i]);
            drawTimeZoneParam(timeZone);
        }
    }

    private void drawTimeZoneParam(final TimeZone tz) {
        String line;
        String TEMPL_TZ = "%s (%s)";
        line = String.format(TEMPL_TZ, tz.getID(), tz.getDisplayName());
        line = align(line, 64);
        int hour = 1000 * 60 * 60;
        String TEMPL_OFFS = "hour offset=(%d)";
        line += String.format(TEMPL_OFFS, tz.getRawOffset() / hour);
        System.out.println(line);
    }

    private String align(String str, int len) {
        if (len - str.length() > 0) {
            char[] buf = new char[len - str.length()];
            Arrays.fill(buf, ' ');
            return str + new String(buf);
        } else
            return str.substring(0, len);
    }
}
