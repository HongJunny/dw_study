package 선택정렬;

public class index {

	public static void main(String[] args) {

		int array[] = {9, 6, 7, 3, 5};
		boolean isChange = false;   // 교환 여부 판단
		// 4회전
		
		// 1회전 : 배열값을 4번 체크 (최솟값 찾기)		
		for (int i=0; i<(array.length-1); i++) {
			System.out.println(array[i]);
		}
		System.out.println("----");
		
		// 최솟값 구해보기
		int min = array[0];  // 배열 첫번째 값을 넣고 비교
		for (int i=1; i<array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println(min);
		System.out.println("----");
		
		// 위에서 '4회전과 최솟값'을 구한것을 가지고 합치기
		for (int i=0; i<(array.length-1); i++) {
			// step 1. 최솟값 변수 선언을 먼저 하기
			int arrayMin = array[i];   // 0번째 값을 초기값으로 세팅
			int index = 0;   // 최솟값 위치
			// step 2. 
			for (int j=i+1; j<array.length; j++) {
				if (arrayMin > array[j]) {
					arrayMin = array[j];
					index = j;
					isChange = true;   // 최솟값이 있음
				}
			}
			if (isChange) {
				int temp = array[i];
				array[i] = arrayMin;
				array[index] = temp;
			}
			if (!isChange) {
				break;   // 최솟값이 없다고 판단 됐을 때, break로 for문 중단
			}
			System.out.print(array[i]+" ");
		}
		
	}

}




