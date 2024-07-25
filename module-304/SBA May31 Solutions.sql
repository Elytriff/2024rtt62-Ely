-- 2
SELECT d.name AS Department_Name, count(c.id) AS Number_of_Courses
FROM department d, course c
WHERE d.id = c.deptId
GROUP BY d.id
ORDER BY count(c.id) ASC, d.name ASC;

-- 3
SELECT c.name as Course_Name, count(sc.studentId) as Number_of_Students
FROM course c, studentcourse sc
WHERE c.id = sc.courseId
GROUP BY c.id
ORDER BY Number_of_Students DESC, Course_Name ASC;

-- 4
SELECT c.name AS Course_Name
FROM course c, studentcourse sc
WHERE c.id not in (select distinct courseId from facultycourse)
AND c.id = sc.courseId
GROUP BY c.id
ORDER BY Course_Name ASC;

-- 5 
SELECT c.name AS Course_Name, count(sc.studentId) as Number_of_Students
FROM course c, studentcourse sc
WHERE c.id NOT IN (select distinct courseId from facultycourse)
AND c.id = sc.courseId
GROUP BY c.id
ORDER BY Number_of_Students DESC, Course_Name ASC;

-- 6
SELECT count(distinct studentId) AS Students, YEAR(startDate) as Year
FROM studentCourse
GROUP BY YEAR(startDate)
ORDER BY Year asc, Students DESC;

-- 7
SELECT startDate as Start_Date, count(distinct studentId) as Total_Number_of_Students
FROM studentcourse
WHERE MONTH(startDate) = 8
GROUP BY startDate
ORDER BY startDate ASC, Total_Number_of_Students ASC;

-- 83F
SELECT s.firstname AS First_Name, s.lastname AS Last_Name, count(sc.courseId) AS Number_of_Courses
FROM student s, studentcourse sc, course c
WHERE s.id = sc.studentId 
AND sc.courseId = c.id
AND c.deptId = s.majorId
GROUP BY s.id 
ORDER BY Number_of_Courses DESC, First_Name ASC, Last_Name ASC;

-- 93G
SELECT s.firstname as First_Name, s.lastname as Last_Name, ROUND(avg(progress),1) as Average_Progress
FROM student s, studentcourse sc 
WHERE s.id = sc.studentId
GROUP BY s.id
HAVING Average_Progress < 50
ORDER BY Average_Progress DESC, First_Name ASC, Last_Name ASC;

-- 10 3H1
SELECT c.name as Course_Name, round(avg(sc.progress), 1) as Average_Progress
FROM course c, studentcourse sc
WHERE c.id = sc.courseId
GROUP BY c.id
ORDER BY Average_Progress DESC, Course_Name ASC;

-- 11
SELECT c.name as Course_Name, round(avg(sc.progress), 1) as Average_Progress
FROM course c, studentcourse sc
WHERE c.id = sc.courseId
GROUP BY c.id
ORDER BY Average_Progress DESC
LIMIT 1; 

-- 12 3h3
SELECT f.firstname as First_Name, f.lastname as Last_Name, round(avg(sc.progress), 1) as Average_Progress
FROM faculty f, facultycourse fc, studentcourse sc 
WHERE f.id = fc.facultyId
AND fc.courseId = sc.courseId
GROUP BY f.id
ORDER BY Average_Progress desc, First_Name ASC, Last_Name ASC;

-- 13
SELECT s.firstname as First_Name, s.lastname as Last_Name, 
CASE
WHEN MIN(sc.progress) < 40 then 'F'
WHEN MIN(sc.progress) < 50 then 'D'
WHEN MIN(sc.progress) < 60 then 'C'
WHEN MIN(sc.progress) < 70 then 'B'
ELSE 'A'
End AS Minimum_Grade,
CASE
WHEN MAX(sc.progress) < 40 then 'F'
WHEN MAX(sc.progress) < 50 then 'D'
WHEN MAX(sc.progress) < 60 then 'C'
WHEN MAX(sc.progress) < 70 then 'B'
ELSE 'A'
End AS Maximum_Grade
FROM student s,studentcourse sc
WHERE s.id = sc.studentId
GROUP BY s.Id
ORDER BY Minimum_Grade DESC, Maximum_Grade DESC, First_Name ASC, Last_Name ASC; 