// Given a string convert string into upper case where their vowel character

// Input Description:
// Given a string

// Output Description:
// Print string into upper case

// Sample Input :
// guvi geek
// Sample Output :
// gUvI gEEk


import java.util.*;
public class Vowel_TO_UpperCase
{
    public static int isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        char[] b=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            if(isVowel(b[i])==1)
            {
                System.out.print(Character.toUpperCase(b[i]));
            }
            else 
            {
                System.out.print(b[i]);
            }
        }
    }
}