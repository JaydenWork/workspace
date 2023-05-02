const slides = document.querySelector('.slides');
const items = document.querySelectorAll('.item');
const pages = document.querySelectorAll('.slied-page-btn > span');

// 현재 active 클래스의 인덱스 확인
function currentIndex() {
  // NodeList도 forEach 지원
  let i = 0;
  document.querySelectorAll('.item').forEach((el, index) => {
    if (el === document.querySelector('.slides .active')) {
      i = index;
    }
  });
  return i;
}

function nextPage() {
  const index = currentIndex();
  let nextIndex = index == items.length - 1 ? 0 : index + 1;

  const offset = -800 * nextIndex;
  slides.style.transform = 'translateX(' + offset + 'px)';

  items[index].classList.toggle('active');
  items[nextIndex].classList.toggle('active');

  pages[index].classList.toggle('active');
  pages[nextIndex].classList.toggle('active');
}

// 이전 버튼
document.querySelector('.prev-btn').addEventListener('click', nextPage);

// 다음 버튼
document.querySelector('.next-btn').addEventListener('click', () => {
  const index = currentIndex();
  let nextIndex = index == items.length - 1 ? 0 : index + 1;

  const offset = -800 * nextIndex;
  slides.style.transform = 'translateX(' + offset + 'px)';

  items[index].classList.toggle('active');
  items[nextIndex].classList.toggle('active');

  pages[index].classList.toggle('active');
  pages[nextIndex].classList.toggle('active');
});

// 페이지 버튼 클릭 시
pages.forEach((btn) => {
  btn.addEventListener('click', (e) => {
    document
      .querySelector('.slied-page-btn > span.active')
      .classList.toggle('active');
    e.target.classList.toggle('active');

    pages.forEach((el, index) => {
      if (el === e.target) {
        document.querySelector('.slides .active').classList.toggle('active');
        items[index].classList.toggle('active');

        slides.style.transform = 'translateX(' + -800 * index + 'px)';
      }
    });
  });
});

// 3초마다 다음 페이지로 이동
let interval = setInterval(nextPage, 3000);

// 슬라이드에 마우스가 올라가면 자동 이동 멈춤
document
  .querySelector('.slide-container')
  .addEventListener('mouseenter', (e) => {
    clearInterval(interval);
  });

// 슬라이드에서 마우스가 나가면 다시 자동 이동
document
  .querySelector('.slide-container')
  .addEventListener('mouseleave', (e) => {
    interval = setInterval(nextPage, 3000);
  });
