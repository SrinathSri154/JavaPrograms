package stringProgrammes;

public class NumberReverse {
	
	
	public static void reverse(int number) {
		
		int r,sum=0;
		while(number!=0)
		{
			r = number%10; //1
			sum = sum*10+r; //21
			number = number/10; //3
			
		}
		
		System.out.println("Reverse of given number is :" + sum);
	}

	public static void main(String[] args) {

		reverse(312);
	}

}
