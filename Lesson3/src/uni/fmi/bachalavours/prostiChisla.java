
package uni.fmi.bachalavours;

public class prostiChisla {

	public static void main(String[] args) {
		boolean isPrime;
		for(int i=2;i<100;i++) {
			isPrime=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(i);
			}
		}
			
	}

}



