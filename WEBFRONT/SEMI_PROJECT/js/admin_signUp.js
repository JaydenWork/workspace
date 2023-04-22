const signupId = document.getElementById('signup-id');
const signupPw = document.getElementById('signup-pw');
const signupPww = document.getElementById('signup-pww');
const idBtn = document.getElementById('id-btn');
const voteLogo = document.getElementById('voteLogo');
const menuMember = document.getElementById('menu-member');
const removeHover = document.getElementsByClassName('remove-hover');
const langDropDown = document.getElementById('menu-lang-drop-down');
const langList = document.getElementsByClassName('lang');

voteLogo.addEventListener('click', () => {
  window.location.href = '../html/main_login.html';
});

menuMember.addEventListener('click', function () {
  // '../html/adming_member.html'로 페이지 이동
  window.location.href = '../html/admin_member.html';
});

function dp_menu() {
  let click = document.getElementById('drop-content');
  if (click.style.display === 'none') {
    click.style.display = 'block';
  } else {
    click.style.display = 'none';
  }
}

function toggleDropdown() {
  var dropdownMenu = document.getElementById('dropdownMenu');
  dropdownMenu.classList.toggle('active'); // 'dropdown-menu'에 'active' 클래스를 토글하여 드롭 다운 메뉴의 보여짐/숨김 상태를 제어
}

function handleMenuItemClick(menuItemIndex) {
  var menuItemText =
    document.getElementById('dropdownMenu').children[menuItemIndex - 1]
      .textContent;
  alert('메뉴 ' + menuItemIndex + '가 클릭되었습니다: ' + menuItemText);
}

for (var i = 0; i < removeHover.length; i++) {
  removeHover[i].style.backgroundColor = '#555555';
  removeHover[i].style.color = '#555555';
}

let isClicked = false;
langDropDown.addEventListener('click', () => {
  const languages = ['English', '日本語', '中文'];
  for (let i = 0; i < removeHover.length; i++) {
    if (!isClicked) {
      removeHover[i].style.fontWeight = 'bold';
      removeHover[i].style.backgroundColor = 'white';
      removeHover[i].innerText = languages[i];

      removeHover[i].style.transition =
        'background-color 0.3s ease, color 0.5s ease';
      removeHover[i].classList.add('hover-effect');

      removeHover[i].addEventListener('mouseover', () => {
        removeHover[i].style.backgroundColor = '#03c75a';
        removeHover[i].style.color = 'white';
      });

      const mouseoutHandler = () => {
        removeHover[i].style.backgroundColor = 'white';
        removeHover[i].style.color = 'black';
      };
      removeHover[i].addEventListener('mouseout', mouseoutHandler);
      removeHover[i].mouseoutHandler = mouseoutHandler;
    } else {
      removeHover[i].style.backgroundColor = '#555555';
      removeHover[i].style.color = '#555555';
      removeHover[i].style.transition = '';

      removeHover[i].classList.remove('hover-effect');

      removeHover[i].removeEventListener(
        'mouseout',
        removeHover[i].mouseoutHandler
      );

      removeHover[i].removeEventListener('mouseover', () => {
        removeHover[i].style.backgroundColor = '#03c75a';
        removeHover[i].style.color = 'white';
      });
    }
  }
  isClicked = !isClicked;
});
