/*Program# 5(Exercise 5.17 p.193Display pyramid) 
Write a program that prompts the user to enter an integer from1 to 15 and displays a pyramid, 
as shown in the following sample run:

Enter the number of lines: 7 <Enter>
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
  6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7*/
import java.util.Scanner;

class E_Pyramid{
    public static void main(String[] args)
    {
        int num;
        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        for(int rows = 1; rows<= num; rows++)
        {
            for(int Space = num - rows; Space>=1; Space--)
            {
                System.out.print("  ");
            }
            for(int left = rows; left >= 2; left--)
            {
                System.out.print(left + " ");
            }
            for(int right = 1; right <= rows; right++)
            {
                System.out.print(right + " ");
            }
            System.out.println();
        }
}
}
