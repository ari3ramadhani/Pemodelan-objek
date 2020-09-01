package praktekJava5Uts;
import java.util.Scanner;

public class Utama {
	public static void main (String[] args){
		double berat,tinggi ;
		Sub luas = new Sub();	
//luas = variabel
// new TugasSub = Object
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan berat = ");
		berat = sc.nextInt();
		System.out.print("Masukan tinggi = ");
		tinggi = sc.nextInt();
		luas.lingkaran( berat,tinggi);
	}
}
