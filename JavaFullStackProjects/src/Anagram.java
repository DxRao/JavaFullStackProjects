// Assignment-4: Program-5 ...
// This Program checks if the two given Strings are an Anagram to each other or not.

import java.util.Arrays;

class CheckAnagram{
	
	public static boolean isAnagram(String str1, String str2) {
		
		 String str3 = "";
		 String str4 = "";
		   
		    for(int i=0; i < str1.length(); i++)
		    {
		    	   if(str1.charAt(i)>='A' && str1.charAt(i)<='Z'){
				   
					   str3 = str3 + (char)(str1.charAt(i) + 32);
				   }
		    	   else if(str1.charAt(i)>='a' && str1.charAt(i)<='z'){
					   
					   str3 = str3 + (char)(str1.charAt(i));
				   }
				   else if (str1.charAt(i) == ' ') {
					   
					   str3 = str3 + "";
				   }			   
		    }		   
			   
		    for(int i=0; i < str2.length(); i++)
		    {
		    	   if(str2.charAt(i)>='A' && str2.charAt(i)<='Z') {
				   
					   str4 = str4 + (char)(str2.charAt(i) + 32);
				   }
		    	   else if(str2.charAt(i)>='a' && str2.charAt(i)<='z') {
				   
					   str4 = str4 + (char)(str2.charAt(i));
				   }
				   else if (str2.charAt(i) == ' ') {
					   
					   str4 = str4 + "";
				   }			   
		    }
		    
		    if(str3.length() != str4.length()) {
		    	
		    	return false;    	
		    	
		    }		
		
		    char[] char1 = str3.toCharArray();
		    char[] char2 = str4.toCharArray();
		    
		    Arrays.sort(char1);
		    Arrays.sort(char2);		    
		
		    for(int i =0; i < char1.length; i++) {
		    	
		    	if(char1[i] != char2[i]) {
		    		
		    		return false;	    		
		    	}		
		    }//for
		    
		    return true;
	}
}


public class Anagram {

	public static void main(String[] args) {
		
		String str1 = "Silent Triangle Heart";
		String str2 = "Listen Integral Earth";	
		
		 boolean result = CheckAnagram.isAnagram(str1, str2);
		 
		 if (result == true) {
			 
			 System.out.println("Given Strings are an Anagram to each other.");
			 
		 }	 
		 else if (result == false){
			 
			 System.out.println("Given Strings are not an Anagram to each other.");	
			 
		 }			 
	}
}


