package DesafiosIniciais;

import java.util.Scanner;

public class CoxinhadeBueno {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		sc.close();

		System.out.println(calcCoxinha(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
	}

	/**
	 * Do the math: DIV two values.
	 */
	public static String calcCoxinha(float h, float p) {
		return String.format("%.2f", (h / p)).replace(",", ".");
	}
}
