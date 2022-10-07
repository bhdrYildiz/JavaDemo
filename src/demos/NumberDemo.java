package demos;

import java.util.Scanner;

public class NumberDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sayi1,sayi2;
		
		System.out.println("ilk sayiyi giriniz");
		sayi1 = input.nextInt();
		
		System.out.println("ikinci sayiyi giriniz");
		sayi2 = input.nextInt();
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i = 1; i<sayi1; i++) {
			if(sayi1 % i == 0) {
				toplam1 =  toplam1 + i;
			}
		}
		for(int i = 1; i<sayi2; i++) {
			if(sayi2 % i == 0) {
				toplam2 =  toplam2 + i;
			}
		}
		
		if(sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("iki sayý arkadaþtýr");
		}else {
			System.out.println("iki sayý arkdaþ deðildir");
		}
		
		
 		
		
		
	}
}
