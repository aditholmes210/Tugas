public class Inheritance{
	public static void main(String[] args){
		Musisi satria = new Musisi();
		satria.addName("Satria");
		satria.stage();
		satria.readNote();
		System.out.println();
		
		Boyband westlife = new Boyband();
		westlife.addname("Westlife");
		westlife.readNote();
		westlife.playGuitar();
		westlife.sing("Viva La Vida");
		westlife.stage();
		System.out.println();
	}
}

class Musisi{
	String name;
	//getter
	String getName(){
		return this.name;
	}
	//setter
	void addName(String name){
		this.name = name;
	}
	void sing(String word){
		System.out.println(word);
	}
	void sang(){
		System.out.println(this.name+"Sang acapella");
	}
	void readNote(){
		System.out.println(this.name+"can read note");
	}
	void stage(){
		this.sang();
	}
}

class Boyband extends Musisi{
	void playGuitar(){
		System.out.println(this.getName()+"can play guitar");
	}
	@Override
	void sing(String word){
		this.sang();
		System.out.println(word);
	}
	@Override
	void stage(){
		super.stage();
		this.playGuitar();
	}
}