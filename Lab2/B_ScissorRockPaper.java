/*Program# 2(Exercise 3.17 p.111Game: scissor, rock, paper)
Write a program that plays the popular scissor-rock-papergame. 
(A scissor can cut a paper, a rock can knock a scissor, and a paper canwrap a rock.) 
The program randomly generates a number 0, 1, or 2 representingscissor, rock, and paper. 
The program prompts the user to enter a number 0, 1, or2 and displays a message indicating 
whether the user or the computer wins, loses,or draws. 

Here are sample runs:scissor (0), rock (1), paper (2): 1 <Enter>
The computer is scissor. You are rock. You won

scissor (0), rock (1), paper (2): 2 <Enter>
The computer is paper. You are paper too. It is a draw*/
import java.util.Scanner;
import java.lang.Math;
class B_ScissorRockPaper{
    public static void main(String[] args)
    {
        int user , com;
        System.out.print("scissor (0), rock (1), paper (2): ");
        Scanner input = new Scanner(System.in);
        user = input.nextInt();
        com =  (int)(Math.random() * 2);

        switch(com)
        {
            case 0: System.out.print("The computer is scissor. ");
                break;
            case 1: System.out.print("The computer is rock. ");
                break;
            case 2: System.out.print("The computer is paper. ");
                break;
        }

        switch(user)
        {
            case 0: System.out.print("You are scissor. ");
                break;
            case 1: System.out.print("You are rock. ");
                break;
            case 2: System.out.print("You are paper. ");
                break;
        }

        if(user == 0 && com == 0 ){System.out.print("It is a draw.");}
        else  if(user == 0 && com == 1){System.out.print("You loses.");}
        else if(user == 0 && com == 2){System.out.print("You won.");}

        else if(user == 1 && com == 0 ){System.out.print("You won.");}
        else  if(user == 1 && com == 1){System.out.print("It is a draw.");}
        else if(user == 1 && com == 2){System.out.print("You loses.");}

        else if(user == 2 && com == 0 ){System.out.print("You loses.");}
        else  if(user == 2 && com == 1){System.out.print("You won.");}
        else if(user == 2 && com == 2){System.out.print("It is a draw.");}
    }
}