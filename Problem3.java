import java.util.Scanner;
public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int j=1;
		

			if(a%2==0)
			{
				a=a-1;
				for(int i=1;i<=a;i++)
				{
					System.out.print(j+" ");
					j=j+2;
				}
			}
			else
			{
				
				for(int i=1;i<=a;i++)
				{
					
					System.out.print(j+" ");
					j=j+2;
				}
				
			}

		

	}
	

}
