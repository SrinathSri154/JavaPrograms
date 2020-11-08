package stringProgrammes;

public class PalindromeAnotherWay {

	public static void main(String[] args) {

		String str = "mom";
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = new StringBuffer(str).reverse();
		
		
		//method 1 
//		if(sb.toString().equals(reverse.toString()))
//		{
//			System.out.println(str + " is palindrome");
//		}
//		
//		else {
//			System.out.println(str + ": is not a palindrome");	
//		}
//		
		//method 2
		if(sb.toString().compareTo(reverse.toString())==0)
{
			System.out.println(str + " is palindrome");
}
		else {
			
			System.out.println(str + " is not a palindrome");

		}	
	}

}
