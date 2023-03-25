// 1	     //combination and permutaion formula
// 1	1	
// 1	2	1	
// 1	3	3	1	 
// 1	4	6	4	1
import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args)
    {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scn.nextInt();
        int i,j;
        for(i=0;i<rows;i++)
        {
            for(j=0;j<rows;j++)
            {
                if(j<=i)
                {
                    System.out.print(combination(i,j));
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }    
    public static int fact(int n)
    {
        int i;
        int f=1;
        for(i=n;i>=2;i--)
        {
          f=f*i;
        }
        return f;
    }
    public static int combination(int n, int r)
    {
        return (fact(n)/(fact(r)*fact(n-r)));
    }
}
