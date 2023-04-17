//계산 버튼 클릭 시
//input 태그에 작성된 값을 모두 읽어와 합한 결과를 alert로 출력
const calc = document.getElementById('calc');
calc.addEventListener('click', () => {
  const numberList = document.getElementsByClassName('in');

  let result = 0;
  for (let i = 0; i < numberList.length; i++) {
    result += Number(numberList[i].value);
  }
  alert(`두 숫자를 더한 값입니다 : ${result}`);
});

const addBtn = document.getElementById('add');
addBtn.addEventListener('click', () => {
  const element = document.createElement('div');
  element.className = 'row'; // 클래스명 row로 초기화
  element.innerHTML =
    '<input type="number" class="in" /><span class="remove-row">&times;</span>';
  document.querySelector('.container').append(element);

  const last =
    document.querySelector('.container').lastElementChild.lastElementChild; // == div > input > span

  last.addEventListener('click', (e) => {
    e.target.parentElement.remove();
  });
});

// document.getElementById('add').addEventListener('click', () => {
//   // 요소 만들기 : document.createElement("태그명")
//   // 요소의 클래스 목록 확인하기 : 요소.classList
//   // 요소에 class 추가 : 요소.classList.add("클래스명")
//   // 요소에 class 제거 : 요소.classList.remove("클래스명")

//   //--------------------------------------------------------
//   //div 요소 만들기

//   const div = document.createElement('div');

//   div.classList.add('row'); // div에 row 클래스 추가

//   요소.setAttribute('type', 'number');
//   // input에 type="number" 속성 추가
// });

// 삭제 버튼 동작 테스트

// 클래스가 remove-row인 요소 중 첫 번째 요소
// document.querySelector('.remove-row').addEventListener('click', (e) => {
//   // console.log(e.target); // 이벤트가 발생한 요소(클릭된 버튼)

//   // console.log(e.target.parentElement); // 이벤트가 발생한 요소의 부모 요소(.row)

//   //이벤트가 발생한 요소의 부모 요소를 제거
//   e.target.parentElement.remove();
// });
