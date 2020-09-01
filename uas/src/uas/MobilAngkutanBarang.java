package uas;

import java.util.Scanner;

public class MobilAngkutanBarang extends Kendaraan {
	void kecepatan(){
		double jarak,hasil;
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan jarak Mobil Angkutan Barang= ");
		jarak = sc.nextInt();
		hasil=(jarak/60);
		System.out.print("Lama Perjalanan " + jarak + " / 60 = ");
		System.out.println(String.format("%.2f",hasil));
		System.out.println("Berat maksimum 1000kg");
		System.out.println("=====================");
	}
}
