package uasAcang;

public class Kendaraan {
    private String noKendaraan;
    private String warnaKendaraan;

    public String getNoKendaraan() {
        return noKendaraan;
    }

    public void setNoKendaraan(String noKendaraan) {
        this.noKendaraan = noKendaraan;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    double hitungWaktuSampai(double maxSpeed, double jarak) {
        return jarak / maxSpeed;
    }
}