package praktekJava2;
import java.util.Scanner;
public class gangen {
public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	int batas, menu,i;
	System.out.println("1 Bilangan ganjil");
	System.out.println("2 Bilangan genap");
	System.out.print("Pilihan Anda : ");
	menu = sc.nextInt();
	switch (menu)  {
	default : System.out.print("Inputan salah");
	break;
	case 1 :
		sc = new Scanner(System.in);
		System.out.print("masukan batas: ");
		batas = sc.nextInt();
	for (i=1; i<=batas; i++)
		if(i%2!=0){
			System.out.print(i+" ");
	}		break;
		case 2 :
			sc = new Scanner(System.in);
			System.out.print("masukan batas: ");
			batas = sc.nextInt();
		for (i=1; i<=batas; i++){
			if(i%2==0)
				System.out.print(i+" ");
			}  break; }  }   }
