import java.util.Scanner;
public class SecondsToMints {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		
		System.out.println("Enter seconds:");
		int secs=ob.nextInt();
		
		System.out.println("Mints will be: "+secs/60);	

	}

}
