package demo.com.in;

public class StringInJava {

    public static void main(String args[])
    {


        String str = "java is super";
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            count = count+1;

        }

        System.out.println("total count of the character in the given above string is: "+count);


    }
}
