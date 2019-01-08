/**
 @author: JsCodeLover
 Print the Swap Pattern : (n=5)
    1 2 3 4 5
    11 12 13 14 15
    21 22 23 24 25
    16 17 18 19 20
    6 7 8 9 10
 Cond : n is the number of Rows.
 */

import java.util.*;
class SwapPattern
{
	public static void main(String ar[])
	{
		SwapPattern pattern = new SwapPattern();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of row (odd) : ");
		int num=sc.nextInt();
		int num_half, Value;
		if(num%2==0)
			num_half=num/2;
		else
			num_half=(num/2)+1;
		Value=0;
		for(int i=1; i<=num_half; i++)
		{
			pattern.print(num, Value);
			Value+=2;
			System.out.println();
		}
		if(num%2==0)
			Value=Value-1;
		else
			Value=Value-3;
		for(int i=num_half+1; i<=num; i++)
		{
			pattern.print(num, Value);
			Value-=2;
			System.out.println();
		} 
	}
	void print(int num, int Value){
		int startValue=(Value*num)+1;
		for(int j=startValue; j<startValue+num; j++)
			System.out.print(j+" ");
	}
}