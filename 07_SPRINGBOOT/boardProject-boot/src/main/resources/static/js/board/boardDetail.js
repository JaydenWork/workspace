// 좋아요 버튼이 클릭 되었을 때
const boardLike = document.getElementById('boardLike');

boardLike.addEventListener('click', (e) => {
  //로그인 여부 검사

  if (loginMemberNo == '') {
    alert('Please login');
    return;
  }

  let check; // 기존에 좋아요 x : 0, 좋아요 0: 1

  // contains("클래스명") : 클래스가 있으면 true, 없으면 false
  if (e.target.classList.contains('fa-regular')) {
    // 좋아요 x(빈하트)
    check = 0;
  } else {
    // 좋아요 0 (꽉찬하트)
    check = 1;
  }

  const data = { boardNo: boardNo, memberNo: loginMemberNo, check: check }; // 자바스크립트 객체

  //ajax 코드 작성
  fetch('/board/like', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data),
  })
    .then((response) => response.text()) // 응답 객체를 필요한 형태로 파싱

    .then((count) => {
      console.log('count: ' + count);

      if (count == -1) {
        // INSERT, DELETE 실패 시
        console.log('좋아요 처리 실패');
        return;
      }

      // toggle() : 클래스가 있으면 없애고, 없으면 추가하고...
      e.target.classList.toggle('fa-regular');
      e.target.classList.toggle('fa-solid');

      e.target.nextElementSibling.innerText = count;
    }) // 파싱된 데이터를 받아서 처리하는 코드 작성

    .catch((err) => {
      console.log('예외 발생');
      console.log(err);
    });
});

//게시글 수정 버튼 클릭 시
document.getElementById('updateBtn').addEventListener('click', () => {
  location.href =
    location.pathname.replace('board', 'board2') + '/update' + location.search;

  // /board2/1/2006/update?cp=1 (GET) 방식 요청
});

// 게시글 삭제 버튼이 클릭 되었을 때
document.getElementById('deleteBtn').addEventListener('click', () => {
  if (confirm('Are you sure you want to delete')) {
    location.href = location.pathname.replace('board', 'board2') + '/delete';
    // /board2/1/2006/delete (GET) 방식 요청

    // 삭제 서비스 호출 성공 시 redirect:/board/{boardCode}
    // + RedirectAttributes 이용해서 "삭제 되었습니다" alert 출력
  }
});
