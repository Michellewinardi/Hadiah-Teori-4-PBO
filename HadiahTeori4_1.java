// Michelle Winardi- 51019016

import java.util.Scanner;

class rumuslv {
  final double pi = 3.14;
  double luas;
  int volume;
  
  void luasling (int r){
  	luas = (pi*r*r);
   System.out.println("Luas lingkaran Anda :" + luas);
  }
  
  
  void volumkub (int s){
  	volume = (s*s*s);
   System.out.println("volume kubus Anda :" + volume);
  }
  
}


public class HadiahTeori4_1 {
	
	public static void main (String args[]){
		
		Scanner input = new Scanner(System.in);
		int jarilingkaran, sisikubus;
		 
		rumuslv luaslingkaran = new rumuslv();
		rumuslv volumekubus = new rumuslv();	
		
		System.out.println("Aplikasi class dan object untuk mencari luas lingkaran, dan volume kubus");
		System.out.println();
		
		System.out.print("Masukkan nilai jari-jari lingkaran : ");
			jarilingkaran = input.nextInt();
			luaslingkaran.luasling(jarilingkaran);	
			
		System.out.println();
		System.out.print("Masukkan nilai sisi kubus  : ");
			sisikubus = input.nextInt();
			volumekubus.volumkub(sisikubus);	
	}
		
}