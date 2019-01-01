/**
  @author : JsCodeLover
  Print the Rocket using Stars. (n = 6)
    *
    * *
    * * *
        * * * *
    * * *
    * *
    *
 */

import java.util.*;
class Main
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		for(int i=0;i<=n/2;i++)
		{
			for(int k=i;k>0;k--)
				System.out.print("  ");
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println(" ");
		}
		for(int i=n/2+1;i<n;i++)
		{
			for(int j=i;j<n-1;j++)
				System.out.print("  ");
			for(int k=i;k<n;k++)
				System.out.print("* ");
			System.out.println(" ");
		}	
	}
}