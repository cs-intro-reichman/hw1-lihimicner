// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int sumbill = Integer.parseInt(args[3]);
		double sumbill2 = sumbill / 3;
		double sumbill3 = Math.ceil(sumbill2);
		System.out.println(" dear  " + name1 + ",  " + name2 + " and  " + name3 + " pay  " + sumbill3 + "  each ");
		}
}
