package praktekJava9tesacang;

public class Murid extends CivitasAkademika{
	  // Siapkan reference di parameter untuk ambil nilai
    public double getNilai(Guru guru) {
        return guru.hitungNilai();
    }
}
