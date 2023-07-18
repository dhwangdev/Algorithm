/*
https://programmers.co.kr/learn/courses/30/lessons/59039
이름이 없는 동물의 ID 조회
*/

SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59407
이름이 있는 동물의 ID 조회
*/

SELECT ANIMAL_ID 
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59410
NULL 처리하기: 이름이 NULL일 경우 No Name으로 변경하기
*/

SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name') AS NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
