import java.util.*;

class imbored {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		String array1[] = test.split(" ");
		int intn = Integer.parseInt(array1[0]);
		while(!test.equals("0 =")) {
			for (int i = 0; i < array1.length-2; i = i + 2) {
				int intn2 = Integer.parseInt(array1[i + 2]);
				if (array1[i + 1].equals("-")) {
					intn = intn - intn2;
				}
				else if (array1[i + 1].equals("*")) {
					intn = intn * intn2;
				}
				else if (array1[i + 1].equals("+")) {
					intn = intn + intn2;
				}
			}
			System.out.println(intn);
			test = sc.nextLine();
			array1 = test.split(" ");
			intn = Integer.parseInt(array1[0]);
		}
	}
}
