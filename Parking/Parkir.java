import java.util.Scanner;

public class Parkir{
	public int plate, type, in, out, lapar, tot, time;
	public int c1 = 5000;
	public int c2 = 3000;
	public int b1 = 3000;
	public int b2 = 1500;
	public String nameType;
	
	public static void main(String[] args){
		Parkir park = new Parkir();
		park.onCreate();
	}
	
	public void onCreate(){
		input();
		proses();
		output();
	}
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		try{
			System.out.print("Plat Nomer            : ");
			plate = scan.nextInt();
			System.out.print("Jenis Kendaraan [1/2] : ");
			type = scan.nextInt();
			System.out.print("Jam Masuk             : ");
			in = scan.nextInt();
			System.out.print("Jam Keluar            : ");
			out = scan.nextInt();
			System.out.println();
		}
		catch(Exception e){
			System.out.print("Data harus angka");
			System.out.print(e.getMessage());
		}
	}
	
	public void proses(){
		lapar = out - in;
		if(type == 1){
			nameType = "Mobil";
			tot = car(c1, c2);
		}
		else{
			nameType = "Motor";
			tot = bike(b1, b2);
		}
		if(in > out){
			time += 24;
		}
	}
	public int car(int c1, int c2){
		int res = c1;
		if(lapar > 1){
			res += (lapar - 1) * c2;
		}
		return res;
	}
	public int bike(int b1, int b2){
		int res = b1;
		if(lapar > 1){
			res += (lapar - 1) * b2;
		}
		return res;
	}
	
	public void output(){
		System.out.println("Terima kasih telah melakukan transaksi dengan rincian sebagai berikut");
		System.out.println("Plat Nomer      : "+plate);
		System.out.println("Jenis Kendaraan : "+type);
		System.out.println("Lama Parkir     : "+lapar);
		System.out.println("Total Bayar     : "+tot);
		System.out.println("Semoga pelayanan kami memuaskan");
	}
}