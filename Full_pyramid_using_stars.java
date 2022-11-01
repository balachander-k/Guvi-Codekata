
//Write a code to generate a full pyramid pattern using stars.
//
//Input Description:
//Given an integer R indicates number of rows.
//
//Where 1<=R<=100.
//
//Output Description:
//Print the star pyramid with the given integer R.
//
//Sample Input :
//5
//Sample Output :
//    *
//   * *
//  * * *
// * * * *
//* * * * *

package guvi;
import java.util.*;
public class Full_pyramid_using_stars {
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int s=i;s<=a-1;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
                
            }
            System.out.print("\n");
        }
    }
    
}
