import java.util.Scanner;
import java.util.Arrays;
class Pro1_64011258{//Merge lists
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

        // System.out.print(Arrays.toString(list1));
        // System.out.print(Arrays.toString(list2));
        int length1 = list1.length;
        int length2 = list2.length;
        int[] merged = new int[length1 + length2];
        System.arraycopy(list1,0,merged,0,length1);
        System.arraycopy(list2,0,merged,length1,length2);
        Arrays.sort(merged);

        System.out.print("The merged list is ");
        System.out.println(Arrays.toString(merged));
    }
}