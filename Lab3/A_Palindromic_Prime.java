/*Program# 1(Exercise 6.26 p.262 Palindromic prime)
A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and757. 
Write a program that displays the first 100 palindromic prime numbers. 
Display 10 numbers per line, separated by exactly one space, 

as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929 */
import java.lang.Math;
class A_Palindromic_Prime{//Palindromic_Prime

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

    public static void main(String[] args)
    {
        int count = 0;
        for(int i = 0 ; i < 100000 ; i++)
        {
            if(count < 100 && prime(i)==1 && palindrome(i)==1)
            {
                System.out.print(i + " ");
                count++;
                if(count%10==0)
                    System.out.print("\n");
            }
        }
    }
}