package projects;

import java.util.Scanner;

public class PrimHesap {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ayl�k maa��n�z� giriniz");
		double maa� =in.nextDouble();
		System.out.println("ayl�k sat�� giriniz");
		double ayl�kSat�� =in.nextDouble();
		System.out.println("prim y�zdenizi giriniz (0,2)");
		double prim =in.nextDouble();
		double toplamPrim;
		toplamPrim = ayl�kSat��*prim;
		maa�+=toplamPrim;
		System.out.println("bu ayki maa��n�z : "+ maa�);
		
		
		
		
	}

}
