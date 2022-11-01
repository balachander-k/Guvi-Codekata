
//Generate a number pyramid pattern.
//
//Input Description:
//Given an integer R indicates number of rows.
//
//Where 1<=R<=100
//
//Output Description:
//Print the number half pyramid pattern with the size R.
//
//Sample Input :
//4
//Sample Output :
//1234567
//12345
//123
//1

package guvi;
import java.util.*;
public class pyramid_pattern {
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=(a*2)-1;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
            b=b-2;
        }
    }
    
}
