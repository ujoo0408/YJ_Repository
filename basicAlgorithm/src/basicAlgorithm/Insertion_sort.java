package basicAlgorithm;

public class Insertion_sort {
	public static void main (String[] args) {
		int A [] = new int[10];
		
		populateA(A);
		System.out.println("Before Sorting : ");
		printA(A);
		
		int key;
		int i;
		
		for(int j = 1 ; j < A.length ; j++) {
			key = A[j];
			i = j - 1;
			while((i > -1) && (A[i] > key)) {
				A[i+1] = A[i];
				i = i-1;
			}
			A[i+1] = key;
		}
		System.out.println("After Sorting : ");
		printA(A);
		
	}
	
	public static void printA(int[] B) {
		for (int i =0 ; i < B.length ; i++) {
			System.out.println(B[i] + " ");
		}
	}
	
	public static int[] populateA(int[] B) {
		
		for (int i =0 ; i < B.length ; i++) {
			B[i] = (int)(Math.random()*100);
		} 
		return B;
	}
	

}
