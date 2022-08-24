SELECT * FROM jaegers;
SELECT * FROM jaegers WHERE status = '';
SELECT * FROM jaegers WHERE mark = '1' OR mark =  '6';
SELECT * FROM jaegers ORDER BY mark DESC;
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);
SELECT * FROM jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM jaegers);
SELECT AVG(weight) FROM jaegers;
UPDATE jaegers SET kaijukill = kaijukill + 1 WHERE  status = '';
DELETE FROM jaegers  WHERE  status = 'Destroyed';







