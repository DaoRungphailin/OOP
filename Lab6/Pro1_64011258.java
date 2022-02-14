import java.util.*;
public class Pro1_64011258 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Name: ");  
        String name =  input.nextLine();

        System.out.print("Enter Age: ");  
        int age = input.nextInt();

        System.out.print("Enter Weight(pounds): ");  
        double weight = input.nextDouble();

        System.out.print("Enter Height(feet): ");  
        double feet = input.nextDouble();
         System.out.print("Enter Height(inches): ");  
        double inches = input.nextDouble();

        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("BMI :" + bmi.getBMI());
        System.out.println("Interpretation :" + bmi.getInterpretation());
    }
}