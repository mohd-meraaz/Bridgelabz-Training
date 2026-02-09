USE practice_capge;

-- UC-1.1: Register New Patient
CREATE TABLE Patient (
	Patient_Id INT PRIMARY KEY AUTO_INCREMENT,
    Patient_Name VARCHAR (100) ,
    DOB Varchar(20),
    Phone_No varchar(15) ,
    email varchar(30),
    Address VARCHAR(100), 
    Blood_Group VARChAR (3)
    );

    
-- Actor: Receptionist
-- Flow: Enter patient details (name, DOB, contact, address, blood group). 
-- System validates uniqueness by phone/email, generates patient ID, inserts record into patients table with auto-increment primary key.
Insert into Patient (Patient_Name, DOB, Phone_No,email, address, blood_group) 
values
('Titu'   ,'2003-04-13', '9827289348', 'titu@capgemini.in','Tanatan Dhaba, Nizamuddin, Bhopal','O+'),
('Arvind' , '2003-04-03', '9376338636', 'arvind@capgemini.in','Anand Nagar, Bhopal','A+'),
('Aniruddha', '2006-12-11', '9823289348', 'anni@capgemini.in','Anand Nagar, Bhopal','O+'),
('Kaif' , '2002-09025' , '9827289348', 'kaif@capgemini.in','Alam Tower, Jahagirabad, Bhopal','B+'),
('Avinash'   ,'2004-04-23', '6827289348', 'avinash@bridgelabz.in','Ratnagiri, Bhopal','A-'),
('Suraj' , '2003-08-03', '6376338636', 'suraj@bridgelabz.in','Anand Nagar, Bhopal','A+')
;

select * from Patient;
-- +------------+--------------+------------+------------+-----------------------+-----------------------------------+-------------+
-- | Patient_Id | Patient_Name | DOB        | Phone_No   | email                 | Address                           | Blood_Group |
-- +------------+--------------+------------+------------+-----------------------+-----------------------------------+-------------+
-- |          1 | Titu         | 2003-04-13 | 9827289348 | titu@capgemini.in     | Tanatan Dhaba, Nizamuddin, Bhopal | O+          |
-- |          2 | Arvind       | 2003-04-03 | 9376338999 | arvind@capgemini.in   | Anand Nagar, Bhopal               | A+          |
-- |          3 | Aniruddha    | 2006-12-11 | 9823289348 | anni@capgemini.in     | Anand Nagar, Bhopal               | O+          |
-- |          4 | Kaif         | 2002-09025 | 9827289348 | kaif@capgemini.in     | Alam Tower, Jahagirabad, Bhopal   | B+          |
-- |          5 | Avinash      | 2004-04-23 | 6827289348 | avinash@bridgelabz.in | Ratnagiri, Bhopal                 | A-          |
-- |          6 | Suraj        | 2003-08-03 | 6376338636 | suraj@bridgelabz.in   | Anand Nagar, Bhopal               | A+          |
-- +------------+--------------+------------+------------+-----------------------+-----------------------------------+-------------+

-- --------------------------------------------------------------------------------------------------------------------

-- UC-1.2: Update Patient Information
-- Actor: Receptionist
-- Flow: Search patient by ID/phone, display current details, update fields, execute SQL UPDATE with WHERE clause on patient ID.
select * from Patient 
where Patient_Id=3;
-- +------------+--------------+------------+------------+-------------------+---------------------+-------------+
-- | Patient_Id | Patient_Name | DOB        | Phone_No   | email             | Address             | Blood_Group |
-- +------------+--------------+------------+------------+-------------------+---------------------+-------------+
-- |          3 | Aniruddha    | 2006-12-11 | 9823289348 | anni@capgemini.in | Anand Nagar, Bhopal | O+          |
-- +------------+--------------+------------+------------+-------------------+---------------------+-------------+

select * from Patient 
where Phone_No='9376338636';

-- +------------+--------------+------------+------------+---------------------+---------------------+-------------+
-- | Patient_Id | Patient_Name | DOB        | Phone_No   | email               | Address             | Blood_Group |
-- +------------+--------------+------------+------------+---------------------+---------------------+-------------+
-- |          2 | Arvind       | 2003-04-03 | 9376338636 | arvind@capgemini.in | Anand Nagar, Bhopal | A+          |
-- +------------+--------------+------------+------------+---------------------+---------------------+-------------+

Update Patient
set Phone_No='9376338999'
where Patient_Id=2;

-- Query OK, 1 row affected (0.017 sec) 

-- --------------------------------------------------------------------------------------------------------------------


