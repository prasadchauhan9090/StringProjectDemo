package assignment;

import java.util.Scanner;

public class Program6 {


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        //input string
        System.out.println("Enter a string");
        String input = sc.nextLine();

        String word[]=input.split(" ");

        //output String not assigned
        String output="";

        for(int i=0;i<word.length;i++)
        {
            String words=word[i];
            String reverse="";

            for(int j=words.length()-1; j>=0 ;j--)
            {
                reverse= reverse+words.charAt(j);
            }

            output=output+reverse+" ";
        }

        System.out.println("OUTPUT STRING IS:  "+output+" ");

    sc.close();
    }

}
