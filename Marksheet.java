import java.util.Scanner;
public class Marksheet {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter english marks:");
		int eng=ob.nextInt();
		System.out.println("Enter java marks:");
		int java=ob.nextInt();
		System.out.println("Enter python marks:");
		int python=ob.nextInt();
		System.out.println("Enter c++ marks:");
		int cpp=ob.nextInt();
		System.out.println("Enter dsa marks:");
		int dsa=ob.nextInt();
		
		System.out.println("Total marks: 500");
		System.out.println("Obtained marks: "+(eng+java+python+cpp+dsa));
		System.out.println("Percentage"+((eng+java+python+cpp+dsa)*100)/500+"%");
	}

}
