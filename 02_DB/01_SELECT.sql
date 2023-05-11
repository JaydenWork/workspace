/* SELECT (조회, DQL 또는 DML)
 * 
 * - 데이터를 조회하면 조건에 맞는 행들이 조회됨
 * -> 조회된 행들의 집합을 "RESULT SET"이라고 한다
 * 
 * -RESULT SET은 0개 이상의 행이 포함될 수 있다.
 * -> 왜 0개 이상?? 조건에 맞는 행이 없을 수도 있기 때문에..
 * 
 * [작성법]
 * 
 * SELECT 컬럼명 | * (모든컬럼)
 * FROM 테이블명
 * WHERE 조건식; -- 조건에 맞는 행만 조회하겠다.
 *
 */
--EMPLOYEE 테이블에서 모든행, 모든 컬럼을 조회
--(WHERE절 없음 == 모든 행)
-- '*' : ALL, 모두, 전부
SELECT * FROM EMPLOYEE; 

SELECT EMP_NAME FROM EMPLOYEE E ;

SELECT EMP_ID, EMP_NAME, PHONE FROM EMPLOYEE E ;

--department 테이블의 모든 행, 열 조회
SELECT * FROM DEPARTMENT D ;

--department 테이블에서 부서명만 조회
--> 테이블 정보에서 컬럼명, comment 확인
SELECT DEPT_TITLE FROM DEPARTMENT D ;

------------------------------------------------------------------------------------


-- <컬럼 값 산술 연산>

--컬럼 값 : 행과 열이 교차되는 테이블의 한 칸 (==액셀에서 한 셀)에 작성된 값(DATA)

-- SELECT문 작성 시 컬럼명에 산술 연산을 작성하면
--조회되는 결과 컬럼 값에 산술 연산이 반영된다.

--EMPLOYEE 테이블에서 모든 사원의 사번, 이름, 급여 + 100만원을 조회
SELECT EMP_ID, EMP_NAME, SALARY, SALARY + 1000000
FROM EMPLOYEE E ;

--employee 테이블에서 모든 사원의 이름, 연봉(급여*12)조회
SELECT EMP_NAME, SALARY * 12 FROM EMPLOYEE E ;

------------------------------------------------------------------------------------

--(중요) < 오늘 날짜 조회 >

SELECT SYSDATE FROM DUAL;
--sysdate : 시스템상의 현재 날짜(시간)

-- DUAL(DUmmy tAbLe) : 가짜 테이블(실제 테이블이 아닌 임시 테이블 용도)
SELECT 100*20+30 FROM dual;

--어제, 오늘, 내일 조회
--> date 타입에 +/- 연산 가능(일 단위)
SELECT SYSDATE -1, SYSDATE , SYSDATE +1
FROM dual;

-- 한 시간 후 조회
SELECT  SYSDATE+ (1/24) FROM dual;
-- 30분  후 조회
SELECT  SYSDATE+ (1/24/60*30) FROM dual;

--employee 테이블에서 이름, 입사일, 오늘 까지 근무할 날짜 조회
-- 시간끼리 연산 가능(미래로 갈수록 큰 수 )
-- 연산 결과는 일 단위로 조회
SELECT emp_name, hire_date, (SYSDATE  - HIRE_DATE) /365
FROM EMPLOYEE E ;

