import java.util.Scanner;
import java.util.Arrays;

class D_Cities{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] name = new String[3];
        String[] enter = {"first", "second", "third"};

        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.print("Enter the " + enter[i] + " city: ");
            name[i] = input.nextLine();
        }
        Arrays.sort(name);
        System.out.print("The three cities in alphabetical order are " + String.join(" ",name));
    }
}