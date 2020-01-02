package app;
import app.data.Buku;
import app.transaction.Peminjaman;
import app.data.Member;
import java.util.Scanner;
//import hashmap
import java.util.HashMap;
public class Program{
	private static HashMap<String, Member> fellow = new HashMap<String, Member>();
	public static void main(String[] args){
		member();
		buku();
	}
		
		private static void member(){
			Member member1 = new Member("G021", "Adit", "Male", "BSD");
			Member member2 = new Member("G022", "Benny", "Male", "Jatim");
			
			
			fellow.put(member1.getID(), member1);
			fellow.put(member2.getID(), member2);
			
			/*for (String key : fellow.keySet()){
				String ID = fellow.get(key).getID();
				String Name = fellow.get(key).getName();
				String Gender = fellow.get(key).getGender();
				String Address = fellow.get(key).getAddress();
				
				System.out.println("ID Member : "+ID);
				System.out.println("Nama      : "+Name);
				System.out.println("Gender    : "+Gender);
				System.out.println("Alamat    : "+Address);
			}*/
		}
		
		private static void buku(){
			Buku buku1 = new Buku("Sherlock Holmes - The Hound of Baskerville", "978-3-16-1648410-0", "Sir Arthur Conan Doyle", "Gramedia", 375, 2004, 10);
			Buku buku2 = new Buku("Sherlock Holmes - The Sign of Four", "978-3-16-1648430-0", "Sir Arthur Conan Doyle", "Gramedia", 425, 2005, 5);
			/*HashMap<String, String> people = new HashMap<String, String>();
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
				int thnTerbit = bookcase.get(key).getThnTerbit();
				int stock = bookcase.get(key).getStock();
				//print variable
				System.out.println("Judul Buku       : "+judul);
				System.out.println("No. ISBN         : "+ISBN);
				System.out.println("Nama Penulis     : "+penulis);
				System.out.println("Nama Penerbit    : "+penerbit);
				System.out.println("Jumlah Halaman   : "+jmlHal);
				System.out.println("Tahun Terbit     : "+thnTerbit);
				System.out.println("Jumlah Stock     : "+stock);
				System.out.println();
			}
			Scanner input = new Scanner(System.in);
			//input isbn
			System.out.println("Masukkan data buku yang mau dipinjam : ");
			String ISBN = input.nextLine();
			//cek buku dengan isbn tersebut ada atau tidak
			Peminjaman transaction = new Peminjaman(fellow.get("G021"));
			transaction.setKodeTransaksi();
			System.out.println(transaction.getKodeTransaksi());
			if(bookcase.containsKey(ISBN)){
				//transaksi buku dipinjam
				//jika buku ditemukan kurangi stock buku
				System.out.println("Buku ada");
				Buku books = bookcase.get(ISBN);
				books.dipinjam(); //utk mengurangi stock
				
				/*String judul = bookcase.get(ISBN).getJudul();
				String ISBND = bookcase.get(ISBN).getISBN();
				String penulis = bookcase.get(ISBN).getPenulis();
				String penerbit = bookcase.get(ISBN).getPenerbit();
				int jmlHal = bookcase.get(ISBN).getJmlHal();
				int thnTerbit = bookcase.get(ISBN).getThnTerbit();
				int stock = bookcase.get(ISBN).getStock();
				System.out.println("Judul Buku       : "+judul);
				System.out.println("No. ISBN         : "+ISBND);
				System.out.println("Nama Penulis     : "+penulis);
				System.out.println("Nama Penerbit    : "+penerbit);
				System.out.println("Jumlah Halaman   : "+jmlHal);
				System.out.println("Tahun Terbit     : "+thnTerbit);
				System.out.println("Jumlah Stock     : "+stock);
				System.out.println();*/
				//masukkan buku ke list buku yg ada di transaksi
				transaction.addBook(ISBN, books);
			}
			else{
				//jika buku tidak ditemukan tampilkan pesan
				System.out.println("Buku tidak ada");
			}
		}

}