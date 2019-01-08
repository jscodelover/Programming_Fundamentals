/**
 @author: JsCodeLover
 Repeat the Number. (n=4)
    1
    23
    4567
    891234567891234
 Cond: n is number of odd Rows.   
 */

import java.util.*;
class Tests
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of row : ");
		int num=sc.nextInt();
		int numprint=2, loopEnd=1;
		System.out.println("1");
		for(int i=2;i<=num;i++)
		{
			loopEnd*=2;
			for(int j=1;j<=loopEnd;j++)
			{
				if(numprint==10)
					numprint=1;
				System.out.print(numprint++);
			}	
			System.out.println();
		}	
	}
}

 