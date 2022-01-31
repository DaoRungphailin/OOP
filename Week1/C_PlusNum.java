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