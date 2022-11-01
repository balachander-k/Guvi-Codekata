
package guvi;
import java.util.*;
public class star_pattern {
    public static void main(String[] arg)
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int k=i;k<=a-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
