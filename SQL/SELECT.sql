/*
https://programmers.co.kr/learn/courses/30/lessons/59034
모든 레코드 조회하기
*/

SELECT * 
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59035
역순 정렬하기
*/

SELECT NAME, DATETIME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID DESC;

/*
https://programmers.co.kr/learn/courses/30/lessons/59036
아픈 동물 찾기
*/

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59037
어린 동물 찾기
*/

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION <> 'Aged'
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59403
동물의 아이디와 이름
*/

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59404
여러 기준으로 정렬하기
*/

SELECT ANIMAL_ID, NAME, DATETIME
FROM ANIMAL_INS
ORDER BY NAME, DATETIME DESC;

/*
https://programmers.co.kr/learn/courses/30/lessons/59405
상위 n개 레코드
*/

SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1;

// 인기있는 아이스크림

SELECT FLAVOR
FROM FIRST_HALF
ORDER BY TOTAL_ORDER DESC, SHIPMENT_ID ASC;
