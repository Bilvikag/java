package arrayDeletion;
import java.util.Scanner;
public class deletion {

	public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int n;   
        System.out.println("Enter the number of elements :");
        n=s1.nextInt();    
        
        Integer arr[]=new Integer[n];   
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     
        {
            arr[i]=s1.nextInt();
        }
        System.out.println("Enter the element you want to remove ");
        int elem = s1.nextInt();
        for(int i = 0; i < arr.length; i++)
        {
        	if(arr[i] == elem)
        	{
        		for(int j = i; j < arr.length - 1; j++)
        		{
        			arr[j] = arr[j+1];
        			}
        		break;
        		}
        	}
        System.out.println("Elements after deletion " );
        for(int i = 0; i < arr.length-1; i++)
        {
        	System.out.print(arr[i]+ " ");
        	}
        }
	}

