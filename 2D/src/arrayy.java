import java.util.Scanner;
public class arrayy {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the no of rows:");
		int row=s1.nextInt();
		System.out.println("enter the no of colomns:");
		int col=s1.nextInt();
		int i,j;
		int[][] matA=new int[row][col];
		System.out.println("enter"+row*col+"values");
		System.out.println("enter matrix values:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				matA[i][j]=s1.nextInt();
		}
		System.out.println("original matrix:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(matA[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("transpose matrix:");
		for(i=0;i<col;i++)
		{
			for(j=0;j<row;j++)
			{
				System.out.print(matA[j][i]+"\t");
			}
			System.out.println();
		}
	}

}
