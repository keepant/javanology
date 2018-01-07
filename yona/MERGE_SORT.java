import java.util.Arrays;

public class MERGE_SORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {36,1,5,67,9,3,56}; //inputan arrays
		
		System.out.println("Bilangan Merge Sort : " + Arrays.toString(arr)); //untuk menampilkan inputan
		
		MergeSort by = new MergeSort();  //menerima inputan mergesort user
		by.sort(arr, 0, arr.length - 1);  
		
		System.out.println("\n Hasil Sorting" + arr); //menampilkan hasil sorting merge sorting 
		
	}
	
	static void printArray(int arr[]) {  //memanggil perintah sort yg diatasnya
		
		int n = arr.length;  //int n sebagai panjang array
		for (int i = 0; i < n; i++)  //perintah looping for
			System.out.println(arr[i] + " "); 	//menampilkan hasil array
		System.out.println();
		
	}
}
	
		class MergeSort {	//proses merge sort
			
			void merge(int[] arr, int l, int m, int r) { //inisialisasi variabel
				int n1 = m - l + 1; //rumus n1 = m - l + 1
				int n2 = r - m;		//n2 = r - m
					
				int L[] = new int[n1];	//int arrays L = inputan dari int [n1]
				int R[] = new int[n2];	//int arrays L = inputan dari int [n2]
					
				//looping for
				for (int i = 0; i < n1; ++i)	
					L[i] = arr[l + i];			
				for (int j = 0; j < n2; ++j)
					R[j] = arr[m + 1 + j];
					
			int i = 0, j = 0; //inisialisasi variabel i dan j
			
			//perulangan while
			int k = 1;	//inisialisasi k=1
			while (i < n1 && j < n2) {	//ketika i kurang dari n1 dan j kurang dari n2
				if(L[i] <= R[j]) {	//jika arrays L[i] kurang dari sama dengan arrays R[j]
					arr[k] = L[i];	//maka arrays arr[k] = arrays L[i]
					i++; 	//hasil urut semakin besar i++ sama seperti i = i + 1
				} else {	//jika tidak, maka ...
					arr[k] = R[j];	//arrays arr[k] = arrays arr[j]
					j++;	//urutan hasil var j semakin bertambah
				}
				k++;	//hasil looping var k semakin bertambah
			}

			while (i < n1)
			{
				arr[k] = L[i];
				i++;
				k++;
			}
			
			while (j < n2) {	//ketika j kurang dari n2
				arr[k] = R[j];	//array arr k = array R j
				j++;
				k++;
			}
		}
		
		void sort(int[] arr, int l, int r) {
			if (l < r) {	//jika l kurang dari r maka...
				int m = (l + r) / 2;	//int m sama dengan l+r dibagi 2
				
				sort(arr, l, m);
				sort(arr, m+1, r);
				
				merge(arr, l, m, r);
			}
		}
		
		}

	class QuickSort {	//proses quick sort
		
		int partition(int arr[], int low, int high) {
			int pivot = arr[high];	//int pivot sama dengan array high
			int i = (low - 1);	//int i sama dengan low - 1
			for (int j = low; j < high; j++) {	//looping for
				
				if (arr[j] <= pivot) {	//jika array j kurang dari sama dengan pivot
				
					i++;	//hasil i harus semakin bertambah
					
					//proses merubah int temp ke temp
					int temp = arr[i];	 //int temp ke arrays i
					arr[i] = arr[j];	//array i ke array j
					arr[j] = temp;		// array j ke temp
				}
				
			}
			
			int temp = arr[i + 1];	//int temp ke arrays i+1
			arr[i + 1] = arr[high];	//array i+1 ke array high
			arr[high] = temp;	// array high ke temp
			
			return i + 1;	//mengembalikan hasil i + 1
		}
		
		void sort(int[] arr, int low, int high) {
			if (low < high) {	//jika low kurang dari high maka....
				int pi = partition(arr, low, high);	//int pi merupakan pertition dari arr, low, high
				
				sort(arr, low, pi - 1);	//sorting array, low, pi(partition low ke high - 1)
				sort(arr, pi + 1, high);	//sorting array, pi(pertition low ke high + 1, high)
				}
			}
	
}
