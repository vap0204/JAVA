package months;

import java.util.Scanner;

public class months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		Scanner in=new Scanner(System.in);
		System.out.print("Enter month: ");
		String month=in.nextLine();
		
		
		switch(month) {
		case "Jan": case "Mar": case "May":case "Jul": case "Aug": case "Oct": case "Dec":
			break;
		
		case "Apr": case "Jun": case "Sep": case "Nov":
			break;
		case "Feb":
			int year=in.nextInt();
			
		if((year%4==0) && (year%100==0)||(year%100!=0)) {
			System.out.println("This month has 29 days");
		}else{
			System.out.println("This month has 28 days");
		}
		
		break;
	}

}
}
