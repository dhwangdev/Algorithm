<create table>
CREATE TABLE 이름(
  student_id INT PRIMARY KEY,
  name VARCHAR(20),
  major VARCHAR(20),
  );
  
DROP TABLE 이름;

ALTER TABLE 이름 ADD score DECIMAL(3, 2);

ALTER TABLE 이름 DROP COLUMN name;

SELECT * FROM 이름;

<Inserting Data>
INSERT INTO 이름 VALUES(1, 'Daniel', 'Biochemistry');

INSERT INTO 이름(student_id, name) VALUES(1, 'Kate');

<Constraints>
ex)
name VARCHAR(20) NOT NULL,
name VARCHAR(20) UNIQUE, 
major VARCHAR(20) DEFAULT 'undecided',
student_id INT AUTO_INCREMENT,

*primary key는 자동으로 NOT NULL & UNIQUE

<Update & Delete>
UPDATE 이름
SET name = 'Tom', major = 'Bio'
WHERE major = 'Biology' OR major = 'Chemistry';

DELETE FROM 이름
WHERE name = 'Tom' AND major = 'undecided';

<Basic Queries>
SELECT * FROM 테이블;

SELECT name, major
FROM 테이블
ORDER BY name;
ORDER BY name DESC;
ORDER BY name ASC;
ORDER BY major, student_id
LIMIT 2;
WHERE major = 'Chemistry';
WHERE name IN ('Claire', 'Kate', 'Mike');

SELECT first_name AS forename, last_name AS surname
FROM employee;

SELECT DISTINCT branch_id
FROM employee;


