package uasAcang;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("1. Motor");
        System.out.println("2. Mobil penumpang");
        System.out.println("3. Mobil angkutan barang");
        System.out.print("Pilihan Anda: ");
        int p = new Scanner(System.in).nextInt();

        switch (p) {
            case 1:
                Motor motor = new Motor();
                motor.setNoKendaraan("B 1234 SG");
                motor.setWarnaKendaraan("Hitam");

                System.out.print("Jarak tempuh: ");
                double jarakMotor = new Scanner(System.in).nextDouble();

                System.out.println("Nomor kendaraan Anda " + motor.getNoKendaraan());
                System.out.println("Warna kendaraan Anda " + motor.getWarnaKendaraan());
                System.out.println("Perkiraan lama perjalanan: " + motor.hitungWaktuSampai(jarakMotor) + " jam");
                break;
            case 2:
                MobilPenumpang mobil = new MobilPenumpang();
                mobil.setNoKendaraan("B 15 A");
                mobil.setWarnaKendaraan("Ungu");

                System.out.print("Jarak tempuh: ");
                double jarakMobil = new Scanner(System.in).nextDouble();

                System.out.println("Nomor kendaraan Anda " + mobil.getNoKendaraan());
                System.out.println("Warna kendaraan Anda " + mobil.getWarnaKendaraan());
                System.out.println("Perkiraan lama perjalanan: " + mobil.hitungWaktuSampai(jarakMobil) + " jam");
                break;
            case 3:
                MobilBarang mobilB = new MobilBarang();
                mobilB.setNoKendaraan("B 46 US");
                mobilB.setWarnaKendaraan("Hijau");

                System.out.print("Jarak tempuh: ");
                double jarakMobilB = new Scanner(System.in).nextDouble();

                System.out.println("Nomor kendaraan Anda " + mobilB.getNoKendaraan());
                System.out.println("Warna kendaraan Anda " + mobilB.getWarnaKendaraan());
                System.out.println("Perkiraan lama perjalanan: " + mobilB.hitungWaktuSampai(jarakMobilB) + " jam");
                break;
            default:
                System.out.println("Salah pilih!");
        }
    }
}