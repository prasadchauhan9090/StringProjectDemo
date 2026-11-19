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
       System.out.print("INPUT STRING:"+input);
       System.out.println(" ");

        System.out.print("");
        int count1=0;

        int count = 0;
        String word[]=input.split(" ");

        //output String not assigned
        String output="";

        for(int i=0;i<word.length;i++)
        {
            String words=word[i];
            String reverse=getReversedString(words);

            if(i!=word.length-1) {
                output = output + reverse +" ";
            }else {
                output = output + reverse;
            }
        }

        System.out.println("OUTPUT STRING:"+output);

    sc.close();
    }


    private static String getReversedString(String input)
    {
        String reversedString="";
        for(int j=input.length()-1; j>=0 ;j--)
        {
            reversedString= reversedString+input.charAt(j);
        }

        return reversedString;

    }






}
