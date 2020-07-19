package ua.com.alevel.nix;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Locale;

/**
 * @author Iehor Funtusov, created 19/07/2020 - 11:11 AM
 */

public class SimpleDateFormatJava {

    public void dateTest() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        Date date = new Date();
//        System.out.println("date default = " + date);
//        System.out.println("date format = " + formatter.format(date));

        String strDate = "Суббота, Апрель 4, 2020";
        formatter = new SimpleDateFormat("EEE, MMMM d, yyyy", new Locale("ru"));
        try {
            date = formatter.parse(strDate);
            System.out.println("date = " + date);
            String dateFormat = formatter.format(date);
            System.out.println("dateFormat = " + dateFormat);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
