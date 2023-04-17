// 문자열 관련 함수

document.querySelector('#btn1').addEventListener('click', () => {
  // 문자열.substring(시작인덱스, 종료인덱스(미포함))
  // -시작 이상 종료 미만 만큼의 문자열을 잘라서 반환

  const str1 = 'Hello World!';

  console.log(str1.substring(0, 5)); // Hello
  console.log(str1.substring(6, 11)); // world

  // 문자열.split("구분자" [,최대 분할 개수])
  // - 문자열을 구분자를 기준으로 나누어 배열 형태로 반환

  const str2 = '김치찌개, 샌드위치, 햄버거, 떡볶이, 김밥, 마라탕, 초밥';

  const arr2 = str2.split(',');

  console.log(arr2);
  for (let menu of arr2) {
    console.log(menu);
  }
});

// 숫자 관련 함수
document.querySelector('#btn2').addEventListener('click', function (e) {
  //infinity 리터럴 확인
  console.log(5 / 0);

  // Java : ArithmericExceptions (산술적 예외)
  // JavaScript : infinity

  // NaN 리터럴 확인
  console.log('abc' * 100); // NaN

  if (5 / 0 == Infinity) {
    console.log('0으로 나눌 수 없습니다.');
  }

  if ('abc' * 100 == NaN) {
    console.log('숫자만 * 연산을 할 수 있습니다');
  }

  if (isNaN('abc' * 100)) {
    console.log('숫자만 * 연산을 할 수 있다.');
  }

  /* Math 자바스크립트 내장 객체 */
  console.log(Math.ceil(10.5)); // 올림, 11
  console.log(Math.floor(10.5)); // 내림, 10
  console.log(Math.trunc(10.5)); // 버림, 10
  console.log(Math.round(10.5)); // 반올림, 11

  // Math.random() -> 0.0 <= x< 1.0 실수 반환

  //************ 버튼 클릭 시마다 버튼 배경색 랜덤하게 변경*************

  const r = Math.floor(Math.random() * 256); // 0.0 <= x < 256 --> 정수
  const g = Math.floor(Math.random() * 256); // 0.0 <= x < 256 --> 정수
  const b = Math.floor(Math.random() * 256); // 0.0 <= x < 256 --> 정수

  e.target.style.backgroundColor = `rgb(${r},${g},${b})`;
});

// 형변환 함수
document.querySelector('#btn3').addEventListener('click', function () {
  // const num = '1.234';
  const num = 10;

  console.log(parseInt(num));
  console.log(parseFloat(num));
  console.log(Number(num));
});
