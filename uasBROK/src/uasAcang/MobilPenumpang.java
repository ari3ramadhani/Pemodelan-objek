package uasAcang;


public class MobilPenumpang extends Kendaraan {
    private final int maxSpeed = 100;
    private final int maxWeight = 200;

    public double hitungWaktuSampai(double jarak) {
        return super.hitungWaktuSampai(maxSpeed, jarak);
    }
}