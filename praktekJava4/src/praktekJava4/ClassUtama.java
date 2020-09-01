package praktekJava4;

public class ClassUtama {

//	public static void main(String []args){
//		System.out.println("Teks dicetak dari void main");
//		cetak("Heloo",0);
//		cetak("Sekarang hari selasa",5);
//		
//	int angka ;
//	angka = hitung (5,7);
//			System.out.println(angka);
//			System.out.println (hitung (2,5));
//			System.out.println (hitung (8,5));
//			
//			cetakData();
		
		//beda sama yang atas
	public static void main(String []args){
		ClassSub asset = new ClassSub();
		
	//	asset.cetak("Cetak dari Kelas utama",1);
		System.out.println(asset.hitung(5,2));
	}
}//jika void ga perlu returnnya