package DesafiosIniciais;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ÁlbumdaCopa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int N = leitor.nextInt();

		int M = leitor.nextInt();

		Set<Integer> compradas = new HashSet<>();

		for (int i = 0; i < M; i++) {
			int figComprada = leitor.nextInt();

			compradas.add(figComprada);

		}

		System.out.println(N - compradas.size());

	}
}
