// Given a string find the number of special characters if their no special characters print -1

// Input Description:
// Given a string

// Output Description:
// Print number of special characters or -1

// Sample Input :
// Guvi Geek
// Sample Output :
// -1


import java.util.*;
public class Count_Special_Character 
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine();
        String pattern="!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        char[] b=a.toCharArray();
        char[] c=pattern.toCharArray();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<pattern.length();j++)
            {
                if(b[i]==c[j])
                {
                    count++;
                }
            }
        }
        if(count==0)
        {
            System.out.print("-1");
        }
        else 
        {
            System.out.print(count);
        }
        
    }
}