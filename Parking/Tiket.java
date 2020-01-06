import java.util.Scanner;
public class Tiket{
	public String name, kelas, rute, jml;
	public int tot, harga;
	
	public static void main(String[] args){
		Tiket tiket = new Tiket();
		tiket.bikin();	
	}
	
	public void bikin(){
		input();
		proses();
		output();
	}
	
	public void input(){
		Scanner scan = new Scanner(System.in);
		
			System.out.print("Nama Pemesan 	 : ");
			name = scan.nextLine();
			System.out.print("Rute bis [1/2/3] : ");
			rute = scan.nextLine();
			System.out.print("Kelas [AC/NA]    : ");
			kelas = scan.nextLine();
			System.out.print("Jumlah Kursi     : ");
			jml = scan.nextLine();
			System.out.println();
		
	}
	
	public void proses(){
		switch(rute){
			case "1":
				rute = "Jakarta - Bandung";
				harga = getHarga(90000, 130000);
				break;
			case "2":
				rute = "Bandung - Jakarta";
				harga = getHarga(70000, 150000);
				break;
			case "3":
				rute = "Jakarta - Tasikmalaya";
				harga = getHarga(50000, 70000);
				break;
			default:
				System.out.println("Rute tidak tersedia");
				harga = 0;
				break;
		}
		int j = Integer.parseInt(jml);
		tot = harga * j;
	}
	public int getHarga(int ac, int na){
		int res;
		if(kelas.equalsIgnoreCase("ac")){
			res = ac;
		}
		else{
			res = na;
		}
		return res;
	}
	
	public void output(){
		System.out.println("Terimakasih telah memesan tiket bis dengan rincian sebagai berikut");
		System.out.println("Nama         : "+name);
		System.out.println("Rute         : "+rute);
		System.out.println("Kelas        : "+kelas);
		System.out.println("Harga Satuan : "+harga);
		System.out.println("Jumlah Kursi : "+jml);
		System.out.println("Total Bayar  : "+tot);
		System.out.println("Silahkan membayar di Minimarket terdekat");
	}
}