CREATE DATABASE AppointmentScheduling;

USE AppointmentScheduling;

CREATE TABLE Patient (
	Patient_Id INT PRIMARY KEY AUTO_INCREMENT,
    Patient_Name VARCHAR (100) ,
    DOB Varchar(20),
    Phone_No varchar(15) ,
    email varchar(30),
    Address VARCHAR(100), 
    Blood_Group VARChAR (3)
    );

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
-- |          2 | Arvind       | 2003-04-03 | 9376338636 | arvind@capgemini.in   | Anand Nagar, Bhopal               | A+          |
-- |          3 | Aniruddha    | 2006-12-11 | 9823289348 | anni@capgemini.in     | Anand Nagar, Bhopal               | O+          |
-- |          4 | Kaif         | 2002-09025 | 9827289348 | kaif@capgemini.in     | Alam Tower, Jahagirabad, Bhopal   | B+          |
-- |          5 | Avinash      | 2004-04-23 | 6827289348 | avinash@bridgelabz.in | Ratnagiri, Bhopal                 | A-          |
-- |          6 | Suraj        | 2003-08-03 | 6376338636 | suraj@bridgelabz.in   | Anand Nagar, Bhopal               | A+          |
-- +------------+--------------+------------+------------+-----------------------+-----------------------------------+-------------+

Create Table Doctor(
	Doctor_Id INT PRIMARY KEY AUTO_INCREMENT,
    Doctor_Name VARCHAR (100) ,
    Specialization VARCHAR (100) ,
    email VARCHAR(30),
    STATUS VARCHAR(30)
    );

INSERT INTO Doctor (Doctor_Name, Specialization, Email, Status)
VALUES
('Dr. Amit Sharma', 'Cardiologist', 'amit.sharma@hospital.in', 'Active'),
('Dr. Neha Verma', 'Dentist', 'neha.verma@hospital.in', 'Inactive'),
('Dr. Rajesh Patel', 'General Physician', 'rajesh.patel@hospital.in', 'Active'),
('Dr. Priya Nair', 'Cardiologist', 'priya.nair@hospital.in', 'Active'),
('Dr. Vikram Singh', 'Neurologist', 'vikram.singh@hospital.in', 'Active'),
('Dr. Anjali Mehta', 'Dentist', 'anjali.mehta@hospital.in', 'Inactive'),
('Dr. Sneha Iyer', 'Gynecologist', 'sneha.iyer@hospital.in', 'Inactive'),
('Dr. Karan Malhotra', 'Cardiologist', 'karan.malhotra@hospital.in', 'Active'),
('Dr. Pooja Desai', 'Dentist', 'pooja.desai@hospital.in', 'Active'),
('Dr. Rohit Gupta', 'General Physician', 'rohit.gupta@hospital.in', 'Active');

select * from Doctor;
-- +-----------+--------------------+-------------------+----------------------------+----------+
-- | Doctor_Id | Doctor_Name        | Specialization    | email                      | STATUS   |
-- +-----------+--------------------+-------------------+----------------------------+----------+
-- |         1 | Dr. Amit Sharma    | Cardiologist      | amit.sharma@hospital.in    | Active   |
-- |         2 | Dr. Neha Verma     | Dentist           | neha.verma@hospital.in     | Inactive |
-- |         3 | Dr. Rajesh Patel   | General Physician | rajesh.patel@hospital.in   | Active   |
-- |         4 | Dr. Priya Nair     | Cardiologist      | priya.nair@hospital.in     | Active   |
-- |         5 | Dr. Vikram Singh   | Neurologist       | vikram.singh@hospital.in   | Active   |
-- |         6 | Dr. Anjali Mehta   | Dentist           | anjali.mehta@hospital.in   | Inactive |
-- |         7 | Dr. Sneha Iyer     | Gynecologist      | sneha.iyer@hospital.in     | Inactive |
-- |         8 | Dr. Karan Malhotra | Cardiologist      | karan.malhotra@hospital.in | Active   |
-- |         9 | Dr. Pooja Desai    | Dentist           | pooja.desai@hospital.in    | Active   |
-- |        10 | Dr. Rohit Gupta    | General Physician | rohit.gupta@hospital.in    | Active   |
-- +-----------+--------------------+-------------------+----------------------------+----------+

-- 3. Appointment Scheduling
-- UC-3.1: Book New Appointment
drop table if exists Appointments;
CREATE TABLE Appointments (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    Doctor_Id INT,
    Patient_Id INT,
    appointment_date DATE,
    appointmentStatus Varchar (100),
    FOREIGN KEY (Doctor_Id) REFERENCES Doctor(Doctor_Id),
    FOREIGN KEY (Patient_Id) REFERENCES Patient(Patient_Id)
);



