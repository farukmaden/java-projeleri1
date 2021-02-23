package projects;

import java.util.Scanner;

public class Otob�sProgram� {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the date (HH:MM) --> ");
		String currentDate = input.next();//�uanki saat 
		String[] hourAndMinute = currentDate.split(":");// saati ortadan b�l�yor saat ve dakika diye split b�lme yapar 
		String otobusSaatleri[] = { "12:00", "13:00", "14:00" };

		int currentHour = Integer.parseInt(hourAndMinute[0]);//b�l�m�� k�sm�n saatini stringden inte �eviriyor
		int currentMinute = Integer.parseInt(hourAndMinute[1]);//b�l�m�� k�sm�n dakikas�n� stringden inte �eviriyor
		int i;
		// for d�ng�s� ile kontrol ediliyor
		for (i = 0; i < otobusSaatleri.length; i++) {
			String[] otoSaat = otobusSaatleri[i].split(":");//dizinin i�indeki saatleri b�l�yor
			int firstHour = Integer.parseInt(otoSaat[0]);// diziin i�indeki saati stringden inte �eviriyor
			int firstMinute = Integer.parseInt(otoSaat[1]);// diziin i�indeki dakikay� stringden inte �eviriyor
			// mesela 14:00 da otosaat0 dedi�nide 0 olan 14 t�r 1 olan 00 k�sm�d�r 
			
			if (firstHour > currentHour) {
				if (firstMinute >= currentMinute) {
					int kalanSaat = firstHour - currentHour;
					int kalanDakika = firstMinute - currentMinute;
					System.out.println("kalan saat: " + kalanSaat + " kalan dakika: " + kalanDakika);
					break;

				} else {
					int kalanSaat = firstHour - currentHour - 1;
					int kalanDakika = firstMinute - currentMinute + 60;
					System.out.println("kalan saat: " + kalanSaat + " kalan dakika: " + kalanDakika);
					break;
				}

			} else if (firstMinute > currentMinute) {
				int kalanSaat = firstHour - currentHour;
				int kalanDakika = firstMinute - currentMinute;
				System.out.println("kalan saat: " + kalanSaat + " kalan dakika: " + kalanDakika);
				break;

			}

		}
		if (i == otobusSaatleri.length) {
			System.out.println("otobus kalmamistir!!!");
		}
		
		
		
		

	}

}
