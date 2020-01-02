package app.transaction;
import app.data.Buku;
import app.data.Member;
import java.util.HashMap;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Peminjaman{
	private String kodeTransaksi;
	private HashMap<String, Buku> books = new HashMap<String, Buku>(); //list buku yg dipinjam di satu transaksi
	private Member member;
	private Date dateTime;
	
	public Peminjaman(Member member){ //butuh data member utk kejelasan transaksi
		this.member = member;
		Date today = new Date();
		this.dateTime = today;
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		//this.dateTime = formatter.format(today); //02-01-2020 14:49:20
	}
	
	public String getKodeTransaksi(){
		return kodeTransaksi;
	}
	public void setKodeTransaksi(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String date = formatter.format(this.dateTime);
		this.kodeTransaksi = this.member.getID()+date;
	}
	//get smua data buku dlm 1 transaksi
	public HashMap<String, Buku> getBooks(){
		return books;
	}
	//tambahkan 1 buku yg mau dipinjam (dijalankan ketika meminjam buku)
	public void addBook(String ISBN, Buku buku){
		this.books.put(ISBN, buku);
		System.out.println("Buku " +books.get(ISBN).getJudul()+" berhasil ditambahkan ke transaksi");
	}
	//get satu buku yg dipinjam berdasarkan isbn
	public Buku getBooks(String ISBN){
		return this.books.get(ISBN);
	}
}