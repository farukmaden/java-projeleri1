package projects;

import java.util.Scanner;

public class KlavyedenGırılenSayıToplamı {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int toplam = 0;
		int sayı;
		System.out.println("bir sayi belirleyiniz");
		int belirlenenSayi = in.nextInt();
		for(int i=1;i<=belirlenenSayi;i++) {
			System.out.println("sayi " + i +" giriniz");
			sayı=in.nextInt();
			toplam=toplam+sayı;
			
		}
		System.out.println("toplam :" + toplam);

	}

}
