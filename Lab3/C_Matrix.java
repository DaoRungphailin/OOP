/*Program# 3(Exercise 8.14 p.310 Explore matrix) 
Write a program that prompts the user to enter the length of asquare matrix, 
randomly fills in 0s and 1s into the matrix, prints the matrix, and
finds the rows, columns, and diagonals with all 0s or 1s. 

Here is a sample run ofthe program:

Enter the size for the matrix: 4<Enter>
0111
0000
0100
1111

All 0s on row 1
All 1s on row 3
No same numbers on a column
No same numbers on the superdiagonal
No same numbers on the diagonal
No same numbers on the subdiagonal*/
import java.util.Scanner;
import java.util.Arrays;
class C_Matrix {//Matrix 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = new int[size][size];

        createMatrix(matrix);
        printMatrix(matrix);

        int column = 0, row = 0;
        for(int j = 0 ; j < 2 ; j++)
        {
            for(int i = 0 ; i < matrix.length ; i++)
            {
                if(rowSequence(matrix,j,i))
                {
                    System.out.println("All " + j + "s on row" + i);
                    row++;
                }
            }
        }

        for(int j = 0 ; j < 2 ; j++)
        {
            for(int i = 0 ; i < matrix.length ; i++)
            {
                if(columnSequence(matrix,j,i))
                {
                    System.out.println("All " + j + "s on column" + i);
                    column++;
                }
            }
        }

        if(column == 0)
            System.out.println("No same numbers on a column");
        
        if(row == 0)
            System.out.println("No same numbers on a row");
    }

    public static void createMatrix(int[][] matrix) 
    {
        int count = 0;
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
                matrix[i][j] = (int)(Math.random()*2);
            }
        }
    }    

    public static void printMatrix(int[][] matrix) 
    {
        System.out.print("");
        for(int i = 0 ; i < matrix.length ; i++)
        {
            for(int j = 0 ; j < matrix[i].length ; j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }
    }

     public static boolean rowSequence(int[][] matrix, int n, int row) 
    {
        for(int j = 0 ; j < matrix.length ; j++)
        {
            if(matrix[row][j] != n)
                return false;
        }
        return true;
    }

    public static boolean columnSequence(int[][] matrix, int n, int column) 
    {
        for(int i = 0 ; i < matrix.length ; i++)
        {
            if(matrix[i][column] != n)
                return false;
        }
        return true;
    }
}