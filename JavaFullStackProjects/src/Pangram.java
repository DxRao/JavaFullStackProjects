// Assignment-4: Program-6
// ... This Program checks if the given String is a Pangram or not.

class CheckPangram{
	
	public static boolean isPangram(String str) {		
		
		String str1 = "";
		
		for(int i=0; i < str.length(); i++) {
	    
	    	   if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
			   
				   str1 = str1 + (char)(str.charAt(i));
			   }
	    	   else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				   
				   str1 = str1 + (char)(str.charAt(i) - 32);
			   }
			   else if (str.charAt(i) == ' ') {
				   
				   str1 = str1 + "";
			   }			   
	    }		   
		
		char[] ch=str1.toCharArray();
		
		int[] arr = new int[26];
		
		for(int i = 0; i < ch.length; i++){
		
			int index = ch[i] - 65;
			
			arr[index]++;  			
			
		}
		
		for(int i=0; i < arr.length; i++) {
		
			if(arr[i] == 0) {			
				
				return false;
			}
		}
		
		return true;
		
	} // method
} //class

public class Pangram {

	public static void main(String[] args) {
		
		 //String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		 String str = "The Quick Brown Fox Jumps Over The Lazy Dog";
			
		
		 boolean result = CheckPangram.isPangram(str);
		 
		 if (result == true) {
			 
			 System.out.println("Given String is a Pangram.");
			 
		 }	 
		 else if (result == false){
			 
			 System.out.println("Given String is not a Pangram.");	
			 
		 }			 
	}
}


