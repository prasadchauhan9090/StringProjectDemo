package assignment;

import java.util.Scanner;

public class Program6 {


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        //input string
        System.out.println("Enter a string");
        String input = sc.nextLine();

        //length of the input string
        System.out.print(input.length());

        System.out.print("  ");
        int count1=0;

        int count = 0;
        String word[]=input.split(" ");

        //output String not assigned
        String output="";

        for(int i=0;i<word.length;i++)
        {
            String words=word[i];
            String reverse="";
            count1=count1+words.length();

            for(int j=words.length()-1; j>=0 ;j--)
            {
                reverse= reverse+words.charAt(j);
                count++;
            }

            output=output+reverse+" ";
        }

        System.out.println("OUTPUT STRING IS:  "+output+" ");

        System.out.println(count);

        System.out.println(count1);

    sc.close();
    }

}
