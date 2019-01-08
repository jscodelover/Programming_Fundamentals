/**
 @author: JsCodeLover
 Print the Hollo Diamond. (n=5)
    *
  *   *
 *     *
  *   *  
    *
  cond: n is number of odd Rows   
 */

Print Hollo Daimond 

import java.util.*;
class Tests
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row(odd) : ");
		int num=sc.nextInt();
		int outSpace=1,inSpace=-1,loopEnd;
		if(num==3)
			loopEnd=2;
		else
			loopEnd=num-2;
		for(int i=1;i<=num;i++)
		{
			for(int j=outSpace;j<loopEnd;j++)
				System.out.print(" ");
			System.out.print("*");
			if(i>=2&&i<num)
			{
				for(int j=1;j<=inSpace;j++)
					System.out.print(" ");	
				System.out.print("*");	
			}
			System.out.println();	
			if(i<(num/2+1))
			{
				outSpace++;
				inSpace+=2;
			}
			else 
			{
				outSpace--;
				inSpace-=2;
			}
		}	
	}	
}
