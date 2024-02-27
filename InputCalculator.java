import java.util.Scanner;
public class InputCalculator {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter first number");
		int a=ob.nextInt();
		System.out.println("Enter second number");
		int b=ob.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
	}

}
