
public class SwapNumbers {

	public static void main(String[] args) {
		int a = 12, b = 23;
		int temp;
		
		System.out.println("Values of a and b before swapping are: " + a +" " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Values of a and b after swapping are: " + a + " " + b);

	}

}
