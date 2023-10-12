SELECT FIR.FLAVOR
FROM FIRST_HALF FIR JOIN JULY JUL
ON FIR.FLAVOR = JUL.FLAVOR
GROUP BY FIR.FLAVOR
ORDER BY SUM(FIR.TOTAL_ORDER) + SUM(JUL.TOTAL_ORDER) DESC
FETCH FIRST 3 ROWS ONLY;
