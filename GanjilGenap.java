public class GanjilGenap{
	public static void main(String[] args){
		int bil = Integer.parseInt(args[0]);
		String hsl = bil%2 == 0 ? "Genap" : "Ganjil";
		System.out.println(hsl);
	}
}