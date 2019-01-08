/**
 @author: JsCodeLover
 Print the Diamond using Stars. (n=7)
    *******
    *** ***
    **   **
    *     *
    **   **
    *** ***
    *******
 Cond: n is the number of Rows.
 */

import java.util.*;
class Main
{
	public static void main(String ar[])
	{
        Main diamond = new Main();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of row (odd) : ");
		int num=sc.nextInt();
		int inner_num=num-2;
		int halfi_num=inner_num/2;
		int spacept,inc=0;
		for(int i=0; i<num; i++)
			System.out.print("*");
		System.out.println(" ");
		for(int j=0; j<=halfi_num; j++)
		{
			spacept=j+ ++inc;
            diamond.print(num, spacept);
		}
		int m=halfi_num;	
		for(int j=halfi_num+1;j<inner_num;j++)
		{
			spacept= --m + --inc;
			diamond.print(num, spacept);
		}	
		for(int i=0;i<num;i++)
			System.out.print("*");
	}
    public void print(int num, int spacept){
        int star_before=(num-spacept)/2;
        int star_after=(num-spacept)/2;
        for(int k=0;k<star_before;k++)
            System.out.print("*");
        for(int k=0;k<spacept;k++)
            System.out.print(" ");
        for(int k=0;k<star_after;k++)
            System.out.print("*");
        System.out.println(" ");
    }
}
