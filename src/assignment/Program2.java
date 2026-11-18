package assignment;

import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word");
        String input=sc.nextLine();
        System.out.println("INPUT IS: "+input);

        String words[]=input.split(" ");
        int count=0;

       for(int i=0;i<words.length;i++){
           count=count+1;
       }

       System.out.println(count);


    }
}
