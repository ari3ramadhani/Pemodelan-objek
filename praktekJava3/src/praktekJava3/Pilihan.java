package praktekJava3;

public class Pilihan {

	public static void main (String[]args){
		int a= 1;
		char b = 'f';
		String c = "senin";
		
		switch(a) {//c
		case 1:
			System.out.print("ini case a");
		break;
		case 'f':
			System.out.print("ini case b");
		break;
		
//ganti switchnya
		case 'v' : // "senin"
			System.out.print("ini senin");
		break;
		default :
			System.out.print("Salah ya ");
		}
	}
}
