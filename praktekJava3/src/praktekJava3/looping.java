package praktekJava3;

public class looping {
	public static void main (String []args ){
	int a = 0 ;	
	while (a<=4){// langsung di cek dulu kalo false langsung di lewatin 
System.out.println("ini while "+a++);
a++;
} 
	int b = 1;
	do{ // diproses dulu minimal sekali baru di cek 
		System.out.println("looping do while "+b++);
		b++;
	}while(b<=5);
	
	for (int c=1; c <=5; c++){
		System.out.println("looping for "+ c++);
		}
	}
}
