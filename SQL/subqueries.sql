use practice;
-- SUBQUERIES
-- write a query to display department name of smith
select * from emp;
select * from dept;
select dname from dept where deptno = ( select deptno from emp where ename="SMITH");
-- details of employee earning min salary in the table
select * from emp where sal in(select min(sal) from emp);
-- department details of employee earning maximum salary
SELECT *
FROM dept
WHERE deptno IN (
    SELECT deptno
    FROM emp
    WHERE sal = (SELECT MAX(sal) FROM emp)
);

-- name salary hiredate of employees working in sales department and hired before king
-- write a query to display department name in which there are atleast 4 employees working
select dname from dept where deptno in (select deptno from emp group by deptno having count(*)>=4);

-- details of employee getting same salary in the same department 
update emp set sal=3000 where ename="ALLEN";
select * from emp where sal in (select sal from emp group by  sal,deptno having count(sal)>1);
-- display 1st records
select * from emp limit 1;
-- display 3rd record
select * from emp limit 1 offset 2;
-- display 5th 6th 7th record
select * from emp limit 3 offset 4;
-- display last record 
-- select * from emp limit 1 offset (select count(*) -1 from emp);
SELECT *
FROM emp
order by empno desc limit 1;

-- 4th max salary
select distinct sal from emp order by sal desc limit 1 offset 3;
-- display details of employee who is earning 3rd and 4th minimum salary

-- display ename, annual salary of employees whos annual salary is more than 12000
select ename, sal*12 as annual_sal from emp where annual_sal>12000;
select ename, sal*12 as annual_sal from (select emp.* , sal*12 as annual_sal from emp) t1 where annual_sal>12000;
-- building a new schema 

