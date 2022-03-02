var information = {
    // key : value
    "name" : "Hong Jun ho",
    "age" : 37,
    "address" : "대전광역시",
    "isMarri" : false
}   // json은 key와 value로 구성.
    // JAVA에서는 json을 map라고 함.

// * 주의점
// key는 중복 불가능, value는 중복 가능
// value에 정수형(int, double), 문자형(string), boolean형, 배열형(array), null
// 중괄호로 감싼다.

console.log();
console.log();

console.log(information);
console.log(information.age);

console.log();
console.log();

if(information.age >= 30) {
    console.log("30 이상입니다.");
}
else {
    console.log("30 미만입니다.");
}

console.log();
console.log();

// 상수
const PI = 3.14;

// 배열
var array = [1,3,4,5,10];

for(var i=0; i<=4; i++) {
    if((array[i]%2)==0) {
        console.log(array[i]);
    }
}


console.log();
console.log();


var max=0;
for(var j=0; j<array.length; j++) {
    if(max < array[j]) {
        max = array[j];
    }
}
console.log('최대값은 ==> '+max);