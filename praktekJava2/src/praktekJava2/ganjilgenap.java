package praktekJava2;

import java.util.Scanner;
public class ganjilgenap {
 public static void main (String[]args){
	 Scanner input = new Scanner (System.in);
		 System.out.print("Masukan nilai 1 : ");
		 int atu = input.nextInt();
	 System.out.print("Masukan nilai 2 : ");
	 int dua = input.nextInt();
		 int hasil = atu+dua;
		 System.out.println(atu+" + "+dua +" = "+ hasil);
	 if(hasil%2==0)
		 System.out.print("Hasil penjumlahan genap");
	     else
	     System.out.print("Hasil penjumlahan ganjil");
	 
 }
}
