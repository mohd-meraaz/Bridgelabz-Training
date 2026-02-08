use practice_capge;

create table employee ( E_id INT(20) PRIMARY KEY,
    E_Name VARCHAR (100) ,
    E_Dept VARCHAR (20),
    E_Salary INT(20));

-- describe employee
--   +----------+--------------+------+-----+---------+-------+
-- | Field    | Type         | Null | Key | Default | Extra |
-- +----------+--------------+------+-----+---------+-------+
-- | E_id     | int          | NO   | PRI | NULL    |       |
-- | E_Name   | varchar(100) | YES  |     | NULL    |       |
-- | E_Dept   | varchar(20)  | YES  |     | NULL    |       |
-- | E_Salary | int          | YES  |     | NULL    |       |
-- +----------+--------------+------+-----+---------+-------+


-- • Add employee
INSERT INTO employee VALUES
	(101, 'Lucky' , 'Tech' , 300000),
    (102, 'Arvind' , 'Electrical' , 200000),
    (103, 'Suraj' , 'Electrical' , 100000),
    (105, 'Anni' , 'HR' , 50000),
    (104, 'Titu' , 'Tech' , 100000);
    
-- • View all employees
	select * from employee;
--     +------+--------+------------+----------+
-- | E_id | E_Name | E_Dept     | E_Salary |
-- +------+--------+------------+----------+
-- |  101 | Lucky  | Tech       |   300000 |
-- |  102 | Arvind | Electrical |   200000 |
-- |  103 | Suraj  | Electrical |   100000 |
-- |  104 | Titu   | Tech       |   100000 |
-- |  105 | Anni   | HR         |    50000 |
-- +------+--------+------------+----------+

-- • Update employee salary
Update employee set E_Salary=80000
where E_id = 103;

-- • Delete employee
delete from employee where E_id = 105;

-- • Search employee by name
select * from employee where E_Name = 'Lucky';
-- +------+--------+--------+----------+
-- | E_id | E_Name | E_Dept | E_Salary |
-- +------+--------+--------+----------+
-- |  101 | Lucky  | Tech   |   300000 |
-- +------+--------+--------+----------+