import java.util.*;
import java.lang.*;

class ok {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		while (num != 0) {
			String binary = Integer.toBinaryString((num));
			int counter1 = 0;
			int counter2 = 0;
			for (int i = 0; i < binary.length(); i++) {
				if (binary.charAt(i) == '1') {
					counter1++;
				}
				else if (binary.charAt(i) == '0') {
					counter2++;
				}
			}
			if (counter1 > counter2) {
				System.out.println(num + " HEAVY");
			}
			else if (counter1 == counter2) {
				System.out.println(num + " BALANCED");
			}
			else if (counter1 < counter2) {
				System.out.println(num + " LIGHT");
			}
			num = sc.nextInt();
		}
	}
}
