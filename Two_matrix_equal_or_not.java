//
//Ethan Hunt is an agent at the CBI. He is given the task of diffusing a bomb which has a decryption key consisting of integers ( positive and negative) represented in a matrix of dimensions M*N. Ethan also has a M*N matrix in his diffusion device. The bomb can be diffused only if both the matrices match perfectly. Help Ethan diffuse the bomb, thereby saving millions of lives.
//
//CONSTRAINTS:
//
//1<=N,M<=10
//
//-1000<=matrix[i][j]<=1000
//
// 
//
//Input Description:
//Two matrices of dimensions M*N where M is the number of rows and N is the number of columns.
//
//Output Description:
//Display “equal” if the two matrices are equal, else display “ Not equal”
//
//Sample Input :
//2 2
//88 12
//96 -72
//2 2
//88 12
//96 -72
//Sample Output :
//Equal

package guvi;
import java.util.*;
public class Two_matrix_equal_or_not {
     public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int count=0;
        int a=obj.nextInt();
        int b=obj.nextInt();
        int[][] c=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                c[i][j]=obj.nextInt();
            }
        }
        int d=obj.nextInt();
        int e=obj.nextInt();
        int[][] f=new int[d][e];
        for(int i=0;i<d;i++)
        {
            for(int j=0;j<e;j++)
            {
                f[i][j]=obj.nextInt();
            }
        }
        if((a==d) && (b==e))
        {
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    if(c[i][j]==f[i][j])
                    {
                        count++;
                    }
                }
            }
        }
        if(count==a*b)
        {
            System.out.print("equal");
        }
        else 
        {
            System.out.print("Not equal");
        }
    }
    
}
