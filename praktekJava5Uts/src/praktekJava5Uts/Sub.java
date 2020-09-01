package praktekJava5Uts;

public class Sub {
	static void lingkaran(double berat, double tinggi){
		double golongan=tinggi/(berat+berat);
		System.out.println(String.format("%.2f",golongan));
		if  (golongan<1.5)
			System.out.print("gemuk");
		else if((golongan<=1.5) && (golongan<1.8))
			System.out.print("ideal");
		else if((golongan<=1.8) && (golongan<2.5))
			System.out.print("kurus");
		else if(golongan>=2.5) 
			System.out.print("kurus parah");
		
	}
}
