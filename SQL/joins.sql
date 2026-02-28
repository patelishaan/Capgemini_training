-- JOINS
use practice;
select * from emp cross join dept;

-- display ename and their department name where they work
select ename, dname from emp join dept where emp.deptno = dept.deptno;

insert into emp values(7935,'Raju','Developer',NULL,current_date,1000,null,null);
select * from emp;
select * from dept;

-- display ename, salary and location of all the employees in the location chicago
-- select ename, salary, loc from emp join dept where emp.deptno = dept.deptno and loc = "chicago";
select ename,sal,loc from emp join dept where emp.deptno = dept.deptno and dept.loc = 'chicago';

-- dname and empno for all the employees who's empno are (7839,7902) and are working in loc new york
select d.dname, e.empno from emp e join dept d where e.empno in (7839,7902) and d.loc = 'new york';


-- display dname in which atleast 4 employees are working
select dname from dept where deptno in (select deptno from emp  group by deptno having count(*)>=4);
-- display number of employee working in each dept ?
select count(*) as no_of_emps, e.deptno,d.dname from emp e join dept d on e.deptno=d.deptno group by e.deptno,d.dname;
-- name,sal,job,hiredate of the emps working in sales department and hired before king
select ename,sal,job,hiredate from emp inner join dept on emp.deptno = dept.deptno where dept.dname='sales' and hiredate < (
select hiredate from emp where ename='king');

-- display emp name and their dept name even though the employee who dont work in any dept alter
select e.ename,d.dname from emp e left join dept d on e.deptno = d.deptno;
-- display emp name and their dept name even though the dept where no emp are working
select * from emp e right join dept d on e.deptno = d.deptno;
select * from dept d left join emp e on d.deptno = e.deptno;
-- FULL OUTER JOIN
select ename, dname from emp left join dept on emp.deptno = dept.deptno 
union 
select ename,dname from emp right join dept on emp.deptno = dept.deptno;
-- DISPLAY THE AUTHOR WHO HAS NOT WRITTEN ANY BOOK (ONLY THESE AUTHORS NOT AUTHORS WITH BOOKS)
select author_name from Authors a left join Books b on a.author_id=b.author_id where b.book_id = null;

-- DISPLAY BOOK NAME AND GENRE NAME
SELECT 
    b.title, t.genre_name
FROM
    books b
        INNER JOIN
    genre g ON b.genre_id = g.genre_id;

-- MULTIPLE TABLE
-- CREATE TABLE
create database library;
use library;
CREATE TABLE Authors (
    author_id INT PRIMARY KEY AUTO_INCREMENT,
    author_name VARCHAR(100) NOT NULL,
    state VARCHAR(100)
);
CREATE TABLE Genres (
    genre_id INT PRIMARY KEY AUTO_INCREMENT,
    genre_name VARCHAR(100) NOT NULL
);
CREATE TABLE Books (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(200) NOT NULL,
    author_id INT,
    genre_id INT,
    FOREIGN KEY (author_id) REFERENCES Authors(author_id),
    FOREIGN KEY (genre_id) REFERENCES Genres(genre_id)
);
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    user_name VARCHAR(100) NOT NULL,
    phno VARCHAR(15),
    email VARCHAR(150)
);
CREATE TABLE Loans (
    loan_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    book_id INT,
    borrowed_date DATE,
    return_date DATE,
    FOREIGN KEY (user_id) REFERENCES Users(user_id),
    FOREIGN KEY (book_id) REFERENCES Books(book_id)
);

show tables;
INSERT INTO Authors (author_name, state) VALUES
('Ravi Sharma', 'Delhi'),
('Anita Mehta', 'Mumbai'),
('John Carter', 'Texas'),
('Emily Stone', 'California'),
('Michael Brown', 'Chicago'),
('Sarah Wilson', 'Florida'),
('David Lee', 'New York'),
('Priya Nair', 'Kerala'),
('Robert King', 'Nevada'),
('Laura Adams', 'Boston');

INSERT INTO Genres (genre_name) VALUES
('Technology'),
('Fiction'),
('History'),
('Science'),
('Biography'),
('Fantasy'),
('Romance'),
('Philosophy'),
('Education'),
('Self-Help');

INSERT INTO Books (title, author_id, genre_id) VALUES
('Learning SQL', 1, 1),
('Advanced SQL', 1, 1),
('Mystery of Time', 2, 2),
('Ocean Secrets', 2, 2),
('History of Rome', 3, 3),
('Ancient Civilizations', 3, 3),
('Physics Basics', 4, 4),
('Life of Einstein', 5, 5),
('Fantasy World', 6, 6),
('Modern Philosophy', 7, 8);

INSERT INTO Users (user_name, phno, email) VALUES
('Amit Verma', '9876543210', 'amit@email.com'),
('Neha Singh', '9876543211', 'neha@email.com'),
('Rahul Das', '9876543212', 'rahul@email.com'),
('Sneha Kapoor', '9876543213', 'sneha@email.com'),
('Arjun Rao', '9876543214', 'arjun@email.com'),
('Pooja Shah', '9876543215', 'pooja@email.com'),
('Karan Malhotra', '9876543216', 'karan@email.com'),
('Simran Gill', '9876543217', 'simran@email.com'),
('Vikram Joshi', '9876543218', 'vikram@email.com'),
('Tina Roy', '9876543219', 'tina@email.com');

INSERT INTO Loans (user_id, book_id, borrowed_date, return_date) VALUES
(1, 1, '2024-01-01', '2024-01-10'),
(1, 2, '2024-02-01', '2024-02-10'),
(1, 3, '2024-03-01', '2024-03-10'),
(2, 4, '2024-01-15', '2024-01-25'),
(2, 5, '2024-02-20', '2024-03-01'),
(3, 6, '2024-03-05', '2024-03-15'),
(4, 7, '2024-03-10', '2024-03-20'),
(5, 8, '2024-03-12', '2024-03-22'),
(6, 9, '2024-03-14', '2024-03-24'),
(7, 10, '2024-03-18', '2024-03-28');
use library;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS Loans;
DROP TABLE IF EXISTS Books;
DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Genres;
DROP TABLE IF EXISTS Authors;

SET FOREIGN_KEY_CHECKS = 1;
select * from loans;