const smallNews = document.querySelectorAll('.item2');
const box1 = document.querySelector('.box1');
const newsTitle = document.querySelector('#news-title');
const newsTitles = document.querySelectorAll('.small-news');
const newsSub = document.querySelector('news');

// smallNews에 대해 forEach 메소드를 사용하여 각 요소에 이벤트 리스너를 추가합니다.
smallNews.forEach((newsItem, index) => {
  newsItem.addEventListener('mouseenter', () => {
    newsItem.style.borderBottom = '5px solid #2DB400';

    if (index === 0) {
      box1.style.backgroundImage = 'url("../img/news1.jpeg")';
      newsTitle.innerText = newsTitles[index].innerText;
    } else {
      box1.style.backgroundImage = `url("../img/news${index + 1}.jpeg")`;
      newsTitle.innerText = newsTitles[index].innerText;
    }
  });

  newsItem.addEventListener('mouseleave', () => {
    newsItem.style.borderBottom = 'none';
    box1.style.backgroundImage = 'url("../img/news1.jpeg")';
    newsTitle.innerText = newsTitles[index].innerText;
  });
});
