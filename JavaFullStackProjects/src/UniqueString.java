// Assignment-4: Program -7 ... Find if the given String has all unique elements or not.

public class UniqueString {		

		public static void main(String[] args) {			
			
			String str = "abccdeeghijjklmmnoohxyzpp";
			
			//String str = "abcdefghijklmnopqrswxyz";
			
			int counter = 0;
			
			char[] ch = str.toCharArray();							
			
			for(int i = 0; i < ch.length-1; i++) {				
					
					if (ch[i] == ch[i+1]) {	
						
						System.out.println("This String is not Unique and has duplicate elements");
						
						break;
						
					}
					
					counter++;				
			}//i
			
			if(counter == ch.length -1) {
				
				System.out.println("This String is Unique without any duplicate elements");
				
			}		
	}
}



