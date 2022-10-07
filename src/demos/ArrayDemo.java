package demos;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] sayilar = new int[]{1,2,3,4,5,6,8,9,10};
		int p2 = 88;
		boolean varMi = sayiBul(sayilar, p2);
		mesajVer(varMi, p2);
	}
	
	public static void mesajVer(boolean kontrol,int sayi) {
		String mesaj = "";
		if(kontrol == true) {
			mesaj = sayi + " bu dizide bulunuyor";
			System.out.println(mesaj);
		}else {
			mesaj = sayi + " bu dizide bulunmuyor";
			System.out.println(mesaj);
		}
	}
	public static boolean sayiBul(int[] p1,int p2) {
		boolean varMi= false;
		
		for(int sayi : p1) {
			if(sayi == p2) {
				varMi = true;
				break;
			}
		}
		return varMi;
	}
}
