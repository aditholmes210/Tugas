public class App{
	public static void main(String[] args){
		Application app = new Application();
		//app.appName = "Contoh Encapsulasi";
		app.setAppName("Contoh Encapsulasi");
		System.out.println(app.getAppName);
		
		Musisi steve = new Musisi();
		steve.setNama("Steve");
		steve.menyanyi();
		
		Pianis adit = new Pianis();
		adit.beriNamaPianis("Adit");
		adit.menyanyi();
	}
}

class Musisi{
	protected String nama;
	
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return this.nama;
	}
	protected void menyanyi(){ //void menyanyi diset protected
	//protected klo mau di edit di subclassnya lagi
		System.out.println(this.nama+ "Menyanyi");
	}
	public void manggung(){
		this.menyanyi;
	}
}

class Pianis extends Musisi{
	public void beriNamaPianis(String nm){
		this.nama = nm;
	}
}

class Application{
	private String appName; //App name di set ke private
	//Setter --> hanya utk private
	public void setAppName(String nama){
		this.appName = nama;
	}
	//Getter -- hanya utk private
	public String getAppName(){
		return this.appName;
	}
}