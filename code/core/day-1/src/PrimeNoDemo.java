import java.util.Scanner;

public class PrimeNoDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE no of star");
		
		int n=scanner.nextInt();
		
		boolean isPrime=true;
		for(int i=2;i<=(n-1);i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println("it is prime no");
		else
			System.out.println("it is not a prime no");
		
	}

}




