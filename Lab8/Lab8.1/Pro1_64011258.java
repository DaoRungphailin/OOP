import java.util.Scanner;
public class Pro1_64011258 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three sides of the triangle");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter color of triangle");
        String color = input.next();

        System.out.println("Is the triangle filled? (True/False)");
        boolean filled = input.nextBoolean();

        Triangle tri = new Triangle(side1, side2, side3);
        tri.setFilled(filled);
        tri.setColor(color);

        System.out.println("Area of triangle : " + tri.getArea());
        System.out.println("Perimeter of triagle : " + tri.getPerimeter());
        System.out.println("Color of Triangle : " + tri.getColor());
        System.out.println("The Triangle filled or not? : " + tri.IsFilled());
    }
}