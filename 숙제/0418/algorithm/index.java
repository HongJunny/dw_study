// 선택정렬을 이용해서 오름차순으로 정렬해보자.
// 선택정렬 관련해서 서치는 좋지만 코드는 직접 풀어봐요! 과정을 중요시 생각합니다 :)

int array[] = {9, 6, 7, 3, 5};
int temp = 0;
int min = 0;   // 최소값

for (int i=0; i<array.length-1; i++) {
	min = i;
	for (int j=i+1; j<array.length; j++) {
		if (array[min] > array[j]) {
			min = j;
		}
	}
	temp = array[min];
	array[min] = array[i];
	array[i] = temp;
}
		
for (int i=0; i<array.length; i++) {
	System.out.print(array[i]+" ");
}