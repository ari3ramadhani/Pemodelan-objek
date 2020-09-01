package praktekJava5Uts;
import java.util.Scanner;
public class sendiri {
	public static void main (String[]args){
		double tinggi,berat,golongan;
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukan berat = ");
		berat = sc.nextInt();
		System.out.print("Masukan tinggi = ");
		tinggi = sc.nextInt();
		golongan=tinggi/(berat+berat);
		System.out.println(String.format("%.2f",golongan));
		if  (golongan<1.5)
			System.out.print("gemuk");
		else if((golongan<=1.5) && (golongan<1.8))
			System.out.print("ideal");
		else if((golongan<=1.8) && (golongan<2.5))
			System.out.print("kurus");
		else if(golongan>=2.5) 
			System.out.print("kurus parah");
		
		
	}
}

