import java.util.Scanner;

public class Pro3_64011258 {

    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(5,10);
        Rectangle rect2 = new Rectangle(55,61);
        System.out.println("Is area of rect1 and rect2 equal?\n" + rect1.compareTo(rect2));

        Rectangle rect3 = new Rectangle(5,10);
        Rectangle rect4 = new Rectangle(5,10);
        System.out.println("\nIs area of rect4 and rect4 equal?\n" + rect3.compareTo(rect4));

    }
}