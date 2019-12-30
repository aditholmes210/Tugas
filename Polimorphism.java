public class Polimorphism{
	public static void print(Object obj){
		System.out.println(obj);
	}

	/*public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myPig = new Pig();
    Animal myDog = new Dog();
        
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }*/


/*class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}*/
	
	public static void main(String[] args){
		/*Segi3Persegi sp = new Segi3Persegi();
		print("Luas Segitiga : "+sp.luas(4, 12));
		print("Luas Persegi  : "+sp.luas(4, 10));*/
		
		Matematika obj1 = new Matematika();
		obj1.perkalian(2, 3);
		obj1.perkalian(5.3, 6.3);
		obj1.perkalian(5, 3, 9);
	}
}

class Matematika{
	public void perkalian(int num1, int num2){
		int result = num1 * num2;
		Polimorphism.print(result);
	}
	
	public void perkalian(double num1, double num2){
		double result = num1 * num2;
		Polimorphism.print(result);
	}
	public void perkalian(int num1, int num2, int num3){
		int result = num1 * num2 * num3;
		Polimorphism.print(result);
	}
	
	public void perkalian(double num1, double num2, double num3){
		double result = num1 * num2 * num3;
		Polimorphism.print(result);
	}
}

/*class Segi3Persegi{
	int luas(int p, int l){
		int luas = p * l;
		return luas;
	}
	
	double luas(double a, double t){
		double luas = (a * t) / 2;
		return luas;
	}
}*/