package demo.com.in;

import java.util.Scanner;

public class RemoveSpacesFromEndAndStarting {


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();
        char ch=0;

        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                ch=str.charAt(i);
            }
        }
        System.out.print(ch);


    }
}
