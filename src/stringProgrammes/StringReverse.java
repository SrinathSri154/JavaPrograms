package stringProgrammes;

public class StringReverse {

	public static void main(String[] args) {

		
		String str = "Srinath";
		char ch[] = str.toCharArray();
		String reverseword = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverseword = reverseword + ch[i];
			
		}
		
		System.out.println("Reverse string is:" + reverseword);
	}
	

	

}
 