package bikvadratno;

import java.util.Scanner;

public class kvadtatno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kv = new Scanner(System.in);
	    System.out.println("Enter numbers");
	    
	    double a=kv.nextDouble();
	    double b=kv.nextDouble();
	    double c=kv.nextDouble();
	   
	    double d=(Math.pow(b, 2.0))-4*a*c;
	    if(d>0){
	    	double x1=(-b+Math.sqrt(d))/2*a;
		    double x2=(-b-Math.sqrt(d))/2*a;
		    System.out.println("X1="+x1+ " x2="+x2);
	    }
	    else if(d<0) {
	    	
	    	 System.out.println("No roots");
	    	
	    }else {
	    	double x=-b/2*a;
	    	System.out.println("X="+x );
	    }

	}

}
