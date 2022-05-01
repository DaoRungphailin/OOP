/*Program# 2(Exercise 7.31 p.283Merge two sorted lists) 
Write the following method that merges two sorted lists
into a new sorted list.public static int[] merge(int[] list1, int[] list2)
Implement the method in a way that takes at most list1.length + list2.length comparisons. 
Write a test program that prompts the user to enter twosorted lists and displays the merged list. 

Here is a sample run. 
Note that the firstnumber in the input indicates the number of the elements inthe list. 
This numberis not part of the list.

Enter list1: 15 16 61 111 <Enter>
Enter list2: 24 5 6 <Enter>
The merged list is 1 2 4 5 5 6 16 61 111 */
import java.util.Scanner;
import java.util.Arrays;
class B_MergeLists{//Merge lists
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //List 1
        System.out.print("Enter list1: ");
        int[] list1 = new int[input.nextInt()];
        for(int i = 0 ; i < list1.length ; i++)
        {
            list1[i] = input.nextInt();
        }

        //List 2
        System.out.print("Enter list2: ");
        int[] list2 = new int[input.nextInt()];
        for(int i = 0 ; i < list2.length ; i++)
        {
            list2[i] = input.nextInt();
        }

        Arrays.sort(list1);
        Arrays.sort(list2);

        int length1 = list1.length;
        int length2 = list2.length;
        int[] merged = new int[length1 + length2];
        System.arraycopy(list1,0,merged,0,length1);
        System.arraycopy(list2,0,merged,length1,length2);

        System.out.print("The merged list is ");
        System.out.println(Arrays.toString(merged));
    }
}