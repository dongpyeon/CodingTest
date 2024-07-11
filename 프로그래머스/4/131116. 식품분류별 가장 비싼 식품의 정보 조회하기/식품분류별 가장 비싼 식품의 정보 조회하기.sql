-- 코드를 입력하세요
WITH COREDATA AS(SELECT CATEGORY, MAX(PRICE) AS MAX_PRICE, PRODUCT_NAME
FROM FOOD_PRODUCT
WHERE CATEGORY IN ('과자','국','김치','식용유')
GROUP BY CATEGORY
ORDER BY MAX_PRICE DESC)
-- 과자국김치식용유인 것의 카테고리, 맥스값임 옆에다가 프로덕트 네임만 찾아서 붙이면 됨
SELECT C.CATEGORY, C.MAX_PRICE, F.PRODUCT_NAME
FROM COREDATA C
JOIN FOOD_PRODUCT F
ON C.CATEGORY = F.CATEGORY && C.MAX_PRICE=F.PRICE
ORDER BY C.MAX_PRICE DESC