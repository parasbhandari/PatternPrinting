
// 0	
// 1	1	  //fibonanci number
// 2	3	5	
// 8	13	21	34	
// 55	89	144	233	377	
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args)
    {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int rows= scn.nextInt();
    int fib1,fib2,fib3;
    int i,j;
    fib1=-1;
    fib2=1;
    for(i=1;i<=rows;i++)
    {
        for(j=1;j<=rows;j++)
        {
            if(j<=i)
            {
                fib3=fib2+fib1;
                System.out.print(fib3 + "\t");
                fib1=fib2;
                fib2=fib3;
                
            }
        }
        System.out.println();
    }


    }
}
