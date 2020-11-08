package stringProgrammes;

public class StringBufferReverse {
	
	
	
	public static String reverse(String str) {
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
		
	}

	public static void main(String[] args) {
		System.out.println("Reverse of String is:" + StringBufferReverse.reverse("Hi this is srinath"));
		System.out.println("Reverse of String is:" + StringBufferReverse.reverse("Hi this is sri"));

	}

}
