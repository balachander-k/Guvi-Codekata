//  Find the perfect matrix or not perfect matrix means diagonales should contain only even numbers print yes if its perfect matrix else no. You will given a number n followed by n*n numbers

// Input Description:
// You will given a number n followed by n*n numbers by n lines . 0<n<100

// Output Description:
// Print yes or no

// Sample Input :
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output :
// no

import java.util.*;
public class Diagonal_Matrix_Is_Even_Or_Odd
{
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int[][] b=new int[a][a];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                b[i][j]=obj.nextInt();
            }
        }
        int count=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(i==j)
                {
                    if(b[i][j]%2==0)
                    {
                        count++;
                    }
                }
            }
        }
        if(count==a)
        {
            System.out.print("yes");
        }
        else 
        {
            System.out.print("no");
        }
    }
}