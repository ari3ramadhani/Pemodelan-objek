package uasAcang;

public class MobilBarang extends Kendaraan {
    private final int maxSpeed = 60;
    private final int maxWeight = 1000;

    public double hitungWaktuSampai(double jarak) {
        return super.hitungWaktuSampai(maxSpeed, jarak);
    }
}