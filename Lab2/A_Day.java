/*Program# 1(Exercise 3.5 p.109Find future dates) 
Write a program that prompts the user to enter an integer for
today’s day of the week (Sunday is 0, Monday is 1, ..., and Saturday is 6). 
Also prompt the user to enter the number of days after today for a future day 
and displaythe future day of the week. 

Here is a sample run:
Enter today's day: 1 <Enter>
Enter the number of days elapsed since today: 3 <Enter>
Today is Monday and the future day is Thursday

Enter today's day: 0 <Enter>
Enter the number of days elapsed since today: 31 <Enter>
Today is Sunday and the future day is Wednesday*/
import java.util.Scanner;
class A_Day{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int today , days ;

        System.out.print("Enter today's day: ");
        today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        days = input.nextInt();
        int future = ((today + days) % 7);

        switch(today){
            case 0: System.out.print("Today is Sunday and ");
                break;
            case 1: System.out.print("Today is Monday and ");
                break;
            case 2: System.out.print("Today is Tuesday and ");
                break;
            case 3: System.out.print("Today is Wednesday and ");
                break;
            case 4: System.out.print("Today is Thursday and ");
                break;
            case 5: System.out.print("Today is Friday and ");
                break;
            case 6: System.out.print("Today is Saturday and ");
                break;
        }

        switch(future){
            case 0: System.out.println("the future dat is Sunday");
                break;
            case 1: System.out.println("the future dat is Monday");
                break;
            case 2: System.out.println("the future dat is Tuesday");
                break;
            case 3: System.out.println("the future dat is Wednesday");
                break;
            case 4: System.out.println("the future dat is Thursday");
                break;
            case 5: System.out.println("the future dat is Friday");
                break;
            case 6: System.out.println("the future dat is Saturday");
                break;
        }
    }
}