package uasAcang;

public class Motor extends Kendaraan {
    private final int maxSpeed = 80;
    private final int maxWeight = 50;

    public double hitungWaktuSampai(double jarak) {
        return super.hitungWaktuSampai(maxSpeed, jarak);
    }
}