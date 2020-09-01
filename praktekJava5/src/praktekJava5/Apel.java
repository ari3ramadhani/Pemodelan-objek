package praktekJava5;

public class Apel {
	//constructor
	public Apel(String jenis){//Constructor otomatis terpanggil
		System.out.println("Halo saya apel "+ jenis);
	}
	//method cetak tanpa parameter
	public void cetak(){
		System.out.println("Cetak dari buah apel");
	}
	//method cetak dengan 1 parameter
	public void cetak(String warna){
		System.out.println("Apel "+warna+" enak rasanya");
	}
	public void cetak(int jumlah){
		System.out.println("Saya membeli "+jumlah+" apel");
	}
//public int cetak (int jumlah, int nilai){
//	return 0;
//
//}
}
