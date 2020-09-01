package uas;

import java.util.Scanner;

public class MobilPenumpang extends Kendaraan{
	void kecepatan(){
		double jarak,hasil;
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan jarak Mobil Penumpang = ");
		jarak = sc.nextInt();
		hasil=(jarak/100);
		System.out.print("Lama Perjalanan " + jarak + " / 100 = ");
		System.out.println(String.format("%.2f",hasil));
		System.out.println("Berat maksimum 200kg");
		System.out.println("=====================");
	}
}
