package praktekJava9tes;

import java.util.Scanner;
public class Guru extends Civitas_Akademika{
//	public static void main (String[]args){
//		double uas = 60;
//		double uts = 50;
//		double hasil;
//		hasil=(uts+uas)/2;
//		System.out.println(String.format("%.2f",hasil));
//		if  (hasil>50)
//			System.out.print("lulus");
//	
//}
	void hitung(){
		double uas,uts,hasil;
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan uts = ");
		uts = sc.nextInt();
		System.out.print("Masukan uas = ");
		uas = sc.nextInt();
		hasil=(uts+uas)/2;
		System.out.println(String.format("%.2f",hasil));
		if  (hasil>50)
			System.out.print("lulus");
	}
	}
