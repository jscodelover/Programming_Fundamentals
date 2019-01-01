/**
 @author: JsCodeLover
 Print the Rectangle : (n = 5)
    555555555
    544444445
    543333345
    543222345
    543212345
    544444445
    543333345
    543222345
    555555555
 */

 import java.util.*;
class Main
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of row (>1) : ");
		int n=sc.nextInt();
		int inLoop=1,k,i,j,temp,num=n+1,loop ;
		for(temp=2;temp<n;temp++)  //no of rows after removing top and bottom row
			inLoop+=2;	
		loop=inLoop-2;
		for(i=1;i<=n+(n-1);i++) // top row
			System.out.print(n);
		for(i=1;i<=inLoop/2;i++)         // rows above 212
		{
			for(k=0;k<=i;k++)
				System.out.print(--num);    //  starting different no eg 543                   
			for(k=1;k<=loop;k++) 
				System.out.print(num);        // repeat no in row 333    
			loop-=2;
			for(k=0;k<=i;k++)                 // end different in reverse 345
				System.out.print(num++);
			System.out.println(" ");
		}
		for(j=n;j>=1;j--)                // half row of 212 eg 54321
			System.out.print(j);
		for(j=2;j<=n;j++)	
			System.out.print(j);         // other half of 212 eg 2345
		System.out.println(" ");
		num=n+1;
		loop=inLoop-2;
		for(i=1;i<=inLoop/2;i++)       // rows below 212
		{
			for(k=0;k<=i;k++)
				System.out.print(--num);
			for(k=1;k<=loop;k++)
				System.out.print(num);
			loop-=2;
			for(k=0;k<=i;k++)
				System.out.print(num++);
			System.out.println(" ");
		}
		for(i=1;i<=n+(n-1);i++)
			System.out.print(n);	// bottom row  row 1 after removing first row and last row  
	}
}