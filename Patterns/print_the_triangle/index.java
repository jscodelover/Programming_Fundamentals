/**
 * @author : JsCodeLover
 * Print this pattern:
 *      1
 *    2 3 2
 *  3 4 5 4 3
 */

import java.util.*;
class Main
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value : ");
		int n=sc.nextInt();
		int point=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n; j>i; j--)
				System.out.print("  ");
			for(int k=i; k<=point; k++)
				System.out.print(k+" ");	
			for(int l=point-1; l>=i; l--)
				System.out.print(l+" ");
			System.out.println(" ");
      point += 2;
		}
	}
}