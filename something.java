import java.util.Scanner;

class something {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input the time in picoseconds between 100 and 1,000,000");
	 	double Time = sc.nextDouble();

		double Distance = Time * 0.299792;
		System.out.println("The distance travelled is " + Distance + " millimeters.");
	}
}
