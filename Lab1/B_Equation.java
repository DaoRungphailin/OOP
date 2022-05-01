/*Program# 2(Exercise 1.13 p.31Algebra: solve 2 * 2 linear equations)
You can use Cramer’s rule to solve the following2 * 2 system of linear equation:
𝑎𝑥+𝑏𝑦=e
c𝑥+𝑑𝑦=𝑓

𝑥=𝑒𝑑−𝑏𝑓 / 𝑎𝑑−𝑏𝑐
𝑦=𝑎𝑓−𝑒𝑐 / 𝑎𝑑−𝑏𝑐

Write a program that solves the following equation and displays the value for x and y
3.4𝑥+50.2𝑦=44.52.1𝑥+0.55𝑦=5.9*/
import java.util.Scanner;
class B_Equation{
    public static void main(String[] args)
    {
        double a,b,c,d,e,f,x,y;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for a : ");
        a = input.nextDouble();
        System.out.print("Enter a number for b : ");
        b = input.nextDouble();
        System.out.print("Enter a number for c : ");
        c = input.nextDouble();
        System.out.print("Enter a number for d : ");
        d = input.nextDouble();
        System.out.print("Enter a number for e : ");
        e = input.nextDouble();
        System.out.print("Enter a number for f : ");
        f = input.nextDouble();

        //Cramer's Rule
        x = ((e*d) - (b*f)) / ((a*d) - (b*c));
        y = ((a*f) - (e*c)) / ((a*d) - (b*c));
        
        System.out.printf("x : %.2f\n" , x);
        System.out.printf("y : %.2f" , y);
    }
}