package praktekJava6;

public class Gitar extends AlatMusikPetik{//AlatMusikPetik bisa juga AlatMusik

	public static void main(String []args){
	
	Gitar gitarAkustik = new Gitar();
	
	//dibawah untuk AlatMusikPetik
gitarAkustik.namaAlatMusik(gitarAkustik.namaAlatMusikPetik);
	

	//dibawah untuk class AlatMusik
	gitarAkustik.namaAlatMusik("Gitar Akustik");
	gitarAkustik.caraMain= "Dipetik";//mengisi variabel yg ada di parent
	gitarAkustik.caraBermain();
	}
}
// kalo datanya sama ada induknya pkai inheritense
//kalo prosesnya ga selalu digunakan pakai Main utama dan sub main
