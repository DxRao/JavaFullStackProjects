// Assignment-4: Program -2 ... Print duplicate elements in a given String.

public class PrintDuplicates {

	public static void main(String[] args) {
		
		String str = "abccdeeghijjklmmnoohxyzpp";
		
		char[] ch = str.toCharArray();
		
		char[] arr = new char[ch.length];
		
		int count =0;		
		
		for(int i =0; i < ch.length; i++) {
			for(int j = i+1; j < ch.length; j++) {
				
				if (ch[i] == ch[j]) {				
					
					arr[count] = ch[j];
					
					count++;
				}
				
				
			}//j
			
		}//i
		
		System.out.print("Duplicate elements in the given String are:");
		
		for(char elem : arr) {
			
			System.out.print(" " + elem);
					
		}
	}
}
