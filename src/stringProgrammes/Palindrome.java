package stringProgrammes;
import java.security.PublicKey;

public class Palindrome {
	public static void main(String[] args) {
	
	int n = 343,sum=0,r;
	int temp; 
	temp = n;
			while(n!=0)
			{
				
				r = n%10;
				sum = sum*10 +r;
				n = n/10;
				
			}
			
			if(temp==sum)
			{
				System.out.println("palindrom");
				}
			else
			{
				System.out.println("Not a palindrom");
				
			}

}
}
