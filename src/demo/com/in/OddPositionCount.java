package demo.com.in;

import java.util.Locale;

public class OddPositionCount {

    public static void main(String args[])
    {


        String str="This is a test String!!";
        ////////////01234567890
        //           1 3 5 7 9

        char ch=0;

        String words[] = str.split(" ");

        for(int i=0;i<str.length();i++)
        {
           if(str.charAt(i)%2==0)
           {
               String strr = words[i];
               String str1=strr.toUpperCase();
               System.out.print(str1.charAt(i)+"");


           }

           else if (str.charAt(i)%2!=0) {

               ch=str.charAt(i);
               System.out.print(ch);

           }
        }





    }
}
