package projects;

import java.util.Scanner;

public class M�kemmelSay� {

	public static void main(String[] args) {
		System.out.println("bir say� giriniz");
		Scanner in = new Scanner(System.in);
		
		int say� =in.nextInt();
		int toplam=0;
		for(int i =1;i<say�;i++) {
			if(say�%i==0) {
				toplam = toplam+i;
			}
		}
		if(toplam==say�) {
			System.out.println("m�kemmel say�d�r");
		}else {
			System.out.println("m�kemmel say� de�ildir");
		}

	}

}