-- UC-1.3: Search Patient Records
-- Actor: Receptionist/Doctor
-- Flow: Query patients table using LIKE operator for name search or exact match for ID/phone. Display results using ResultSet iteration.

select Patient_Name as NAME,Phone_No
from patient 
where email LIKE '%capgemini.in';

-- +-----------+------------+
-- | NAME      | Phone_No   |
-- +-----------+------------+
-- | Titu      | 9827289348 |
-- | Arvind    | 9376338999 |
-- | Aniruddha | 9823289348 |
-- | Kaif      | 9827289348 |
-- +-----------+------------+

select Patient_Name as NAME,Phone_No, Blood_Group
from patient 
where Blood_Group LIKE '%-';

-- +---------+------------+-------------+
-- | NAME    | Phone_No   | Blood_Group |
-- +---------+------------+-------------+
-- | Avinash | 6827289348 | A-          |
-- +---------+------------+-------------+



-- --------------------------------------------------------------------------------------------------------------------


-- UC-1.4: View Patient Visit History
-- Actor: Doctor/Receptionist

-- doctor
Create Table Doctor(
	Doctor_Id INT PRIMARY KEY AUTO_INCREMENT,
    Doctor_Name VARCHAR (100) ,
    Specialization varchar(50) ,
    email VARCHAR(30)
    );
 
 insert into Doctor(Doctor_Name,Specialization,email)
 values
 ('Lucky' , 'Cardiologist','lucky@hospital.in'),
 ('Priya', 'physiologist', 'priya@hospital.in'),
 ('Rohit','dentist','rohit@staff.in'),
 ('Neha','gynologist','neha@hospital.in')
 ;
 
--  +-----------+-------------+----------------+-------------------+
-- | Doctor_Id | Doctor_Name | Specialization | email             |
-- +-----------+-------------+----------------+-------------------+
-- |         1 | Lucky       | Cardiologist   | lucky@hospital.in |
-- |         2 | Priya       | physiologist   | priya@hospital.in |
-- |         3 | Rohit       | dentist        | rohit@staff.in    |
-- |         4 | Neha        | gynologist     | neha@hospital.in  |
-- +-----------+-------------+----------------+-------------------+

-- visits
CREATE TABLE visit_record (
    visit_id INT AUTO_INCREMENT PRIMARY KEY,
    Patient_Id INT,
    Doctor_Id INT,
    visit_date DATE,
    diagnosis VARCHAR(255),
    FOREIGN KEY (Patient_Id) REFERENCES Patient(Patient_Id),
    FOREIGN KEY (Doctor_Id) REFERENCES Doctor(Doctor_Id)
);

INSERT INTO visit_record (Patient_Id, Doctor_Id, visit_date, diagnosis)
VALUES
(1, 1, '2025-02-01', 'Heart Checkup'),
(1, 2, '2025-02-05', 'Muscle Pain'),
(1, 3, '2025-02-10', 'Tooth Infection'),
(2, 4, '2025-02-03', 'Pregnancy Consultation');

-- +----------+------------+-----------+------------+------------------------+
-- | visit_id | Patient_Id | Doctor_Id | visit_date | diagnosis              |
-- +----------+------------+-----------+------------+------------------------+
-- |        1 |          1 |         1 | 2025-02-01 | Heart Checkup          |
-- |        2 |          1 |         2 | 2025-02-05 | Muscle Pain            |
-- |        3 |          1 |         3 | 2025-02-10 | Tooth Infection        |
-- |        4 |          2 |         4 | 2025-02-03 | Pregnancy Consultation |
-- +----------+------------+-----------+------------+------------------------+

-- Flow: Execute JOIN query between appointments and visits tables filtered by patient ID. Display chronological list with doctor names and diagnoses.

SELECT
    p.Patient_Name,
    v.visit_date,
    d.Doctor_Name,
    d.Specialization,
    v.diagnosis
FROM visit_record v
JOIN Patient p ON v.Patient_Id = p.Patient_Id
JOIN Doctor d ON v.Doctor_Id = d.Doctor_Id
WHERE v.Patient_Id = 1
ORDER BY v.visit_date ;
-- +--------------+------------+-------------+----------------+-----------------+
-- | Patient_Name | visit_date | Doctor_Name | Specialization | diagnosis       |
-- +--------------+------------+-------------+----------------+-----------------+
-- | Titu         | 2025-02-01 | Lucky       | Cardiologist   | Heart Checkup   |
-- | Titu         | 2025-02-05 | Priya       | physiologist   | Muscle Pain     |
-- | Titu         | 2025-02-10 | Rohit       | dentist        | Tooth Infection |
-- +--------------+------------+-------------+----------------+-----------------+
