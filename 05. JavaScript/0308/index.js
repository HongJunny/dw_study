var name = "홍길동"
var age = 23;


// json
var information = {
    name : '홍길동',
    age : 23
};

// 위에 적은 두개가 같은것임.

console.log(information.age);

console.log();
console.log();


var dw = {
    students : ['유재석','이효리','김종국','송지효','이광수','하하','지석진','강개리','양세찬','전소민'],
    students_count : 15,
    teacher : '현상원',
    today : '2022-03-08',
    subject : ['SQL','JAVA','HTML']
}

console.log(dw.students_count);
console.log();
console.log();
console.log(dw.students[1]);

console.log();
console.log();

// students_count가 15 이하면 학생 수 부족, 15 초과면 학생 수 정상
var count = dw.students_count
if(count <= 15) {
    console.log('학생 수 부족');
}
else {
    console.log('학생 수 정상');
}

console.log();
console.log();


// 학생 중 이씨 몇명인지?
var cnt = 0;
var searchWord = '이';
for(var i=0; i<dw.students.length; ++i) {
    var firstName = dw.students[i].substring(0,1);
    if(firstName == searchWord) {
        ++cnt;
    }
}
console.log('학생 중 이씨는 '+cnt+'명 입니다.');
