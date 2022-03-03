/*
https://programmers.co.kr/learn/courses/30/lessons/59040
고양이와 개의 개수 구하기
*/

SELECT ANIMAL_TYPE, COUNT(*) AS count 
FROM ANIMAL_INS
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE

/*
https://programmers.co.kr/learn/courses/30/lessons/59041
동명 동물 이름 및 수 찾기
*/

SELECT NAME, COUNT(*) AS COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
GROUP BY NAME
HAVING COUNT(NAME) > 1
ORDER BY NAME;

/*
https://programmers.co.kr/learn/courses/30/lessons/59412
입양 시각 구하기 (1)
*/

SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR BETWEEN 9 AND 20
GROUP BY HOUR
ORDER BY HOUR

/*
https://programmers.co.kr/learn/courses/30/lessons/59413
입양 시각 구하기 (2)
*/

WITH RECURSIVE NEW AS(
    SELECT 0 AS HOUR
    UNION ALL
    SELECT HOUR + 1
    FROM NEW
    WHERE HOUR < 23
)
SELECT HOUR, COUNT(ANIMAL_ID) AS COUNT
FROM NEW
LEFT JOIN ANIMAL_OUTS
ON HOUR = HOUR(DATETIME)
GROUP BY HOUR;
