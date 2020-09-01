package uas;

import java.util.Scanner;

public class Motor extends Kendaraan {
	void kecepatan(){
		double jarak,hasil;
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan jarak tempuh motor = ");
		jarak = sc.nextInt();
		hasil=(jarak/80);
		System.out.print("Lama Perjalanan " + jarak + " / 80 = ");
		System.out.println(String.format("%.2f",hasil));
		System.out.println("Berat maksimum 50kg");
		System.out.println("=====================");
		
	}
}
