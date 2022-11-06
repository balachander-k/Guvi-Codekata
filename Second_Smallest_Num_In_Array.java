// Given a number n followed by n numbers Print the 2nd  smallest number in an array

// Input Description:
// 0<n<100 Given a number n Followed by n number in next line

// Output Description:
// Print the 2nd smallest number in an array

// Sample Input :
// 6
// 5 7 4 4 6 8
// Sample Output :
// 5




import java.util.*;
public class Second_Smallest_Num_In_Array
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int temp;
        int[] b=new int[a];
        for(int i=0;i<a;i++)
        {
            b[i]=obj.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        if(b[0]==b[1])
        {
            System.out.print(b[2]);
        }
        else
        {
            System.out.print(b[1]);
        }
    }
}