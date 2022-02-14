import java.util.*;
public class BMI{
    
    String name;
    private int age;
    private double weight;
    private double height;
    Scanner input = new Scanner(System.in);
 // Constructor
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    //Method
    public int getName(){
        return this.name;
    }

    public void setName(String name) {
        String[] this.name = new String[5];
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age) {
        this.age = input.nextInt();
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = input.nextDouble();
    }

     public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = input.nextDouble();
    } 

    public void setUnit(double weight, double height){
        this.weight = 0.45359237*weight;
        this.height = 0.0254*height;
    }
}