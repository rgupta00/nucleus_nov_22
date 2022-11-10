import java.util.Scanner;

public class PrimeNoBw2NosDemo {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("PE 2 nos");
		
		int n1=scanner.nextInt();
		int n2=scanner.nextInt();
		
		int counter =
				findNoOfPrimeNumbersBetweenTwoNumber(n1, n2);
		
		System.out.println(counter);
		
	}

	static int findNoOfPrimeNumbersBetweenTwoNumber(int n1, int n2) {
		int counter=0;
		if(n2>n1) {
			for(int i=n1;i<=n2;i++) {
				if(checkForPrime(i))
					counter++;
			}
		}else
			counter=-1;
		return counter;
	}

	static boolean checkForPrime(int n) {
		boolean isPrime=true;
		for(int i=2;i<=(n-1);i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}

}




