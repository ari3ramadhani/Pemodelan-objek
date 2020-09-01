package praktekJava4;
import java.util.Scanner;
public class latihan {
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		int batas ,i,nil,a[];
		float rata=0, jumlah=0;
		sc = new Scanner(System.in);
		System.out.print("masukan inputan: ");
		batas = sc.nextInt();
		a = new int[batas];
		for (i=0; i< batas; i++){
			System.out.print(" masukan umur "+ (i+1) + ": ");
			nil = sc.nextInt();
			a[i]=nil;
			jumlah+=nil;
			rata = jumlah / batas; 	
		}
		for (i=0; i< batas; i++){
			System.out.println(" data ke "+ (i+1) + ": "+a[i]);
		}		
		System.out.println("jumlah = " + jumlah);
		System.out.println("rata-rata = " + rata);
		if (rata<20)
			System.out.println("remaja");
		else if (rata<35)
			System.out.println("pas");
		else if (rata<50)
			System.out.println("agaktua");
		else if (rata>=50)
			System.out.println("sangat tua");
}
}