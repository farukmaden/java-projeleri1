package projects;

import java.util.Scanner;

public class KlavyedenG�r�lenSay�Toplam� {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int toplam = 0;
		int say�;
		System.out.println("bir sayi belirleyiniz");
		int belirlenenSayi = in.nextInt();
		for(int i=1;i<=belirlenenSayi;i++) {
			System.out.println("sayi " + i +" giriniz");
			say�=in.nextInt();
			toplam=toplam+say�;
			
		}
		System.out.println("toplam :" + toplam);

	}

}
