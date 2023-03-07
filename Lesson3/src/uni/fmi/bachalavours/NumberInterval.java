package uni.fmi.bachalavours;
import java.util.Scanner;
public class NumberInterval {

	public static void main(String[] args) {
		
		Scanner an = new Scanner(System.in);
		System.out.println("Insert number between 5 AND 50");
		
		int a;
		do {
			a=an.nextInt();
			System.out.println("Bravo");
			
		}while(a<5 || a>50);

	}

}
