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
			print("1. Hitung luas segitiga");
			print("2. Hitung volume balok");
			print("3. Hitung prisma segitiga");
			print("4. Hitung volume kerucut");
			print("5. Exit");
			geser("Masukkan pilihan : ");
			int pick = input.nextInt();
			switch(pick){
				case 1:
				geser("Masukkan nilai a : "); double a = input.nextDouble();
				geser("Masukkan nilai t : "); double t = input.nextDouble();
				print(LuasSegi3(a,t));
				break;
				case 2:
				geser("Masukkan nilai p : "); double p = input.nextDouble();
				geser("Masukkan nilai l : "); double l = input.nextDouble();
				geser("Masukkan nilai t : "); double ta = input.nextDouble();
				print(VolBal(p,l,ta));
				break;
				case 3:
				geser("Masukkan nilai p : "); double pa = input.nextDouble();
				geser("Masukkan nilai l : "); double la = input.nextDouble();
				geser("Masukkan nilai t : "); double tb = input.nextDouble();
				print(Prism(pa,la,tb));
				break;
				case 4:
				geser("Masukkan nilai r : "); double r = input.nextDouble();
				geser("Masukkan nilai t : "); double tc = input.nextDouble();
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