// Assignment-4: Program-4 Counts the number of Consonants, Vowels, and special characters in a given String.

public class CountCharacters {

	public static void main(String[] args){
		
		int consonantsCounter = 0;
		int vowelsCounter = 0;
		int specialCharCounter = 0;
		
		String str = "ab@cde$fg!h ijk#lmn opq*r stuv&wxyz";

	    for(int i=0;i<str.length();i++){
	    
		   if(str.charAt(i)>='b' && str.charAt(i)<='d' || str.charAt(i)>='f' && str.charAt(i)<='h' 
				   || str.charAt(i)>='j' && str.charAt(i)<='n' || str.charAt(i)>='p' && str.charAt(i)<='t'
				   || str.charAt(i)>='v' && str.charAt(i)<='z') {
		   
			   consonantsCounter++;
			   
		   }
		   else if(str.charAt(i)>='B' && str.charAt(i)<='D' || str.charAt(i)>='F' && str.charAt(i)<='H' 
				   || str.charAt(i)>='J' && str.charAt(i)<='N' || str.charAt(i)>='P' && str.charAt(i)<='T'
				   || str.charAt(i)>='V' && str.charAt(i)<='Z') {
		   
			   consonantsCounter++;
			   
		   }
		   else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' 
					   || str.charAt(i)=='u') {
				   
				   vowelsCounter++;
				   
		   }
			else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' 
					   || str.charAt(i)=='U') {
				   
				   vowelsCounter++;
				   
			   }
		   else if (str.charAt(i) == ' ') {
			   
			   continue;
			   
		   }
		   else {
			   
			   specialCharCounter++;
			   
			   }		  
	     }
	    
	     System.out.println("Number of Consonants in the given String are: " + consonantsCounter);
	     
	     System.out.println("Number of Vowels in the given String are: " + vowelsCounter);
	     
	     System.out.println("Number of Special Characters in the given String are: " + specialCharCounter);
	}
}
