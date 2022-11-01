//Write a code to generate a half pyramid pattern of mulitples of the given number.
//
//Input Description:
//Given an integer R indicates number of rows.
//
//Where 1<=R<=100.
//
//Output Description:
//Print the number half pyramid pattern of multiples based on the given integer R.
//
//Sample Input :
//10
//Sample Output :
//1
//2 4
//3 6 9
//4 8 12 16
//5 10 15 20 25
//6 12 18 24 30 36
//7 14 21 28 35 42 49
//8 16 24 32 40 48 56 64
//9 18 27 36 45 54 63 72 81
//10 20 30 40 50 60 70 80 90 100
package guvi;
import java.util.*;
public class Pyramid_pattern_multiples {
     public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    int a=obj.nextInt();
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i*j+" ");
        }
        System.out.println(" ");
    }
    }
    
}
