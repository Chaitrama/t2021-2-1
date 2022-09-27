
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the frst value");
		double a = sc.nextDouble();
		System.out.println("enter the secnd value");
		double b = sc.nextDouble();

		System.out.println("1.Add\n 2.Sub\n 3.Mul\n 4.Div\n");
		System.out.println("enter the choice");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			double ans1 = add(a, b);
			System.out.println("sum=" + ans1);
			break;
		case 2:
			double ans2 = sub(a, b);
			System.out.println("sub=" + ans2);
			break;
		case 3:
			double ans3 = mul(a, b);
			System.out.println("mul=" + ans3);
			break;
		case 4:
			double ans4 = div(a, b);
			System.out.println("div=" + ans4);
			break;

		}
	}

	public static double add(double x, double y) {
		double c = x + y;
		return c;
	}

	public static double sub(double x, double y) {
		double c = x - y;
		return c;
	}

	public static double mul(double x, double y) {
		double c = x * y;
		return c;
	}

	public static double div(double x, double y) {
		double c = x / y;
		return c;
	}

}

