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