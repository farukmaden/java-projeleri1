package projects;

import java.util.Scanner;

public class BasamakSayısıBulma {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Sayı giriniz : ");
		int sayi = in.nextInt();
		int basamak = 0;
		while(sayi>0) {
			sayi = sayi/10;
			basamak++;
		}
		System.out.println("girdiğiniz sayi " + basamak + " basamaklıdır");
		
	}

}
