package projects;

import java.util.Scanner;

public class NtaneSay�Ortalama {

	public static void main(String[] args) {
		/*
		float toplam=0;
		System.out.println("say� giriniz");
		Scanner in = new Scanner (System.in);
		int say� = in.nextInt();
		int n;
		 for(int i = 1;i<say�;i++) {
			 System.out.println("n. "+ say�+" giriniz");
			 n = in.nextInt();
			 toplam+=n;
		 }
		 float ortalama = toplam%say�;
		 System.out.println("ortalama" + ortalama);
		 */
		 float toplam = 0;
	        int sayi;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Kac tane sayi gireceksiniz: ");
	        int n = input.nextInt();
	        for (int i=1; i<=n; i++) {
	            System.out.print("Sayi "+ i +" giriniz: ");
	            sayi = input.nextInt();
	            toplam += sayi;
	        }
	        float ortalama = toplam/n;
	        System.out.println("Ortalama: " + ortalama);
	}

}
