/*Program# 3(**Exercise 3.21p.112Science: day of the week) 
Zeller’s congruence is an algorithm developed byChristian Zeller to calculate the day of the week. 
The formula is

ℎ = q+26(m+1)/10+𝑘/4+𝑗/4+5j)%7

where
■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:Wednesday, 5: Thursday, 6: Friday).
■q is the day of the month.
■m is the month (3: March, 4: April, ..., 12: December,January and Februaryare counted as 
months 13 and 14 of the previous year).■j is the century (i.e.,year/ 100).
■k is the year of the century (i.e., year % 100).

Note that the division inthe formula performs an integer division. 
Write a programthat prompts the user to enter a year, month, and day of the month, and
displays the name of the day of the week. Here are some sample runs:*/
import java.util.Scanner;

class C_Clalendar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] Days = { "Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12 : ");
        int month = input.nextInt();
        System.out.print("Enter The day of the month : 1-31 : ");
        int dayOfMonth = input.nextInt();

        if(month == 1)
        {
            month = 13;
            year--;
        }
        else if(month == 2)
        {
            month = 14;
            year--;
        }    

        int dayOfWeek = ( dayOfMonth + (26 *(month + 1)) / 10 +(year % 100) + 
            (year % 100)/4 +(year/100)/4 + 5 * (year / 100)) % 7; 
        System.out.print("Day of week is " + Days[dayOfWeek] );
    }
}