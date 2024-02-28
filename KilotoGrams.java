import java.util.Scanner;

public class KilotoGrams {
	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter kilos: ");
		int kilos=ob.nextInt();
		
		System.out.println("Grams are: "+kilos*1000);
	}

}
