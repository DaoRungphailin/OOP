/*Program# 4(Exercise 2.14 p.72Health application: computing BMI) 
Body Mass Index (BMI) is a measure ofhealth on weight. 
It can be calculated by taking your weight in kilograms anddividing by the square of your height in meters. 
Write a program that prompts theuser to enter a weight in pounds and height in inches and displays the BMI. 
Notethat one pound is 0.45359237 kilograms,and one inch is 0.0254 meters. 

Here isa sample run:
Enter weight in pounds: 95.5 <Enter>
Enter height in inches: 50 <Enter>
BMI is 26.8573*/
import java.util.Scanner;
class D_BMI{
    public static void main(String[] args)
    {
        double pounds , inches;

        System.out.print("Enter weight in pounds: ");
        Scanner inputI = new Scanner(System.in);
        pounds = inputI.nextDouble();

        System.out.print("Enter height in inches: ");
        Scanner inputJ = new Scanner(System.in);
        inches = inputJ.nextDouble();

        if(pounds>=0 && inches>=0)
        {
            double kg = 0.45359237*pounds; 
            double m = 0.0254*inches;
            double BMI = kg/(m*m);
            System.out.printf("BMI is %.4f ", BMI);
        }
        else
            System.out.println("Weights & Heights must be Positive!!");
    }
}