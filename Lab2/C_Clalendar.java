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