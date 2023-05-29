DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS manager;

CREATE TABLE manager
(
    id     SERIAL PRIMARY KEY,
    name   CHAR(36) NOT NULL,
    salary int      NOT NULL
);

CREATE TABLE employee
(
    id        SERIAL PRIMARY KEY,
    name      CHAR(36) NOT NULL,
    salary    int      NOT NULL,
    managedId INTEGER REFERENCES manager (id) on DELETE CASCADE
);

INSERT INTO manager(id, name, salary)
values (3, 'SAM', '60000'),
       (4, 'SAM', '90000');


INSERT INTO employee(id, name, salary, managedId)
values (1, 'JOE', '70000', 3),
       (2, 'HENRY', '80000', 4);

SELECT E.name
FROM EMPLOYEE E
WHERE E.SALARY > (SELECT SALARY FROM manager m WHERE E.managedId = m.ID);

SELECT E.name
FROM EMPLOYEE E
         LEFT JOIN manager M ON E.managedId = M.Id
WHERE E.SALARY > M.SALARY;

SELECT *
FROM EMPLOYEE E
         LEFT JOIN manager M ON E.managedId = M.id;