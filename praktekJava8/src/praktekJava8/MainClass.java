package praktekJava8;

public class MainClass {
	public static void main(String[]args){
		Mobil angkot = new Mobil();
		Motor ojek = new Motor();
		Pesawat anjasAir = new Pesawat();
		Kapal kapalApi = new Kapal();
		
		angkot.jalan();
		ojek.jalan();
		anjasAir.jalan();
		kapalApi.jalan();
		
		angkot.jumlahRoda();
		ojek.kecepatan();
		anjasAir.jumlahRoda();
		kapalApi.jumlahRoda();
		
	}
}
