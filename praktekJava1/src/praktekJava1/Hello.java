package praktekJava1;

public class Hello {

		public static void main(String []args){
			String teks;
			teks = " Hari ini hari selasa";
			String hari="selasa",tanggal="25";
			String jam,menit,detik;
			jam = "14";
			menit="32";
			detik = "3";
			
			
			System.out.println("Ayo Belajar Java");
			System.out.println("\n");
			System.out.println(7*6);
			System.out.println("\tObject Oriented Programming");
				System.out.print(jam);
				System.out.print(":");
				System.out.println(menit);
			System.out.print("date " +hari+tanggal+ " WIB");
			System.out.println("\ndate "+hari+" "+tanggal+" "+" WIB");
				int angka_1 = 40;
				int angka_2 = 70;
				System.out.println(angka_1+angka_2);
				System.out.print(angka_1+" "+angka_2);
			double a_1 = 40;
			double a_2 = 70;
			double hasil = a_1/a_2;
			System.out.println(hasil);
			System.out.printf("%.2f \n",hasil);

			int nilai_a= 5;
			int nilai_b= 10;
			double nilai_c= 2.5;
			double nilai_d= nilai_a+nilai_b-nilai_c;
			System.out.println(nilai_d);
			System.out.print(nilai_a+"+("+nilai_b+"-"+nilai_c+")="+nilai_d);
			
	
			
	
			

		}
}
