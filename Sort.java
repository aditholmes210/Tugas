public class Sort{
	public static void print(Object obj){
		System.out.println(obj);
	}
	
	public static void main(String[] args){
		
		int[] data = {3,10,5,50,51,2,4,-2,6};
		//Langkah - 1
		// 3 10 5 50 51 2 4 -2 6
		//anggap data paling kecil adalah index paling awal yaitu index ke 0 -> 3
		//cari data paling kecil diantara semuanya
			//data paling kecil adalah -2 di index ke 7
		//data paling kecil ini kemudian dipindahkan ke paling awal dengan cara ditukar dengan data index paling awal
		// -2 | 10 5 50 51 2 4 3 6
		
		//Langkah - 2
		// -2 | 10 5 50 51 2 4 3 6
		//anggap data di langka ke 2 adalah index ke 1 yg datanya 10
		//cari data paling kecil
			//data paling kecil adalah 2 di index ke 5
		//data paling kecil ini ditukar dengan data index ke 1
			// -2 2 | 5 50 51 10 4 3 6
	
		//lakukan pengulangan pengecekan dan tukar data dari index ke 0 hingga terakhir
		for(int index = 0; index < data.length; index++){
			int lowestIndex = index; //lowest index sementara
			//start cari paling kecil dari i to data,length
			for(int i = lowestIndex; i < data.length; i++){
				if(data[lowestIndex] > data[i]){		//membandingkan nilai data[lowestIndex] lebih besar(jika asc)/besar(jika desc) dari data[i]
									//klo > asc, klo < desc
					lowestIndex = i; //ganti index paling kecil ke 1 apabila data[i] lebih kecil daripada data[lowestIndex]
				}
			}
			//end cari paling kecil
			//tukar data
			int temp = data[index];
			data[index] = data[lowestIndex];
			data[lowestIndex] = temp;
		}
		//untuk menampilkan data yang telah diurutkan
		for(int j = 0; j < data.length; j++){
			print(data[j]);
		}
	}
}