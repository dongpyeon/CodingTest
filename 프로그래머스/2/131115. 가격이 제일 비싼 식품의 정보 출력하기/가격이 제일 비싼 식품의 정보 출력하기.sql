-- 코드를 입력하세요
WITH MAXPRICE AS(
SELECT MAX(PRICE) AS MP
FROM FOOD_PRODUCT
)

SELECT *
FROM FOOD_PRODUCT 
WHERE PRICE = (SELECT MP FROM MAXPRICE);