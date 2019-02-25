/**
 @author: JsCodeLover
 Find and return sum of all elements in an array which are either divisible by 2 or by 3.
  1 <= N <=10^5
 eg 1 2 3 5 6
 sum = 11 (2+3+6)
 */

import java.util.*;
class Main
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of elements in array(n <= 50) : ");
		int arr[]=new int[50];
		int num=sc.nextInt();
		int sum=0;
        if(num <= 50)
		{
            for(int i=0;i<num;i++)	
            {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0||arr[i]%3==0)
                    sum+=arr[i];
            }
            System.out.println("Sum = "+sum);
        }
        else{
            System.out.println("No. of Array element should be less or equal to 50");
        }
	}
} 