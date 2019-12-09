public class GanjilGenap{
	public static void main(String[] args){
		int nilai = Integer.parseInt(args[0]);
		String cek = nilai%2 == 0 ? "Genap" : "Ganjil";
		System.out.println(cek);
	}
}