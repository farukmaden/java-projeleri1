package projects;

import java.util.Scanner;

public class �kiSay�KareToplam {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("say� 1 giriniz");
		int say�1 = in.nextInt();
	
		System.out.println("say� 2 giriniz");
		int say�2 = in.nextInt();
		System.out.print("toplam = ");
		System.out.print( (say�1*2) + (say�2*2));
	}

}
