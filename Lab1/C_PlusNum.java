/*Program# 3(Exercise 2.6 p.70Sum the digits in an integer) 
Write a program that reads an integer between 0 and1000 and adds all the digits in the integer. 
For example, if an integer is 932, thesum of all its digits is 14.

Hint:Use the % operator to extract digits anduse the / operator to remove theextracted digit. 
For instance, 932 % 10 = 2 and 932 / 10 = 93. 

Here is a sample run:
Enter a number between 0 and 1000: 999
<Enter>The sum of the digits is 27*/
import java.util.Scanner;
class C_PlusNum{
    public static void main(String[] args)
    {
        System.out.println("Enter a number between 0 and 1000: ");
        int number , remainder;
        int sum = 0;   
        Scanner inputI = new Scanner(System.in);
        number = inputI.nextInt();
        if(number > 0 && number < 1000)
        {
            while(number != 0){
            remainder = number % 10;
            sum += remainder;
            number /= 10;
            }
            System.out.println("The sum of the digits is :" + sum);
        }
        else
            System.out.print("Number is out of range!!");  
    }
}