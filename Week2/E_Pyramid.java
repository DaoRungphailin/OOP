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
