// 자바스크립트 or 자바 선택해서 풀 것!
// 버블정렬을 이용하여 오름차순으로 정렬하고 총 몇회전 했는지 알아내시오.
let array = [1, 10, 4, 3, 5];
let count = 0; // 총 몇회전 했는지 알아내는 변수
let temp = 0;  // array 값을 임시로 담아두는 변수
// let = 변수 이름 중복이 안됨. 선언된 변수 이름이 같으면 오류.
// var = JS에서는 변수 이름 중복이 허용 됨.
let len = array.length;

for (var i=len; i>0; i--) {
    for (var j=0; j<(i-1); j++) {
        if (array[j] > array[j+1]) {
            temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            ++count;
        }
    }
    if(!isSwap) break; //더이상 정렬이 없으면 for문 멈춤
}


console.log(array);
console.log(count+' 회전');