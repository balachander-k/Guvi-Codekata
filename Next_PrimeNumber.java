// Given a number n print the prime number which comes next to number n

// Input Description:
// 0<n<100 Given a number n

// Output Description:
// print the prime number which comes next to number n

// Sample Input :
// 3
// Sample Output :
// 5

import java.util.*;
public class Next_PrimeNumber
{
    public static int prime(int x)
    {
        int count=0;
        for(int i=1;i<=100;i++)
        {
            if(x%i==0)
            {
                count++;
            }
        }
        if(count==2)
            return 1;
        else 
            return 0;
    }
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        ++a;
        for(int i=a;i<=100;i++)
        {
            if(prime(i)==1)
            {
                System.out.print(i);
                break;
            }
        }
        
    }
}