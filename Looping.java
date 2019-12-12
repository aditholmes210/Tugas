import java.util.Scanner;  //import class
public class Looping{
	public static void print(Object obj){
			System.out.println(obj);
		}
	public static void main(String[] args){
		
		/*For
		int i = 100; //jumlah awal yg diinginkan, klo awalnya 0 yg akan diprint mulai dari 1
		for (i = 10; i > 0; i--){
			System.out.print(i); //object yg di print
		}*/
		
		/*Array
		int[] ganjil = {1, 3, 5, 7, 9, 11};
		int pjg = ganjil.length;
		for(int index = 0; index <= pjg-1; index++){
			System.out.print(ganjil[index]);
		}*/
		
		/* cari data ganjil
		int[] data = {10,34,5,23,6,7,55,20,260,273,333};
		for(int d = 0; d < data.length; d++){
			if(data[d] %2 != 0){
			print(data[d]); // data yg ganjil saja
			}
		}*/
		
		/*Nested for
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				print("i ke-"+i+" dan j ke-"+j);
			}
		}*/
		
		/*For Each
		int[] data = {-3,5,8,3,5};
		int index = 0;
		for(int i : data){
			print("data ke "+index+" adalah "+i);
			index++;
		}*/
		
		/*While
		int ageLeft = 10;
		while(ageLeft > 0){				//}
			print("Still alive !");
			ageLeft--;
			if(ageLeft == 0){			//}  Do
				print("DIEE!!!");
			}
		}		*/						//}
		
		/*Do - While
		int batt = 0;
		do{
			print("Turn power on");
			batt--;
		}
		while(batt > 0);*/
		
		//membuat input dg scanner
		boolean run = true;
		while(run == true){
			Scanner input = new Scanner(System.in);
			print("Pilih 1 untuk lanjut running app");
			print("Pilih 2 untuk lanjut running app");
			print("Pilih 3 untuk stop app");
			int x = input.nextInt();
			switch(x){
				case 1:
				print("Kamu pilih 1");
				break;
				case 2:
				print("Kamu pilih 2");
				break;
				default:
				run = false;
				break;
			}
		}
	}
}