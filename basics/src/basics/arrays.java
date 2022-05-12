package basics;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		int n,x,flag=0,i=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the no of elements:");
		n=s1.nextInt();
		int a[]=new int[n];
		System.out.println("\nenter all the elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.println("\nenter the elements wanted to find:");
		x=s1.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println(" element found at position:"+(i));
		}
		else
		{
			System.out.println("element is not found:");
		}
	}

}
