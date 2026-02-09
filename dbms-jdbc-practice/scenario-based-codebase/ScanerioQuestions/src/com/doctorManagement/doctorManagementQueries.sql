-- 2. Doctor Management
-- UC-2.1: Add Doctor Profile
-- Actor: Administrator
-- Flow: Input doctor details (name, specialization, contact, consultation fee). Insert INTo doctors table with foreign key reference to specialties table.
CREATE DATABASE DoctorManagement;


CREATE TABLE Specialties(
Specialization_Id INT PRIMARY KEY AUTO_INCREMENT,
Specialization_Name VARCHAR(30));

Create Table Doctor(
	Doctor_Id INT PRIMARY KEY AUTO_INCREMENT,
    Doctor_Name VARCHAR (100) ,
    Specialization INT(30) ,
    email VARCHAR(30),
    STATUS VARCHAR(30),
    FOREIGN KEY(Specialization) REFERENCES Specialties(Specialization_Id)
    );

INSERT INTO Specialties (Specialization_Name)
VALUES
('Cardiologist'),
('Dentist'),
('Orthopedic'),
('Pediatrician'),
('Neurologist'),
('Dermatologist'),
('Gynecologist'),
('ENT Specialist'),
('General Physician'),
('Psychiatrist');

SELECT * FROM Specialties;
-- +-------------------+---------------------+
-- | Specialization_Id | Specialization_Name |
-- +-------------------+---------------------+
-- |                 1 | Cardiologist        |
-- |                 2 | Dentist             |
-- |                 3 | Orthopedic          |
-- |                 4 | Pediatrician        |
-- |                 5 | Neurologist         |
-- |                 6 | Dermatologist       |
-- |                 7 | Gynecologist        |
-- |                 8 | ENT Specialist      |
-- |                 9 | General Physician   |
-- |                10 | Psychiatrist        |
-- +-------------------+---------------------+

INSERT INTO Doctor (Doctor_Name, Specialization, Email, Status)
VALUES
('Dr. Amit Sharma', 1, 'amit.sharma@hospital.in', 'Active'),
('Dr. Neha Verma', 2, 'neha.verma@hospital.in', 'Inactive'),
('Dr. Rajesh Patel', 3, 'rajesh.patel@hospital.in', 'Active'),
('Dr. Priya Nair', 4, 'priya.nair@hospital.in', 'Active'),
('Dr. Vikram Singh', 5, 'vikram.singh@hospital.in', 'Active'),
('Dr. Anjali Mehta', 6, 'anjali.mehta@hospital.in', 'Inactive'),
('Dr. Sneha Iyer', 7, 'sneha.iyer@hospital.in', 'Inactive'),
('Dr. Karan Malhotra', 8, 'karan.malhotra@hospital.in', 'Active'),
('Dr. Pooja Desai', 9, 'pooja.desai@hospital.in', 'Active'),
('Dr. Rohit Gupta', 10, 'rohit.gupta@hospital.in', 'Active');

SELECT * FROM Doctor;
-- +-----------+--------------------+----------------+----------------------------+----------+
-- | Doctor_Id | Doctor_Name        | Specialization | Email                      | Status   |
-- +-----------+--------------------+----------------+----------------------------+----------+
-- |         1 | Dr. Amit Sharma    |              1 | amit.sharma@hospital.in    | Active   |
-- |         2 | Dr. Neha Verma     |              2 | neha.verma@hospital.in     | Inactive |
-- |         3 | Dr. Rajesh Patel   |              3 | rajesh.patel@hospital.in   | Active   |
-- |         4 | Dr. Priya Nair     |              4 | priya.nair@hospital.in     | Active   |
-- |         5 | Dr. Vikram Singh   |              5 | vikram.singh@hospital.in   | Active   |
-- |         6 | Dr. Anjali Mehta   |              6 | anjali.mehta@hospital.in   | Inactive |
-- |         7 | Dr. Sneha Iyer     |              7 | sneha.iyer@hospital.in     | Inactive |
-- |         8 | Dr. Karan Malhotra |              8 | karan.malhotra@hospital.in | Active   |
-- |         9 | Dr. Pooja Desai    |              9 | pooja.desai@hospital.in    | Active   |
-- |        10 | Dr. Rohit Gupta    |             10 | rohit.gupta@hospital.in    | Active   |
-- +-----------+--------------------+----------------+----------------------------+----------+

-- ------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- UC-2.2: Assign/UPDATE Doctor Specialty
-- Actor: Administrator
-- Flow: Display available specialties FROM lookup table, UPDATE doctor's specialty_id using UPDATE statement with transaction to maINTain referential INTegrity.

SELECT s.Specialization_Name
FROM Specialties s
JOIN Doctor d
ON d.Specialization = s.Specialization_Id;

-- +---------------------+
-- | Specialization_Name |
-- +---------------------+
-- | Cardiologist        |
-- | Dentist             |
-- | Orthopedic          |
-- | Pediatrician        |
-- | Neurologist         |
-- | Dermatologist       |
-- | Gynecologist        |
-- | ENT Specialist      |
-- | General Physician   |
-- | Psychiatrist        |
-- +---------------------+

