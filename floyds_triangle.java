//
//Generate a floyd's triangle.
//
//Input Description:
//Given an integer R indicates number of rows.
//
//Where 1<=R<=100.
//
//Output Description:
//Print a floyd's triangle based on the given integer R.
//
//Sample Input :
//5
//Sample Output :
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

import java.util.*;
public class floyds_triangle {
     public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        int b=1;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(b+" ");
                b++;
            }
            System.out.print("\n");
        }
    }
}
