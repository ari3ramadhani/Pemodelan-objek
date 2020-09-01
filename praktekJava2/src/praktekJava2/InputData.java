package praktekJava2;

import java.util.Scanner;

public class InputData {
	public static void main (String []args){
		//deklarasi objek scanner baru
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("Masukkan tahun : ");
		int tahun = input1.nextInt();
		
		System.out.print("Sekarang Tahun : ");
		System.out.println(tahun);

			input1 = new Scanner(System.in);
				System.out.print("Siapa kamu ?  ");
				String nama = input1.nextLine();
				System.out.print("Hallo  " + nama +"!");
				
				
	}
}
