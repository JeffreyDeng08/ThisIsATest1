import java.util.*;

class wow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int weeks = 0;
		int Gallons = 1;

		Gallons = sc.nextInt();

		while (Gallons != 0) {

			weeks = 10000 / Gallons;
			System.out.println(Gallons + " gallons per week will last " + weeks + " weeks.");
			Gallons = sc.nextInt();
		}
	}
}
