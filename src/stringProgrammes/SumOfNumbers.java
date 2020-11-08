 package stringProgrammes;


import java.security.PublicKey;

public class SumOfNumbers {
	public static void main(String[] args) {
	
	int n = 13,sum=0,r;
			while(n!=0)
			{
				
				r = n%10; 
				sum = sum+r;
				n = n/10;
				
			}
			
			System.out.println("Sum of given numbers are :" +sum);

}
}
