import java.util.*;
public class BMI{
    //Attribute
    private String name;
    private int age;
    private double weight;
    private double feet;
    private double inches;
    private double bmi;

    Scanner input = new Scanner(System.in);
    
    // Constructor
    public BMI(String name, int age, double weight,double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    public double getBMI(){
        bmi = (weight*0.45359237)/((12 * feet + inches)*0.0254*(12 * feet + inches)*0.0254);
        return bmi;
    }

    public String getInterpretation(){
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi >= 18.5 && bmi < 25.0)
            return "Normal";
        else if(bmi >= 25.0 && bmi < 30.0)
            return "Overweight";
        else if(bmi >= 30.0)
            return "Obese";
        return "ERROR";
    }
}   
