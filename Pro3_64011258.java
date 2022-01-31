public class Pro3_64011258 {
    
    public static void main(String[] args) 
    {
        StopWatch clock = new StopWatch();
        double[]  num, sortNum;
        int[] palindrome;

        System.out.println("Creating a list containing 1000 elements, ");

        for(int i = 0 ; i < 1000 ; i++)
        {
            //num[i] = Math.random()*1000;
            if((i + 1) % 5 == 0 && i != 0)
                {System.out.println(String.format("\t%.2f" , num[i]) + "        ");}
            else
                {System.out.print(String.format("\t%.2f" , num[i]) + "        ");}
        }

        System.out.println("List created. \nSorting stopwatch starts...");
        System.out.println("-------------------------------------------------------------------------------");

        //Palindrome Prime
        System.out.println("The palindromPrime stopwatch starts... \nCreating 1000 PalindromPrime...");
            static int prime(int n) 
    {
        if (n <= 1)
            return 0;// 0,1 not prime number
         for (int i = 2; i <= Math.sqrt(n); i++)
         {
            if (n % i == 0)
                return 0;//not prime number
         }
        return 1;//prime number
    }

    static int palindrome(int n)
    {
        int remainder , reversed = 0 , original;
        original = n;

        while(n != 0)
        {
            remainder = n % 10;
            reversed = reversed * 10 + remainder;
            n /= 10;   
        }
        if(original == reversed)    
            return 1;//palindrome number
        else     
            return 0;//not palindrome  
    } 
    }
}
