package misc;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();

        long dateLong= date.getTime();
        Date date2 = new Date(dateLong);
        System.out.println("Date is"+date2);
        //long msec = date.getTime();
       // System.out.println("Milliseconds since Jan. 1, 1970 GMT = " + msec);
    }
}
