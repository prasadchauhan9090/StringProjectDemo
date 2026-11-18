package demo.com.in;

import java.util.Scanner;

public class OccuranceInTheString {


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");

        String str=sc.nextLine();

        int count=0;

        for(int i=0;i<str.length();i++)
        {

            if(str.charAt(i)=='l')
            {
                count=count+1;
            }

        }
        System.out.println("Target character is: "+count);



    }
}
