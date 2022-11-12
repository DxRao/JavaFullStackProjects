// Assignment-4: Program -1 ... Remove duplicate elements in a given String.

public class RemoveDuplicates {

	public static void main(String[] args) {		
				
				String str = "aabccdeeghijjklmmnoohxyzpp";
				
				char[] ch = str.toCharArray();
				
				char[] arr = new char[ch.length];
				
				int count =0;		
				
				for(int i =0; i < ch.length; i++) {
					
					int j;
					
					for(j = 0; j < i; j++) {						
						
						if (ch[i] == ch[j]) {
							
							break;							
						}
						
					}//j
					
					if(j == i) {
						
						arr[count] = ch[i];	
						
						count++;					
					}
					
				}//i
				
				System.out.print("Elements in the given String after removing duplicates are:");
				
				for(char elem : arr) {
					
					System.out.print(" " + elem);
							
				}
		}
}
