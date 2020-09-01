package praktekJava4;
import java.util.Scanner;
public class TugasUtama {
	public static void main (String[] args){
double rl,rk,s ;
		TugasSub luas = new TugasSub();	
//luas = variabel
// new TugasSub = Object
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan  jari2 lingkaran: ");
		rl = sc.nextInt();
		luas.lingkaran( 0,rl);
		System.out.println ("-------------------");
		System.out.print("Masukan jari2 kerucut : ");
		rk = sc.nextInt();
		System.out.print("Masukan tinggi  kerucut : ");
		s = sc.nextInt();
		
		System.out.println(luas.ker(0,rk,s));
	
	}
}
