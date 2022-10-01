import java.util.Scanner;
import java.lang.*;
class roman_to_integer
{
    int value ( char c )
    {
        if (c=='I')
            return 1;
        if (c=='V')
            return 5;
        if (c=='X')
            return 10;
        if (c=='L')
            return 50;
        if (c=='C')
            return 100;
        if (c=='D')
            return 500;
        if (c=='M')
            return 1000;
        return -1;
    }
    int convert_Roman_to_integer(String S)
    {
        int total =0;
        int s1 = 0;
        int s2 = 0;
        for (int  i = 0 ; i < S.length() ; i++ )
        {   
            s1 = value(S.charAt(i));
            if (i+1 < S.length())
            {
                s2 = value(S.charAt(i+1));
                if ( s1 >= s2 )
                    total = total + s1;
                else
                    total = total - s1;
            }
            else 
                total = total + s1;
        }
        return total;
    }

    public static void main(String args[])   
    {   
        roman_to_integer ob = new roman_to_integer();  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number : ");
        String S = sc.nextLine();
        System.out.println(ob.convert_Roman_to_integer(S));   
    }   
}  