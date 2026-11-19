package assignment;

import java.util.Scanner;

public class Program6 {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("INPUT STRING IS: "+ input);
        System.out.println(" ");

        String[] words = input.split(" ");

        String output = "";

        for(int i=0; i<words.length; i++)
        {
           String word = words[i];
           String reverse = "";


           for(int j=word.length()-1; j>=0; j--)
           {
               reverse=reverse+word.charAt(j);

           }

        output=output+reverse+" ";

        }

        System.out.println("OUTPUT STRING: "+output);
        scanner.close();

    }
}
