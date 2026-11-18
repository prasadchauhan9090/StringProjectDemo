package assignment;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String input=sc.nextLine();
        System.out.println("INPUT IS: "+input);

        String words[]=input.split(" ");

        System.out.println("INPUT IS: "+words.length);

    }
}
