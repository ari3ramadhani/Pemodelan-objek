package praktekJava9tesacang;
import java.util.Scanner	;
public class MainClass {
	  public static void main(String[] args) {
	        // Inisialisasi objek
	        Guru g1 = new Guru();
	        Murid m1 = new Murid();

	        Scanner s = new Scanner(System.in);

	        // Temporary untuk tampung input
	        double nAbsen, nTugas, nUts, nUas;

	        // Input nama guru
	        System.out.print("Nama guru: ");
	        g1.setNama(s.nextLine());

	        // Input nilai
	        // Sebelum input object s dibuat baru
	        s = new Scanner(System.in);
	        System.out.print("Nilai absen murid: ");
	        nAbsen = s.nextDouble();
	        s = new Scanner(System.in);
	        System.out.print("Nilai tugas murid: ");
	        nTugas = s.nextDouble();
	        s = new Scanner(System.in);
	        System.out.print("Nilai UTS murid: ");
	        nUts = s.nextDouble();
	        s = new Scanner(System.in);
	        System.out.print("Nilai UAS murid: ");
	        nUas = s.nextDouble();
	        s.close();
	        g1.inputNilai(nAbsen, nTugas, nUts, nUas);

	        System.out.println();

	        // Cetak nama guru
	        System.out.println("Nama guru: " + g1.getNama());

	        System.out.println();

	        // Cetak nama dan nilai murid
	        m1.setNama("Murid A");
	        System.out.println("Nilai Murid: " + m1.getNilai(g1));
	    }
	}
