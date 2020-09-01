package praktekJava2;

import java.util.Scanner;

public class Pilihan {
	public static void main(String []args){
		int a = 5;
		boolean hadir = false;
		//if (hadir)
			//if (!hadir)
			//if (hadir = true)

		if(a < 5){
			System.out.print("Nilai a lebih besar dari a");
			}else if(a>5){
			System.out.print("Nilai a lebih kecil dari a");
		}else{
			System.out.print("Hasilnya salah");
		}

		System.out.print("\nKetik Sebuah angka: ");
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		if(b > 5){
			System.out.print(b+" lebih besar dari "+a);
			}else if(b<5){
			System.out.print(b+" lebih kecil dari "+a);
		}else{
			System.out.print("Hasilnya salah");
		}		
	}
	
	
	/*==sama dengan
	 * != tidak sama dengan
	 * <= lebih kecil sama dengan
	 * >= lebih besar sama dengan
	 * < lebih kecil
	 * > lebih besar
	 * && dan
	 * || or
	 */
	
	
}
