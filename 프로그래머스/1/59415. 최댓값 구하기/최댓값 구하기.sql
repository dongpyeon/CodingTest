-- 코드를 입력하세요
WITH MAXTIME AS(
    SELECT MAX(DATETIME) AS MT
    FROM ANIMAL_INS)
    
SELECT DATETIME AS '시간'
FROM ANIMAL_INS 
WHERE DATETIME=(SELECT MT FROM MAXTIME);
    