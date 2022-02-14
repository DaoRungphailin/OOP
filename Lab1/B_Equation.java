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