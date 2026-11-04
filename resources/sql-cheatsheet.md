# SQL Cheat Sheet
```sql
SELECT col FROM t WHERE cond ORDER BY col LIMIT 10;
SELECT dept, COUNT(*) FROM emp GROUP BY dept HAVING COUNT(*) > 5;
SELECT b.title, m.name FROM loans l
  JOIN books b ON b.book_id = l.book_id
  LEFT JOIN members m ON m.member_id = l.member_id;
UPDATE t SET col = 1 WHERE id = 5;   -- always WHERE
DELETE FROM t WHERE id = 5;          -- always WHERE
```
