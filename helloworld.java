import java.util.*;

public class helloworld {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // write ur code here

    int n = scn.nextInt();
    int i,j,k,l;
    l=(int)n/2;
    k=0;
    for(i=1;i<=n;i++)
    {
        k=i<(l+1)?k++:k--;
        for(j=1;j<=n;j++)
        {
            if(j>(l+1-k) && j<(l+1+k))
            {
                System.out.print("*\t");
            }
            else
            {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
    
  }
}