UPDATE Doctor
SET Specialization = 4 
WHERE Doctor_Id = 8;

-- Query OK, 1 row affected (0.066 sec)
-- Rows matched: 1  Changed: 1  Warnings: 0



-- ------------------------------------------------------------------------------------------------------------------------------------------------------------------------



-- UC-2.3: View Doctors by Specialty
-- Actor: Receptionist
-- Flow: Execute JOIN query between doctors and specialties tables, filter by specialty name. Display available doctors with their schedules.

SELECT d.Doctor_Name , 
	d.Status  , 
	s.Specialization_Name
    FROM Doctor d 
    JOIN Specialties s
    ON d.Specialization = s.Specialization_Id
    ORDER BY Specialization_Name;

-- +--------------------+----------+---------------------+
-- | Doctor_Name        | Status   | Specialization_Name |
-- +--------------------+----------+---------------------+
-- | Dr. Amit Sharma    | Active   | Cardiologist        |
-- | Dr. Neha Verma     | Inactive | Dentist             |
-- | Dr. Anjali Mehta   | Inactive | Dermatologist       |
-- | Dr. Pooja Desai    | Active   | General Physician   |
-- | Dr. Sneha Iyer     | Inactive | Gynecologist        |
-- | Dr. Vikram Singh   | Active   | Neurologist         |
-- | Dr. Rajesh Patel   | Active   | Orthopedic          |
-- | Dr. Priya Nair     | Active   | Pediatrician        |
-- | Dr. Karan Malhotra | Active   | Pediatrician        |
-- | Dr. Rohit Gupta    | Active   | Psychiatrist        |
-- +--------------------+----------+---------------------+

-- ------------------------------------------------------------------------------------------------------------------------------------------------------------------------


-- UC-2.4: Deactivate Doctor Profile
-- Actor: Administrator
-- Flow: Soft delete using UPDATE to SET is_active=false in doctors table. Check for future appoINTments using nested SELECT before deactivation.

CREATE TABLE AppoINTments (
    appoINTment_id INT AUTO_INCREMENT PRIMARY KEY,
    doctor_id INT,
    patient_name VARCHAR(100),
    appoINTment_date DATE,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(Doctor_Id)
);

INSERT INTO AppoINTments (doctor_id, patient_name, appoINTment_date)
VALUES
(1, 'Rahul', '2026-02-20'),   -- future appoINTment
(2, 'Sneha', '2025-01-10');   -- past appoINTment

SELECT * FROM AppoINTments;

-- +----------------+-----------+--------------+------------------+
-- | appoINTment_id | doctor_id | patient_name | appoINTment_date |
-- +----------------+-----------+--------------+------------------+
-- |              1 |         1 | Rahul        | 2026-02-20       |
-- |              2 |         2 | Sneha        | 2025-01-10       |
-- +----------------+-----------+--------------+------------------+

-- Updating the status of doctor 1 -- with future appoINTment

UPDATE Doctor
SET Status = 'Inactive'
WHERE Doctor_Id = 1
AND Doctor_Id NOT IN (
    SELECT doctor_id
    FROM AppoINTments
    WHERE appoINTment_date > CURDATE()
);

-- Updating the status of doctor 2 -- with future appoINTment
UPDATE Doctor
SET Status = 'Inactive'
WHERE Doctor_Id = 2
AND Doctor_Id NOT IN (
    SELECT doctor_id
    FROM AppoINTments
    WHERE appoINTment_date > CURDATE()
);

SELECT * FROM Doctor;
-- +-----------+--------------------+----------------+----------------------------+----------+
-- | Doctor_Id | Doctor_Name        | Specialization | email                      | Status   |
-- +-----------+--------------------+----------------+----------------------------+----------+
-- |         1 | Dr. Amit Sharma    |              1 | amit.sharma@hospital.in    | Active   |
-- |         2 | Dr. Neha Verma     |              2 | neha.verma@hospital.in     | Inactive |
-- |         3 | Dr. Rajesh Patel   |              3 | rajesh.patel@hospital.in   | Active   |
-- |         4 | Dr. Priya Nair     |              4 | priya.nair@hospital.in     | Active   |
-- |         5 | Dr. Vikram Singh   |              5 | vikram.singh@hospital.in   | Active   |
-- |         6 | Dr. Anjali Mehta   |              6 | anjali.mehta@hospital.in   | Inactive |
-- |         7 | Dr. Sneha Iyer     |              7 | sneha.iyer@hospital.in     | Inactive |
-- |         8 | Dr. Karan Malhotra |              4 | karan.malhotra@hospital.in | Active   |
-- |         9 | Dr. Pooja Desai    |              9 | pooja.desai@hospital.in    | Active   |
-- |        10 | Dr. Rohit Gupta    |             10 | rohit.gupta@hospital.in    | Active   |
-- +-----------+--------------------+----------------+----------------------------+----------+