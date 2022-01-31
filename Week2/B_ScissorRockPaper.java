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