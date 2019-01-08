/**
 @author: JsCodeLover
 Print X using digits. (n = 4)
  1     1
   2   2 
    3 3
     4
    3 3
   2   2
  1     1
  Cond: n is upto what number X is to be created.
 */

import java.util.*;
class PrintX
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of row : ");
		int num=sc.nextInt();
		int spacebtn=1,spacebef=0,loopEnd,numPrint=1;
		for(int i=3;i<=num;i++)
			spacebtn+=2;
		loopEnd=(num-1)*2+1;
		for(int i=1;i<=loopEnd;i++)
		{
			for(int j=1;j<=spacebef;j++)
				System.out.print(" ");
			System.out.print(numPrint);
			for(int k=1;k<=spacebtn;k++)
				System.out.print(" ");
			if(i!=num)
			    System.out.print(numPrint);
			if(i<num-1)
			{
				spacebtn-=2;
				spacebef++;
				numPrint++;
			}
			else if((i+1)==num)
			{
				spacebef++;
				numPrint++;
				spacebtn-=2;
			}
			else
			{
				spacebtn+=2;
				spacebef--;
				numPrint--;
			}
			System.out.println();
		}	
	}
}