-- Actor: Receptionist
-- Flow: Select patient and doctor, check availability using SELECT with date/time constraints.  Use PreparedStatement to prevent SQL injection.
SELECT 
    p.Patient_Name,
    d.Doctor_Name,
    CASE
        WHEN d.Status = 'Active' THEN 'Available'
        ELSE 'Unavailable'
    END AS Availability
FROM Patient p
JOIN Doctor d
ON d.Doctor_Id = 1
WHERE p.Patient_Id = 1;

-- +--------------+-----------------+--------------+
-- | Patient_Name | Doctor_Name     | Availability |
-- +--------------+-----------------+--------------+
-- | Titu         | Dr. Amit Sharma | Available    |
-- +--------------+-----------------+--------------+

-- ~ Insert into appointments table with status='SCHEDULED'.
INSERT INTO Appointments (doctor_id, patient_id, appointment_date,appointmentStatus)
VALUES
(1, 3, '2026-02-20','Scheduled'),   -- future appointment
(1, 2, '2026-02-20','Scheduled'),   -- future appointment
(1, 4, '2026-02-20','Scheduled'),   -- future appointment
(2, 1, '2025-01-10','Completed'),   -- past appointment
(2, 4, '2025-01-10','Completed'),   -- past appointment
(3, 2, '2025-01-10','Completed');   -- past appointment
       
       
       
-- UC-3.2: Check Doctor Availability
-- Actor: Receptionist
-- Flow: Query appointments table with WHERE clause for doctor_id and date. Use GROUP BY and COUNT to show slot-wise bookings against max capacity.

SELECT 
    d.Doctor_Name,
    a.appointment_date
FROM Doctor d
JOIN Appointments a
ON d.Doctor_Id = a.doctor_id
WHERE a.doctor_id = 1
AND a.appointmentStatus = 'SCHEDULED'
GROUP BY  d.Doctor_Name, a.appointment_date;

-- +-----------------+------------------+
-- | Doctor_Name     | appointment_date |
-- +-----------------+------------------+
-- | Dr. Amit Sharma | 2026-02-20       |
-- +-----------------+------------------+


-- UC-3.3: Cancel Appointment
-- Actor: Receptionist/Patient
-- Flow: Update appointment status to 'CANCELLED' using UPDATE statement. Execute within transaction to log cancellation in appointment_audit table.
Start TRANSACTION;
Update Appointments
SET appointmentStatus = 'CALCELLED'
Where appointment_id = 2;
COMMIT;

-- UC-3.4: Reschedule Appointment
-- Actor: Receptionist
-- Flow: Verify new slot availability, update appointment date/time and doctor_id if needed. Use transaction with ROLLBACK capability if conflicts detected.

START TRANSACTION;

UPDATE Appointments
SET 
    Doctor_Id = 2,
    appointment_date = '2026-02-20'
WHERE appointment_id = 3
AND (
    SELECT COUNT(*)
    FROM Appointments
    WHERE Doctor_Id = 2
    AND appointment_date = '2026-02-20'
    AND appointmentStatus = 'SCHEDULED'
) < 5;

COMMIT;


-- UC-3.5: View Daily Appointment Schedule
-- Actor: Doctor/Receptionist
-- Flow: Execute multi-table JOIN (appointments, patients, doctors) filtered by date. Order by appointment_time using ORDER BY clause.

SELECT
    p.Patient_Name,
    d.Doctor_Name,
    a.appointment_date
FROM Appointments a
JOIN Patient p
ON a.Patient_Id = p.Patient_Id
JOIN Doctor d
ON a.Doctor_Id = d.Doctor_Id
ORDER BY a.appointment_date;
  
-- +--------------+------------------+------------------+
-- | Patient_Name | Doctor_Name      | appointment_date |
-- +--------------+------------------+------------------+
-- | Titu         | Dr. Neha Verma   | 2025-01-10       |
-- | Kaif         | Dr. Neha Verma   | 2025-01-10       |
-- | Arvind       | Dr. Rajesh Patel | 2025-01-10       |
-- | Titu         | Dr. Neha Verma   | 2025-01-10       |
-- | Kaif         | Dr. Neha Verma   | 2025-01-10       |
-- | Arvind       | Dr. Rajesh Patel | 2025-01-10       |
-- | Aniruddha    | Dr. Amit Sharma  | 2026-02-20       |
-- | Arvind       | Dr. Amit Sharma  | 2026-02-20       |
-- | Kaif         | Dr. Amit Sharma  | 2026-02-20       |
-- | Aniruddha    | Dr. Amit Sharma  | 2026-02-20       |
-- | Arvind       | Dr. Amit Sharma  | 2026-02-20       |
-- | Kaif         | Dr. Amit Sharma  | 2026-02-20       |
-- +--------------+------------------+------------------+
