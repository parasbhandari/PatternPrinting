// *				*	
// *				*	
// *		*		*	
// *	*		*	*	
// *				*	
import java.util.Scanner;
public class pattern11 {
public static void main(String[] args)
{
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int rows=scn.nextInt();
    int i,j;
    for(i=1;i<=rows;i++)
    {
        for(j=1;j<=rows;j++)
        {
            if(j==1 || j==rows)
            {
                System.out.print("*\t");
            }
            else if(i>rows/2 &&(i==j || i+j==rows+1))
            {
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
}
    
}
