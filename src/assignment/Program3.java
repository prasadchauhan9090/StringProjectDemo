package assignment;

import java.util.Scanner;

public class Program3 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");

        String input=sc.nextLine();
        int count=0;

        for(int i=0;i<input.length();i++)
        {
           if(input.charAt(i)=='l')
           {
               count++;
           }

        }

        System.out.println("Total words count in the given String is: "+ count);

    }
}
