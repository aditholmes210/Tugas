import java.util.Scanner;

public class Test1{
	public static void print(Object obj){
			System.out.println(obj);
		}
	
	public static void geser(Object obj){
			System.out.print(obj);
		}
	
	public static void main(String[] args){
		boolean run = true;
		while(run == true){
			menu();
		}
	}
	
	public static void menu(){
		try{
			Scanner input = new Scanner(System.in);
			print("Pilih Menu :");
			print("======================");
			print("1. Luas segitiga");
			print("2. Volume balok");
			print("3. Prisma segitiga");
			print("4. Volume kerucut");
			print("5. Exit");
			geser("Masukkan pilihan : ");
			int pick = input.nextInt();
			switch(pick){
				case 1:
				geser("Masukkan nilai alas : "); double a = input.nextDouble();
				geser("Masukkan nilai tinggi : "); double t = input.nextDouble();
				print(LuasSegi3(a,t));
				break;
				case 2:
				geser("Masukkan nilai panjang : "); double p = input.nextDouble();
				geser("Masukkan nilai lebar : "); double l = input.nextDouble();
				geser("Masukkan nilai tinggi : "); double ta = input.nextDouble();
				print(VolBal(p,l,ta));
				break;
				case 3:
				geser("Masukkan nilai panjang : "); double pa = input.nextDouble();
				geser("Masukkan nilai lebar : "); double la = input.nextDouble();
				geser("Masukkan nilai tinggi : "); double tb = input.nextDouble();
				print(Prism(pa,la,tb));
				break;
				case 4:
				geser("Masukkan nilai jari-jari : "); double r = input.nextDouble();
				geser("Masukkan nilai tinggi : "); double tc = input.nextDouble();
				print(VolKer(r,tc));
				break;
				default:
				System.exit(0);
				break;
			}
		}
		catch(Exception e){
			print("Inputan anda salah");
		}
	}
	
	public static double LuasSegi3(double a, double t){
		double luas = (a * t) / 2;
		return luas;
	}
	public static double VolBal(double p, double l, double ta){
		double vol = p * l * ta;
		return vol;
	}
	public static double Prism(double pa, double la, double tb){
		double vol = (pa * la * tb) / 2;
		return vol;
	}
	public static double VolKer(double r, double tc){
		final double pi = 3.14;
		double vol = (pi * r * r * tc)/ 3;
		return vol;
	}

}