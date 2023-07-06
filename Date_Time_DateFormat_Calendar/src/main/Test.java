package main;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        //Hàm lấy thời gian hiện tại
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            System.out.println("test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Thời gian chạy vòng lặp for: " + (t2 - t1) + "mls");
        System.out.println("Thời gian chạy vòng lặp for: " + ((t2 - t1)/1000) + "s");

        //TimeUnit
        System.out.println("3000 năm= " + TimeUnit.DAYS.toSeconds(3000*365));
        System.out.println("1.3 giờ= " + TimeUnit.MINUTES.toSeconds(78));

        //Date
        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));

        //Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        c.add(Calendar.HOUR,30);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
        c.add(Calendar.DATE,14);
        System.out.println(c.get(Calendar.DATE)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));

        //DateFormat
        DateFormat df =new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));

    }
}
