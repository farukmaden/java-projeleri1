package projects;

import java.util.Scanner;

public class Fakt�riyel {

	public static void main(String[] args) {
	
		Scanner in = new Scanner (System.in);
		System.out.println("l�tfen bir say� giriniz");
		int sayi = in.nextInt();
		int fakt�riyel=1;
		int i =1;
		while(i<=sayi) {
			fakt�riyel*=i;
			i++;
		}
		System.out.println("fakt�riyel  " + fakt�riyel);
	}

}
