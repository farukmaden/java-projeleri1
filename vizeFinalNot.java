package projects;

import java.util.Scanner;

public class vizeFinalNot {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("s�nav1 notunu giriniz");
		int s�nav1 = in.nextInt();
		System.out.println("s�nav2 notunu giriniz");
		int s�nav2 = in.nextInt();
		System.out.println("s�zl� notunu giriniz");
		int sozlu = in.nextInt();
		double ortalama =s�nav1 * 0.4 + s�nav2 * 0.4 + sozlu*0.2;
		if (ortalama >= 50) {
			System.out.println(ortalama+" : notu ile ��renci ge�mi�tir");
		} else {
			System.out.println(ortalama+" : notu ile ��renci kalm��t�r");
		}

	}

}
