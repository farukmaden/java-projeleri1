package projects;

import java.util.Scanner;

public class SwitchCase�leHesapMkinesi {

	public static void main(String[] args) {
		
		int a;
		int b;
		Scanner in =new Scanner (System.in);
		String islemler = "1. toplama i�lemi\n"
		                  +"2. ��karma i�lemi\n"
				  +"3. �arpma i�lemi\n"   
		                  +"4. b�lme i�lemi";    
		
		//System.out.println(islemler);
		System.out.println("i�lemi se�iniz");
		String islem =in.nextLine();
		switch (islem) {
		case "1":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("toplama i�lemi " +(a+b) );
			break;
		case "2":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("��karma i�lemi " +(a-b) );
			break;
		case "3":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("�arpma i�lemi " +(a*b) );
			break;
		case "4":
			System.out.println("birinic sayi: ");
			a=in.nextInt();
			System.out.println("ikinici sayi: ");
			b=in.nextInt();
			System.out.println("b�lme i�lemi " +((double)a/b) );
			break;
			default:
				System.out.println("ge�ersiz i�lem giridiniz!!!");
				
			
		}
		
		/*
		 * BURADA BEN KEND� D���ND���M PROGRAMI YAPMAYA �AI�TIM AMA DE�ERLER� SW�TCH LER�N ���NDE OKUTMAM GEREK�YORMU�
		Scanner in = new Scanner(System.in);
		System.out.println("birinici say�y� giriniz");
		int sayi1 = in.nextInt();
		System.out.println("ikinci say�y� giriniz");
		int sayi2 = in.nextInt();

		String islem = in.nextLine();
		System.out.println("i�lem say�s�n� se�iniz");
		switch (islem) {
		case "1":
			System.out.println("toplama i�lemi: " + (sayi1 + sayi2));
			break;
		case "2":
			System.out.println("��karma i�lemi: " + (sayi1 - sayi2));
			break;
		case "3":
			System.out.println("�arpma i�lemi: " + (sayi1 * sayi2));
			break;
		case "4":
			System.out.println("b�lme i�lemi: " + ((double) sayi1 / sayi2));
			break;
			
		
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
