package projects;

import java.util.Scanner;

public class Y�ld�zBast�rma {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("L�tfen tek bir tam say� giriniz : ");
		int sayi = in.nextInt();
		if (sayi < 0) {
			System.out.println("kurallara uygun say� giriniz!");
		} else if (sayi % 2 == 0) {
			System.out.println("kurallara uygun say� giriniz!");
			return;
		}
		for (int i = 1; i <= sayi; i += 2) {
			for (int j = 0; j <i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = sayi-2; i >=0; i-=2) {
			for (int j = 0; j < i; j++) {
			System.out.print("*");
			}
			System.out.println("");
			}
		
	}

}
