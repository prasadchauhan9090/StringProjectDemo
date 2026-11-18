package demo.com.in;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STRING: ");

        String str=sc.nextLine();

        int len=str.length();

        for(int i=str.length()-1;i>0;i--)
        {
            System.out.print(str.charAt(i)+"");

        }


    }
}
