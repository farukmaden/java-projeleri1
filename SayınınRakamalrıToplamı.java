package projects;

import java.util.Scanner;

public class Say�n�nRakamalr�Toplam� {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Bir say� giriniz");
		int sayi =in.nextInt();
		int toplam = 0;
		
		do {
			toplam += sayi%10;
			
			sayi/=10;
			
		}while(sayi>0);
		System.out.println("Rakamalar� toplam�= "+toplam);
	}

}
