package projects;

import java.util.Scanner;

public class TekC�ftSay�Bulma {

	public static void main(String[] args) {
		System.out.println("bir tam say� giriniz");
		Scanner in = new Scanner(System.in);
		int sayi = in.nextInt();
		if(sayi%2==0) {
			System.out.println("say� �ifttir");
		}else {
			System.out.println("say� tektir");
		}
	

	}

}
