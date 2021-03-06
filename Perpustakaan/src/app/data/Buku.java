package app.data;

public class Buku{
	private String judul, ISBN, penulis, penerbit;
	private int jmlHal, thnTerbit, stock;
	
	public Buku(String judul, String ISBN, String penulis, String penerbit, int jmlHal, int tahun, int stock){
		this.judul = judul;
		this.ISBN = ISBN;
		this.penulis = penulis;
		this.penerbit = penerbit;
		this.jmlHal = jmlHal;
		this.thnTerbit = tahun;
		this.stock = stock;
	}
	
	public String getJudul(){
		return judul;
	}
	public void setJudul(String judul){
		this.judul = judul;
	}
	
	public String getISBN(){
		return this.ISBN;
	}
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public String getPenulis(){
		return penulis;
	}
	public void setPenulis(String penulis){
		this.penulis = penulis;
	}
	
	public String getPenerbit(){
		return penerbit;
	}
	public void setPenerbit(String penerbit){
		this.penerbit = penerbit;
	}
	
	public int getJmlHal(){
		return jmlHal;
	}
	public void setJmlHal(int jmlHal){
		this.jmlHal = jmlHal;
	}
	
	public int getThnTerbit(){
		return thnTerbit;
	}
	public void setThnTerbit(int tahun){
		this.thnTerbit = tahun;
	}
	
	public int getStock(){
		return stock;
	}
	public void setStock(int stock){
		this.stock = stock;
	}
	
	public void dipinjam(){
		this.stock--;
	}
}