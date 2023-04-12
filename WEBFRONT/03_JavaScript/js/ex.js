function accessID() {
  var div1 = document.getElementById('div1');

  // 2) div1의 배경색을 변수에 저장
  /* JS에서 CSS 관련 속성을 다룰 때는 style을 이용함 */
  var bgColor = div1.style.backgroundColor;

  // 3) 배경색이 red일 때, 아닐 때에 대한 코드 작성
  if (bgColor == 'red') {
    /* JS는 문자열 비교 시에도 비교연산자 사용 */
    div1.style.backgroundColor = 'yellow';
  } else {
    div1.style.backgroundColor = 'red';
  }
}

function accessClass() {
  var div2 = document.getElementsByClassName('div2');

  for (var i = 0; i < div2.length; i++) {
    div2[i].style.backgroundColor = 'rgb(100,1,' + i * 50 + ')';
  }
}
