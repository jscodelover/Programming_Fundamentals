/**
 @author: JsCodeLover
 Print the Swap Pattern : (n=5)
    1 2 3 4 5
    11 12 13 14 15
    21 22 23 24 25
    16 17 18 19 20
    6 7 8 9 10
  n is the number of Rows.
  Cond: n should a odd number
 */

import java.util.*;
class Main
{
	public static void main(String ar[])
	{
    Main swap = new Main();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of row (odd) : ");
		int num=sc.nextInt();
		int startValue,num_half,Value;
		if(num%2==0)
			num_half=num/2;
		else
			num_half=(num/2)+1;
		Value=0;
        Value =  swap.print(1, num_half, Value, num, 2);
		if(num%2==0)
			Value=Value-1;
		else
			Value=Value-3;
        Value =  swap.print(num_half+1, num, Value, num, -2);
	}
    public int print(int start, int end, int Value, int num, int next){
		for(int i=start;i<=end;i++)
			{
				int startValue=(Value*num)+1;
				for(int j=startValue;j<startValue+num;j++)
					System.out.print(j+" ");
				Value+=next;
				System.out.println();
			}
		return Value;
  }
}
