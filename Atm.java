package projects;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int bakiye;
		int paraCekme;
		int paraYatirma;
		
		Scanner in = new Scanner (System.in);
		
		String islemler= "1. i�lem bakiye ��renme\n"
						 +"2. i�lem para �ekme\n"
						 +"3. i�lem para yat�rma\n"
						 +"4. i�lem ��k��";
		System.out.println(islemler);
		
		System.out.println("i�lemi se�iniz");
		String islem =in.nextLine();
		switch (islem) {
		case "1":
			System.out.println("bakiye: ");
			bakiye=in.nextInt();
			System.out.println(bakiye);
			break;
			
		case "2" :
			System.out.println("bakiye: ");
			bakiye=in.nextInt();
			System.out.println("�ekmek istedi�iniz tutat: ");
			paraCekme = in.nextInt();
			System.out.println("kalan bakiye: "+(bakiye-paraCekme));
			break;
			
		case "3" :
			System.out.println("bakiye: ");
			bakiye=in.nextInt();
			System.out.println("yat�mak istedi�iniz tutat: ");
			paraYatirma = in.nextInt();
			System.out.println("kalan bakiye: "+(bakiye+paraYatirma));
			break;
			
		case "4" :
			System.out.println("sistemden ��k�� yap�lm��t�r...");
			break;
		default:
			System.out.println("ge�ersiz i�lem giridiniz!!!");
			
		}
		
	}

}
