package assignment;

import java.util.Scanner;

public class Program3 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String input=sc.nextLine();

        System.out.println("enter the target string: ");
        char targetChar=sc.next().charAt(0);
        System.out.println("Input -->  "+ input);
        System.out.println("Target String: "+targetChar);
        int count=0;

        for(int i=0;i<input.length();i++)
        {
           if(input.charAt(i)==targetChar)
           {
               count++;
           }

        }

        System.out.println("Total words count in the given String is: "+ count);

        sc.close();
    }
}
