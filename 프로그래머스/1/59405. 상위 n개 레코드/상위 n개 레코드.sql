-- 코드를 입력하세요
WITH FI AS(
    SELECT MIN(DATETIME) AS MINDATA
    FROM ANIMAL_INS)

SELECT NAME
FROM ANIMAL_INS 
WHERE DATETIME = (SELECT MINDATA FROM FI);

