package pkg1;

import pkg2.MainTwo;

public class MainOne {
public static void main(String[] args){
	MainTwo pkg2 = new MainTwo();
	pkg2.namaHewan = "tapir";
		System.out.println("Ini adalah " + pkg2.namaHewan);
}
}
