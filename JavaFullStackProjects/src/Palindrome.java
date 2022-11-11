import assignment_4.CheckPalindrome;

class CheckPalindrome{
	
	public static boolean isPalindrome(String str) {
	
		String reverseStr = "";
	
	for (int i = str.length()-1; i >= 0; i--) {
		
		reverseStr = reverseStr + str.charAt(i);
		
		}
	
		if(str.equals(reverseStr)) {
			
			return true;
		}
		
		else {
			
			return false;
			
		}
	}	
}

public class Palindrome {

	public static void main(String[] args) {
		
		String str = "2552";
		
		boolean result = CheckPalindrome.isPalindrome(str);
		
		if(result == true) {
			
			System.out.println("The number 2552 is a Palindrome");
		}
		
		else {
			
			System.out.println("The number 2552 is not a Palindrome");
		}
	}

}


