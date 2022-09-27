
import java.util.Scanner;
public class Problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the series");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=1;j<=9;j++)
		{
			for(int i=0;i<=a.length;i++)
			{
				if((a[i]%j)==0)
				{
					count=count+1;
				}
				System.out.print(j=count);
			}
		}
		
	}

}

