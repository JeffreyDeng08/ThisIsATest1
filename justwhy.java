import java.util.*;
import java.lang.*;

class justwhy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Base = 1.0;
		int Power = 1;
		double ScientificNotation = 0.0;

		Base = sc.nextDouble();
		Power = sc.nextInt();

		while (Base != 0 && Power != 0) {
			ScientificNotation = Base * Math.pow(10, Power);
			System.out.println(ScientificNotation);
			Base = sc.nextDouble();
			Power = sc.nextInt();
		}
	}
}
