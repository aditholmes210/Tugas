public class Terkecil{
	public static void print(Object obj){
			System.out.println(obj);
	}
	public static void main(String[] args){
		
		int[] data = {10,34,5,23,6,7,55,20,260,273,333};
		
		/*for(int i : data){
			boolean terkecil = true;
			for(int j : data){
				if(j < i){
					terkecil = false;
					break;
				}
			}
			if(terkecil){
				println(i);
				break;
			}
		}*/
		
		/*int lowestData = data[0]; //diasumsikan bahwa data ke 0 adl paling kecil
		int lowestIndex = 0;
		for(int i = 0; i < data.length; i++){
			if(data[lowestIndex] > data [i]){
				lowestData = data[i];
				lowestIndex = i;
			}
		}
		print("Data paling kecil adalah "+lowestData+ " yang berada pada index ke - "+lowestIndex);*/
		
		int id_besar = 0;
		int id_kecil = 0;
		
		for(int i = 0; i < data.length; i++){
			if(data[id_kecil] > data[i]){
				id_kecil = i;
			}
			if(data[id_besar] < data[i]){
				id_besar = i;
			}
		}
		print("Data terbesar adalah : "+id_besar);
		print("Data terkecil adalah : "+id_kecil);
	}
}