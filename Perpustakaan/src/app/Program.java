package app;
import app.data.Buku;
//import hashmap
import java.util.HashMap;
public class Program{
	public static void main(String[] args){
		Buku buku1 = new Buku("Sherlock Holmes - The Hound of Baskerville", "978-3-16-1648410-0", "Sir Arthur Conan Doyle", "Gramedia", 375);
		Buku buku2 = new Buku("Sherlock Holmes - The Sign of Four", "978-3-16-1648430-0", "Sir Arthur Conan Doyle", "Gramedia", 425);
		/*buku1.setJudul("Hound of Baskerville");
		System.out.println(buku1.getJudul());
		HashMap<String, String> people = new HashMap<String, String>();
		people.put("P001","Roby");
		people.put("P002","Steve");
		System.out.println(people.get("P002"));*/
		
		HashMap<String, Buku> bookcase = new HashMap<String, Buku>();
		/*bookcase.put("978-3-16-1648410-0", new Buku("Harry Potter and the Deadly Hollow", "978-3-16-1648410-0", "J.K Rowling", "Gramedia", 423));
		bookcase.put("978-3-16-1648411-0", new Buku("Harry Potter and the Prisoner of Azkaban", "978-3-16-1648411-0ss", "J.K Rowling", "Gramedia", 430));
		Buku buku1 = bookcase.get("978-3-16-1648410-0");*/
		bookcase.put(buku1.getISBN(), buku1);
		bookcase.put(buku2.getISBN(), buku2);
		//System.out.println(bookcase.get("978-3-16-1648410-0").getISBN());
		
		for (String key : bookcase.keySet()){
			//get data buku satu per satu dari bookcase berdasarkan key
			String judul = bookcase.get(key).getJudul();
			String ISBN = bookcase.get(key).getISBN();
			String penulis = bookcase.get(key).getPenulis();
			String penerbit = bookcase.get(key).getPenerbit();
			int jmlHal = bookcase.get(key).getJmlHal();
			//print variable
			System.out.println("Judul Buku       : "+judul);
			System.out.println("No. ISBN         : "+ISBN);
			System.out.println("Nama Penulis     : "+penulis);
			System.out.println("Nama Penerbit    : "+penerbit);
			System.out.println("Jumlah Halaman   : "+jmlHal);
			System.out.println();
		}
	}
}