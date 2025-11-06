// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int current = Integer.parseInt(args[0]);
		double precent = Double.parseDouble(args[1]);
		int NYears = Integer.parseInt(args[2]);
		double rate = (double) precent / 100;
		double x = 1 + rate;
		double y = Math.pow(x, NYears);
		double future = current * y ;
		System.out.println( "After " + NYears + " years, $" + current + " saved at " + precent + "% will yield $" + (int) future);
	}
}