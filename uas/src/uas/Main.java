package uas;
import java.util.Scanner;
public class Main {
	public static void main (String []args){
		while (true) {
		System.out.println("Pilih Kendaraan");
	    System.out.println("+--------------------------------------------------+");
        System.out.println("|NO | 	Kendaraan     | Keceptan  | Berat Maksumum |");
        System.out.println("|1  |    Motor        | 80km/jam  |      50kg      |"); 
        System.out.println("|2  | Mobil Penumpang | 100km/jam |     200kg      |");
        System.out.println("|3  | Mobil Angkutan  | 60km/jam  |     1000kg     |");
        System.out.println("+--------------------------------------------------+");
          System.out.println("Masukkan angka lainnya untuk keluar");
        System.out.print("Pilih nomor: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
        case 1:
    		Motor Kendaraan = new Motor();
    		Kendaraan.warna(); Kendaraan.nk();
    		Kendaraan.kecepatan(); break;
        case 2:
    		MobilPenumpang Kendaraan1 = new MobilPenumpang();
    		Kendaraan1.warna(); Kendaraan1.nk();
    		Kendaraan1.kecepatan(); break;
        case 3:
    	MobilAngkutanBarang Kendaraan2 = new MobilAngkutanBarang();
    	Kendaraan2.warna();Kendaraan2.nk();
    	Kendaraan2.kecepatan(); break;
        default:		System.out.println("=salah input=");
            System.exit(0); } } } } 