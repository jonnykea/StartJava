DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee
(
    id        SERIAL PRIMARY KEY,
    name      CHAR(36) NOT NULL,
    salary    int      NOT NULL,
    managerId INTEGER default null
);

INSERT INTO Employee(id, name, salary, managerId)
values (1, 'JOE', '70000', 3),
       (2, 'HENRY', '80000', 4),
       (3, 'SAM', '60000', Null),
       (4, 'MAX', '90000',Null);

Create table If Not Exists Employee (id int, name varchar(255), salary int, managerId int);
Truncate table Employee;
insert into Employee (id, name, salary, managerId) values ('1', 'Joe', '70000', '3');
insert into Employee (id, name, salary, managerId) values ('2', 'Henry', '80000', '4');
insert into Employee (id, name, salary, managerId) values ('3', 'Sam', '60000', Null);
insert into Employee (id, name, salary, managerId) values ('4', 'Max', '90000', Null);

SELECT E.name
FROM EMPLOYEE E
WHERE E.SALARY > (SELECT SALARY FROM EMPLOYEE m WHERE E.managerId = m.ID);

SELECT E.name
FROM EMPLOYEE E
         JOIN EMPLOYEE M ON E.managerId = M.Id
WHERE E.SALARY > M.SALARY;

SELECT *
FROM EMPLOYEE E
        inner JOIN EMPLOYEE M ON E.managerId = M.id;

SELECT * From Employee e
where e.name ilike 'j%';

SELECT * From Employee e
where e.name like 'J%';

SELECT * From Employee e
where e.name like '__m%';

SELECT * From Employee e
where e.name ilike '____y%';

SELECT * From Employee e
where e.name like 'J%'
union all
SELECT * From Employee e
where e.name = 'HENRY';