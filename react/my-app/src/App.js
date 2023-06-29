import './App.css';

function App() {
  // 리액트의 컴포넌트는 딱 하나의 요소만을 반환할 수 있다.
  return (
    /* fragment(<> </>) : 반환되는 요소를 감쌀 때 사용, 해석x */
    <>
      {/* jsx 주석 */}
      <h1>Hello React!</h1>
      <h1>~~~!~~~!</h1>
    </>
  );
}

export default App;
