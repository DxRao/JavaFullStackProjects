// Assignment-4: Program-8
// This program counts and prints the Character that occurs maximum frequent times in a given String.

public class MaxCharacter {

	public static void main(String[] args) {
		
				String str = "aabccd deeefg hhiijjkkkkl mm nn opqrrrst uuvwxxyz";
				
		        int[] freq = new int[str.length()];
		        
		        char maxChar = str.charAt(0);
		        
		        int max;
		        
		        char string[] = str.toCharArray(); 		          
		         
		        for(int i = 0; i < string.length; i++) { 
		        	
		            freq[i] = 1; 
		            
		            for(int j = i+1; j < string.length; j++) {
		            	
		                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
		                    
		                	freq[i]++;		                      
		                      
		                    string[j] = '0';  
		                }  
		            }  
		        }         
		          
		        max = freq[0];
		        
		        for(int i = 0; i <freq.length; i++) { 	           
		           
		            if(max < freq[i]) {
		            	
		                max = freq[i]; 
		                
		                maxChar = string[i];  
		            }  
		        }          
		          
		         System.out.println("Maximum occurring character in the given String is: " + maxChar); 
		} 		
}// end of program