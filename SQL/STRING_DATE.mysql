/*
https://programmers.co.kr/learn/courses/30/lessons/59046
특정 이름을 가진 동물들을 찾기
*/

SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME IN ('Lucy', 'Ella', 'Pickle', 'Rogan', 'Sabrina', 'Mitty')
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59047
이름에 el이 들어가는 동물 찾기
*/

SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE (NAME LIKE '%El%' OR NAME LIKE '%el%') AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME;

/*
https://programmers.co.kr/learn/courses/30/lessons/59409
중성화 여부 파악하기
*/ 

SELECT ANIMAL_ID, NAME, 
    CASE 
        WHEN SEX_UPON_INTAKE LIKE '%Neutered%' THEN 'O'
        WHEN SEX_UPON_INTAKE LIKE '%Spayed%' THEN 'O'
        ELSE 'X'
    END AS '중성화'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;

/*
https://programmers.co.kr/learn/courses/30/lessons/59411
오랜 기간 보호한 동물(2)
*/

SELECT ANIMAL_OUTS.ANIMAL_ID, ANIMAL_OUTS.NAME
FROM ANIMAL_OUTS
JOIN ANIMAL_INS
ON ANIMAL_OUTS.ANIMAL_ID = ANIMAL_INS.ANIMAL_ID
ORDER BY DATEDIFF(ANIMAL_OUTS.DATETIME, ANIMAL_INS.DATETIME) DESC
LIMIT 2;

/*
https://programmers.co.kr/learn/courses/30/lessons/59414
DATETIME에서 DATE로 형 변환
*/

SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
