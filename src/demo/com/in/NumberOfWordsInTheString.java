package demo.com.in;

import java.util.Scanner;

public class NumberOfWordsInTheString {


    public static void main(String arg[])
    {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string");

            String str = sc.nextLine();
            String words[] = str.split(" ");
//        String couOfWords= words.split(" ");
            int count = 0;


            for (int i = 0; i <words.length; i++) {
                System.out.print(words[i] + " ");
                count++;
            }

            System.out.println("total count of wordsd is: " + count);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
