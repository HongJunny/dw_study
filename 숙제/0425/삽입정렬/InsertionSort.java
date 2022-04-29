포인트
    기준값 = 비교하기 위해서, 처음 선택 하고 중심이 되는 값
    비교값 = 기준값과 비교해서, 크다면 기준값과 자리를 바꾸는 값
    1) 기준값은 0번째가 아닌 1번째 값부터 시작
    2) 기준값의 위치는 한 번의 회전을 하면서 바뀔 수 있기 때문에, 비교값과 비교하기 위해서는 기준값을 따로 저장해야 함
    3) 비교하고 저장할 때, 저장하는 위치를 지정하는 기준은 기준값이 아니라 비교값이어야 함.
        이유 : a) 한번의 회전에서 기준값의 첫 위치는 고정된 상태지만 비교값의 첫 위치는 계속 변동 됨 
               b) 기준값이 비교값과 자리를 바꾸면서 위치가 이동되기 때문에, 저장되는 위치도 계속 변동 돼야 한다.
    4) 한번의 회전이 끝나면, 기준으로 지정 했던 초기 위치의 앞 부분은 정렬이 된 상태

참고 https://www.daleseo.com/sort-insertion/

1. for-for
package 삽입정렬;
public class InsertionSort {
	public static void main(String[] args) {
		int array[] = {8, 5, 6, 2, 4};
		int temp = 0; // 교환 하기 위해 작은 수 저장
		for(int i=1; i<array.length; i++) {
			int comp = array[i]; // 기준값 저장
			// array[i]의 값을 따로 저장 하지 않고 array[j]와 비교 했을 때, array[i]가 바뀌게 되면 제대로 비교할 수 없음.
			// 따라서 comp에 따로 저장해 둠.
			for(int j=i-1; j>=0; j--) {
                	// 비교값은 기준값의 앞자리에서 시작해서 0번째가 될 때까지 자리수를 줄여가며 비교한다.
				if(comp<array[j]) {
					// 위와 마찬가지로 array[i]와 비교하는 것이 아닌 저장된 기준값 comp와 array[j]를 비교함.
					temp = comp;
					// temp에 앞으로 당길 작은 수를 저장함
					array[j+1] = array[j];
					// array[i] = array[j]로 했을 때, i가 고정 된 상태라서,
					// 비교값 array[j]보다 작은 기준값 array[i]가 앞으로 이동 해도, 
					// array[j]의 값이 계속 같은 자리인 array[i]에 입력 돼서 원하는 값을 가져오지 못함.
					// 따라서, 원하는 값을 얻기 위해서 array[i]가 아닌 j의 위치에 따라 변하면서
					// 각 회전의 초기 i와 같은 값, j+1로 바꿔줌 
					array[j] = temp;
					// j+1보다 앞에 있는 j에 작은 수 temp 대입
				}
			}
		}
		for(int arr : array) {
			System.out.println(arr);
		}
	}
}

어짜피 값이 결정되는 회전은 두번째 for문에서 j의 위치가 바뀌면서 일어나니까 한 회전에서 고정 된 i를 모두 j로 표현 해도 됨
i를 j로 표현 하면

		int temp = 0;
		int j = 0;
		
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

2. for-while
		for(int i=1; i<array.length; i++) {
			int first = array[i]; // 기준값 저장
			int j = (i-1); // while 조건문을 쓰기 위해 지정
			while(j >=0 && array[j+1]<array[j]) {
				// j의 위치가 계속 변하기 때문에 i도 j로 표현
				array[j+1] = array[j];
				array[j] = first;
				j--;
			}
		}
		for(int arr : array) {
			System.out.println(arr);
		}


	
참조 https://github.com/YYJ0311/DW_memo/blob/master/%EC%88%99%EC%A0%9C/0425/algorithm/%ED%92%80%EC%9D%B4.java


---   
	
		//선생님의 풀어주신것
		//삽입정렬을 이용하여 오름차순 정렬!
		int array[] = {8, 5, 6, 2, 4};
		
		for (int i=0; i<(array.length-1); i++) {   // 4회전 세팅
			System.out.println((i+1)+"회전");
			// 배열을 비교 하는 로직 구현
			for (int j=i+1; j>0; j--) {
				int key = j;
				System.out.println("key : "+key);
				if (array[key] < array[key-1]) {
					int temp = array[key];
					array[key] = array[key-1];
					array[key-1] = temp;
				}
			}
			System.out.println("-----");
		}
