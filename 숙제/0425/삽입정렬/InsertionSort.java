package 삽입정렬;

public class InsertionSort {

	public static void main(String[] args) {

		//삽입정렬을 이용하여 오름차순 정렬!
		int array[] = {8, 5, 6, 2, 4};
		
		int temp;
		int j;
		
		for (int i=1; i<array.length; i++) {
			temp = array[i];
			for (j=i-1; j>=0 && temp<array[j]; j--) {
				array[j+1] = array[j];
			}
			array[j+1] = temp;
		}
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
	}

}
