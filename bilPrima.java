public class bilPrima{
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args){
		
		/*try{
			int a = Integer.parseInt(args[0]);
			int i, pr = 0;
			for(i = 1; i <= a; i++){
				if(a%i == 0){
				pr++;
				}
			}
			if(pr == 2){
				print("Bilangan prima");
			}
			else{
				print("Bukan bilangan prima");
				}
		}
		catch(Exception e){
			print("Inputan salah");
		}*/
		
		//Nampilin bilangan prima saja
		int[] data = {3,10,7,11,15,16,23,50};
		/* cara 1
		for(int nbr : data){						//Pindahin isi data ke nbr
			boolean prime = true;
			if(nbr <= 1){							//Klo data lebih kecil atau sama dengan satu maka bukan bilangan prima
				prime = false;
			}
			else{
				for(int j = nbr/2; j >=2; j--){ 	//Klo hasil dari setengan angka(mis. 10 ->5) adalah 2 (hitung pembagian dg decrement[bagi 4->3->2->1])atau lebih maka bukan bilangan prima 
					if(nbr %j == 0){
						prime = false;
						break;						//Klo sisa bagi dari nbr adalah 0 maka bukan merupakan bil prima
					}
				}
			}
			if(prime){
				print(nbr +(" Bilangan prima"));
			}
		}*/
		//Cara 2
		for(int index = 0; index < data.length; index++){
			int x = data[index];
			boolean prime = true;
			for(int i = 2; i <= x-1; i++){
				if(x % i == 0){
					prime = false;
					break;
				}
			}
			if(prime == true){
				print(x);
			}
		}
	}
}