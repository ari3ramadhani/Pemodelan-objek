package praktekJava9tesacang;

public class Guru extends CivitasAkademika {
	 private double nilaiAbsen, nilaiTugas, nilaiUts, nilaiUas;

	    public void inputNilai(double nilaiAbsen, double nilaiTugas, double nilaiUts, double nilaiUas) {
	        this.nilaiAbsen = nilaiAbsen;
	        this.nilaiTugas = nilaiTugas;
	        this.nilaiUts = nilaiUts;
	        this.nilaiUas = nilaiUas;
	    }

	    public double hitungNilai() {
	        return (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
	    }
}