`------------------------------------------------------------------------------------
--<컬럼 별칭 지정>

-- 별칭 지정 방법
-- 1) 컬럼명 as 별칭 : 문자0, 띄어쓰기x, 특수문자x
-- 2) 컬럼명 as "별  칭" : 문자0, 띄어쓰기0, 특수문자0
-- 3)
-- 4)

--employee 테이블에서 이름, 연봉 조회
SELECT EMP_NAME AS "[사원 이름]", salary * 12 "사원 연봉"
FROM EMPLOYEE E ;

------------------------------------------------------------------------------------

-- 리터럴 : 표현되는 값 자체
-- DB에서 리터럴 : 임의로 지정한 테이블에 존재하는 값 처럼 사용
-->리터럴 표기법 : ''홑따옴표, 기본적으로 문자열 의미한다
SELECT emp_name, salary, '원' AS 단위
FROM EMPLOYEE E;

------------------------------------------------------------------------------------

-- <DISTINCT> (별개의, 따로따로)
--> 조회 시 지정된 컬럼에 중복 값을 한 번만 표시할 떄 사용

SELECT DISTINCT dept_code FROM employee;

------------------------------------------------------------------------------------

-- <where 절>
-- 테이블에서 조건을 충족하는 컬럼 값을 가진 행만 조회할 때 사용
-- where 절에는 조건식(true/f)을 작성
-- 비교 연산자 : >, >=,<, <=, = (같다), !=, <> (같지 않)
-- 논리 연산자 : and, or, not

-- employee 테이블에서 급여가 300만원 초과인 사원의 사번, 이름, 급여, 부서코드 조회
/*3*/SELECT emp_id, emp_name, salary, dept_code
/*1*/FROM EMPLOYEE
/*2*/WHERE salary > 3000000;

-- employee 테이블에서 
-- 연봉이 5천만원 이하의 사원의 사번, 이름 조회
SELECT emp_id, EMP_NAME, SALARY 
FROM EMPLOYEE E 
WHERE SALARY * 12 <=50000000;

--employee 테이블에서 부서코드가 d9이 아닌 사원의 사번, 이름, 부서코드, 전화번호 조회
SELECT emp_id, emp_name, dept_code, PHONE
FROM EMPLOYEE E 
WHERE DEPT_CODE <> 'D9';

-- EMPLOYEE 에서 부서코드가 d6이고 급여가 200만 이상인 사원의 이름, 급여, 부서코드 조회

SELECT EMP_NAME, SALARY , DEPT_CODE 
FROM EMPLOYEE
WHERE DEPT_CODE = 'D6'
AND SALARY >= 2000000;

--employee 테이블에서
--급여가 300만 이상 500만 이하인 직원의 모든 컬럼 조회

SELECT *
FROM EMPLOYEE 
WHERE SALARY >= 3000000 AND SALARY <= 5000000;

-- 컬럼명 between a and b 
SELECT *
FROM EMPLOYEE E 
WHERE SALARY BETWEEN 3000000 AND 5000000;

--employee 테이블에서
--급여가 300만 이상 500만 이하가 아닌 직원의 모든 컬럼 조회
-- not between a and b 
SELECT *
FROM EMPLOYEE E 
WHERE SALARY NOT BETWEEN 3000000 AND 5000000;

--employee 테이블에서
--부서코드가 'd5' 또는 'd6' 또는 'd9'인 사원의 
--사번, 이름, 부서코드 조회

SELECT emp_id, emp_name, dept_code
FROM EMPLOYEE E 
WHERE DEPT_CODE = 'D5'
OR  DEPT_CODE = 'D6'
OR  DEPT_CODE = 'D9';

-- 컬럼명 in (값1, 값2, 값3, ...) : 컬럼 값에 ()안의 값이 포함된 행은 true
SELECT emp_id, emp_name, dept_code
FROM EMPLOYEE E 
WHERE DEPT_CODE IN ('D5', 'D6', 'D8');

SELECT emp_id, emp_name, dept_code
FROM EMPLOYEE E 
WHERE DEPT_CODE NOT IN ('D5', 'D6', 'D8');


------------------------------------------------------------------------------------

-- <NULL 처리 연산>

-- Java에서 null : 참조하는 객체가 없다.
-- db에서   null : 컬럼 값이 없다.

-- is null : 컬럼 값이 null인 경우 true
-- is not null : 컬럼 값이 null이 아닌 경우 true

-- employee 테이블에서 부서가 없는 사원의 모든 컬럼 조회
SELECT * 
FROM EMPLOYEE E
WHERE dept_code IS NULL;


-- employee 테이블에서 부서가 있는 사원의 모든 컬럼 조회
SELECT * 
FROM EMPLOYEE E
WHERE dept_code IS NOT NULL;

------------------------------------------------------------------------------------

-- 연결 연산자( || )
-- 여러 값을 하나의 컬럼 값으로 연결하는 연산자
-- (==자바의 문자열 이어쓰기(+))

-- 000의 급여는 000원 입니다.
SELECT emp_name ||'의 급여는 ' || salary || '원 입니다.' AS 결과
FROM employee;

------------------------------------------------------------------------------------

/* LIKE
 * 
 * - 비교하려는 값이 특정한 패턴을 만족 시키면 (true) 조회하는 연산자
 * 
 * [작성법]
 * where 컬럼명 like '패턴'
 * 
 * -like 패턴( == 와일드 카드)
 * 
 * '%' (포함)
 * - '%A' : 문자열이 앞은 어떤 문자든 포함되고 마지막은 A
 * 			-> A로 끝나는 문자열
 * - 'A%' : A로 시작하는 문자열
 * - '%A%' : A가 포함된 문자열
 * 
 * '_' ( 글자 수)
 * - 'A_' : A뒤에 아무거나 한글자만 있는 문자열
 * 			( AB, A1, AQ, A가)
 * - '___A' : A앞에 아무거나 3글자만 있는 문자열
 *  
 * 
 * */

-- employee테이블에서 성이 '전' 씨인 사원의 사번, 이름 조회
SELECT *
FROM EMPLOYEE E 
WHERE EMP_NAME LIKE '전%';

-- employee테이블에서 이름에 '하'가 포함되는  사원의 사번, 이름 조회
SELECT *
FROM EMPLOYEE E 
WHERE EMP_NAME LIKE '%하%';

--employee테이블에서 
--전화번호가 '010'으로 시작하는/시작하지 않 사원의 사번, 이름 전화번호
SELECT emp_id, emp_name, phone
FROM EMPLOYEE E 
--WHERE PHONE NOT LIKE '010%'
WHERE phone LIKE '010________';

-- employee테이블에서
-- email에 _앞글자가 5글자인 사원의 사번, 이름, 이메일
SELECT emp_id, emp_name, email
FROM EMPLOYEE E 
WHERE EMAIL LIKE '_____@%';

-- 문제점 : 와일드 카드 문자(_)와 패턴에 사용된 일반 문자가 같은 문자이기 때문에 구분이 안되는 문제가 발생
--> 해결방법 : escape 옵션을 이용하여 일반 문자(_)를 구분

SELECT emp_id, emp_name, email
FROM EMPLOYEE E 
WHERE EMAIL LIKE '___$_%' ESCAPE '$'; --> '$'뒤에 한 글자(_)를 일반 문자로 벗어나게 함

------------------------------------------------------------------------------------

-- <where절 날짜(시간) 비교>
--employee테이블에서 입사일(고용일)이
-- '1990/01/01' ~ '2000/12/31' 사이인 사원의
-- 사번, 이름, 고용일 조회
SELECT emp_id, emp_name, hire_date
FROM EMPLOYEE E 
WHERE HIRE_DATE >= '1990/01/01'
AND HIRE_DATE <= '2000/12/31';

------------------------------------------------------------------------------------
/*order by 
 * 
 * -select문의 조회 결과(result set)를 정렬할 때 사용하는 구문
 * 
 * - *** select구문에서 제일 마지막에 해석된다 ! ***
 * 
 * [작성법]
 * 3:select 컬럼명 as 별칭, 컬럼명, 컬럼명, ...
 * 1:from 테이블명
 * 2:where 조건식
 * 4:order by 컬럼명 | 별칭 | 컬럼 순서[오름/내림 차순]
 *			[nulls first | last] 
 * */

--employee테이블에서 모든 사원의 이름, 급여를
--급여 오름차순으로 조회
SELECT emp_name, salary
FROM EMPLOYEE E 
ORDER BY salary ASC;

--employee테이블에서 모든 사원의 이름, 급여를
--급여 내림차순으로 조회
SELECT emp_name, salary
FROM EMPLOYEE E 
ORDER BY salary DESC;

-- 급여가 200만 이상인 사원을 급여 오름차순으로 조회
SELECT emp_name, salary
FROM EMPLOYEE E 
WHERE SALARY >= 2000000
ORDER BY salary ASC;

/*** 문자열, 날짜, 숫자 모두 정렬 가능 ***/
 
-- 이름 오름차순 정렬
SELECT emp_name FROM EMPLOYEE E ORDER BY emp_name;

-- 입사일 내림차순 정렬
SELECT emp_name , hire_date FROM EMPLOYEE E ORDER BY HIRE_DATE DESC;

-- order by절에 별칭|순서 사용하기

--연봉 내림차순 조회
SELECT emp_name, salary * 12 AS 연봉
FROM EMPLOYEE E 
ORDER BY 연봉 DESC;

--[nulls first | last]
-- 전화번호 오름차순 조회
SELECT emp_name, phone
FROM EMPLOYEE E 
ORDER BY PHONE NULLS FIRST;

-- 전화번호 내림차순 조회
SELECT emp_name, phone
FROM EMPLOYEE E 
ORDER BY PHONE DESC NULLS LAST;

/*<정렬 중첩>
 * -큰 분류를 먼저 정렬하고, 내부 분류를 그 다음에 정렬하는 방식
 * */

-- 부서코드 별 급여 내림 차순(부서코드는 오름차순)
SELECT emp_name, dept_code, salary
FROM EMPLOYEE E 
ORDER BY DEPT_CODE ASC  NULLS FIRST , salary DESC;
