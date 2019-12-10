public class inputNilai{
	public static void main(String[] args){
		try{
			int nil = Integer.parseInt(args[0]);
			if(nil >= 85 && nil <= 100){		//Batas nilai 85 - 100
			System.out.println("Nilai anda : "+nil);
			System.out.println("Grade      : A");
			}
			else if(nil >= 75 && nil <= 84){	//Batas nilai 75 - 84
			System.out.println("Nilai anda : "+nil);
			System.out.println("Grade      : B");
			}
			else if(nil >= 65 && nil <= 74){	//Batas nilai 65 - 74
			System.out.println("Nilai anda : "+nil);
			System.out.println("Grade      : C");
			}
			else if(nil >= 45 && nil <= 64){	//Batas nilai 45 - 64
			System.out.println("Nilai anda : "+nil);
			System.out.println("Grade      : D");
			}
			else if(nil >= 0 && nil <= 44){		//Batas nilai 0 - 44
			System.out.println("Nilai anda : "+nil);
			System.out.println("Grade      : E");
			}
			else{
				System.out.println("Nilai tidak valid");
				}
		}catch (Exception e){
			System.out.println(e.getMessage()); //nampilin kesalahan
			System.out.println("Data harus int");	  
		}
	}
}