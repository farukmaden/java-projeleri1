package projects;

import java.util.Scanner;

public class Kullan�c�danGirilenEnBuyukSay�Bulma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("say� 1 i giriniz");
		int sayi1 = in.nextInt();
		System.out.println("say� 2 i giriniz");
		int sayi2 = in.nextInt();
		System.out.println("say� 3 i giriniz");
		int sayi3 = in.nextInt();

		if (sayi1 < sayi2 && sayi2 < sayi3) {
			System.out.println("en b�y�k say� " + sayi3 + " t�r.");
		} else if (sayi1 > sayi2 && sayi1 > sayi3) {
			System.out.println("en b�y�k sayi " + sayi1 + " dir");
		} else if (sayi2 > sayi1 && sayi2 > sayi3) {
			System.out.println("en b�y�k say� " + sayi2 + " dir");
		}

	}

}
