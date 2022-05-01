/*Program# 2(Exercise 9.5 Use the GregorianCalendar class) 
Java API has the GregorianCalendar class in the java.util package, 
which you can use to obtain the year, month, and day of a date. 
The no-arg constructor constructs an instance for the current date, 
and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), get(GregorianCalendar.DATE) and 
get(GregorianCalendar.DAY_OF_WEEK) 
return the year, month, date, and day of week. 

Write a program to perform two tasks:
■Display the current year, month, and date.
■The GregorianCalendar class has the setTimeInMillis(long), 
which can be used to set a specified elapsed time since January 1, 1970. 
For example, set the value to 1234567898765L resulting that Year is 2009, Month is 1and Dateis 14.
■Display calendar detailsby using method getTime() after specified 
the elapsed time in millisecond of one dayafter current day. 

sample run:
Current year, month, date, and day of week
Year is 2021
Month is 0
Date is 31
Day of week is 1
------------
After specified the elapsed time of one day after current day
Year is 2021
Month is 1
Date is 1
Day of week is 2
Mon Feb 01 16:59:20 ICT 2021*/
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Pro2_64011258 {

    public static void main(String[] args) {
        
        GregorianCalendar Calendar1 = new GregorianCalendar();

        System.out.println("Current year, month, date, and day of week");
        System.out.println("Year is " + Calendar1.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + Calendar1.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + Calendar1.get(GregorianCalendar.DATE));
        System.out.println("Year of week is  " + Calendar1.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");

        Calendar1.add(GregorianCalendar.DATE,1);
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Year is " + Calendar1.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + Calendar1.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + Calendar1.get(GregorianCalendar.DATE));
        System.out.println("Year of week is  " + Calendar1.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(Calendar1.getTime());
    }
}
