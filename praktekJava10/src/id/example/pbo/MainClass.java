package id.example.pbo;

public class MainClass {
	public static void main(String[] args){
		SubClass s = new SubClass();
		s.setNamaHewan("kucing");
		System.out.println("Ini adalah " + s.getNamaHewan());
	}
}
