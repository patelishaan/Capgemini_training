-- HAVING CLAUSE
select count(*) as no_of_employee, deptno from emp group by deptno having count(*)>=4;
select count(*) as no_of_employee, deptno from emp where ename like "%A%" or ename like "%S%"group by deptno having count(*)>=2;
select sal,count(sal) from emp group by sal having count(sal)>1;
select job, sum(sal) from emp group by job having sum(sal)>7000;

-- ques2
select job, max(sal) from emp group by job having max(sal)>2600;
-- ques3
select hiredate,count(*) from emp group by hiredate having count(hiredate)>1;
-- ques 4
select min(sal), max(sal), job from emp group by job having min(sal)>1000 and max(sal)<5000;