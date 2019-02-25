/**
 @author: JsCodeLover
 Print the Repeating Number 
 case 1 : (n=2)
  1
  23
 case 2: (n=3)
  1
  23
  4567
 case 3: (n=4)
  1
  23
  4567
  89123456

  n is the number of rows.
  Cond: (i) rows increase in the power of 2 
   eg -
     1    => (2)^0 => 1 number 
     23   => (2)^1 => 2 number
     4567 => (2)^2 => 4 number
  (ii) Number in row can be from 1 to 9, after number increase to 9 again repeat from 1.

 */

import java.util.*;
class Main
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
