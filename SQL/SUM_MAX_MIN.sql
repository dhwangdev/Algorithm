/* 
https://programmers.co.kr/learn/courses/30/lessons/59415
가장 최근에 들어온 동물 조회
*/

SELECT MAX(datetime) FROM ANIMAL_INS;

/*
https://programmers.co.kr/learn/courses/30/lessons/59038
가장 최근에 들어온 동물 조회
*/

SELECT MIN(datetime) FROM ANIMAL_INS;

/*
https://programmers.co.kr/learn/courses/30/lessons/59406
동물 수 구하기
*/

SELECT COUNT(ANIMAL_ID) FROM ANIMAL_INS;

/*
https://programmers.co.kr/learn/courses/30/lessons/59408
중복 제거해서 이름 개수 구하기
*/

SELECT COUNT(DISTINCT NAME) FROM ANIMAL_INS
WHERE NAME IS NOT NULL;
