package projects;

import java.util.Scanner;

public class dizideSay�Bulma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int[] say�lar = new int[] { 1, 2, 3, 4, 5, 6 };
		System.out.println("aranacak say�y� giriniz : ");
		int aranacak = in.nextInt() ;

		boolean varM� = false;
		for (int say� : say�lar) {
			if (say� == aranacak) {
				varM� = true;
				break;
			}

		}
		if (varM�) {
			System.out.println("say� mevcuttur");
		} else {
			System.out.println("say� mevcut de�ildir");
		}

	}

}
