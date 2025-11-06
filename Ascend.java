// Generates three integer random numbers in a given range,
// and prints them in increasing order.
// public class Ascend {
// 	public static void main(String[] args) {
// 		// Replace this comment with your code
// 	}
// }
public class Ascend {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * x );
		int b = (int) (Math.random() * x );
		int c = (int) (Math.random() * x );
		System.out.println(a + " " + b + " " + c);
		int min1 = Math.min(a, Math.min(b,c));
		int max1 = Math.max(a, Math.min(b,c));
		int mid1 = (a + b + c) - min1 - max1 ;
		System.out.println(min1 + " " + mid1 + " " + max1);
    }
}
