package projects;

import java.util.Scanner;

public class MathRandomSay�Tahmin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("max de�eri giriniz : ");
		int max = in.nextInt();

		int sayi = ((int) (Math.random() * max));

		if (max <= 100) {
			for (int i = 1; i < 8; i++) {
				int tahminSay�s� = (int) (Math.random() * max);
				System.out.println("olu�an sayi " + sayi);
				System.out.println("tahmin say�s� " + tahminSay�s�);
				if (sayi == tahminSay�s�) {
					System.out.println("do�ru sayi");
					return;
				} else {
					System.out.println("yanl�� sayi");

				}
			}
		} else {
			if (100 < max && max <= 1000) {
				for (int i = 1; i < 15; i++) {
					int tahminSay�s� = (int) (Math.random() * 10);
					System.out.println("olu�an sayi " + sayi);
					System.out.println("tahmin say�s� " + tahminSay�s�);
					if (sayi == tahminSay�s�) {
						System.out.println("do�ru sayi");
						return;
					} else {
						System.out.println("yanl�� sayi");

					}
				}
			}
		}

	}

}
