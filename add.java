import java.util.*;
class add{
	public static void main(String[]args){
		int a[][],r,c,i,j,b[][],sum[][];
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of 1st matrix");
		r=s.nextInt();
		c=s.nextInt();
		
		a=new int[r][c];
		b=new int[r][c];
		sum=new int[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("enter a["+ i +"][" + j +"]");
				a[i][j]=s.nextInt();	

			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.println("enter b["+ i +"][" + j +"]");
				b[i][j]=s.nextInt();	

			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];

			}
		}
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(sum[i][j]+ "\t");
			}
			System.out.println("");
		}
}
}