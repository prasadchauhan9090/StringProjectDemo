package assignment;

import java.util.Scanner;

public class Program5
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("INPUT STRING IS: "+ input);


        System.out.println(" ");
        System.out.println("OUTPUT STRING: "+ input.trim().replaceAll(" ", " "));



        scanner.close();
    }







}
