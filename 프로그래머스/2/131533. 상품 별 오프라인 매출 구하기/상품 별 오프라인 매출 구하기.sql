SELECT  
    A.product_code, 
    A.price * nvl(B.amount,0)AS sales
FROM    
    PRODUCT A,
    (SELECT product_id, SUM(sales_amount) amount  
     FROM OFFLINE_SALE 
     GROUP BY product_id) B
WHERE 
    A.PRODUCT_ID = B.PRODUCT_ID
ORDER BY 
    sales DESC, A.product_code ASC;;