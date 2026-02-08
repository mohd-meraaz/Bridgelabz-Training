use practice_capge;

-- Build a library management system with:
-- • Book inventory

CREATE TABLE books (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(200),
    author VARCHAR(100),
    genre VARCHAR(50),
    total_copies INT,
    available_copies INT
);

CREATE TABLE students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE borrow_records (
    record_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id INT,
    book_id INT,
    borrow_date DATE,
    due_date DATE,
    return_date DATE,
    FOREIGN KEY (student_id) REFERENCES students(student_id),
    FOREIGN KEY (book_id) REFERENCES books(book_id)
);

INSERT INTO books (title, author, genre, total_copies, available_copies)
VALUES
('Database Systems', 'Elmasri', 'Education', 5, 5),
('Harry Potter', 'J.K. Rowling', 'Fantasy', 3, 3);

INSERT INTO students (name, email)
VALUES
('Rahul', 'rahul@email.com'),
('Aisha', 'aisha@email.com');


-- • Student borrowing records
START TRANSACTION;

-- Decrease available copies
UPDATE books
SET available_copies = available_copies - 1
WHERE book_id = 1 AND available_copies > 0;

-- Insert borrow record
INSERT INTO borrow_records (student_id, book_id, borrow_date, due_date)
VALUES (1, 1, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 14 DAY));

COMMIT;


-- • Fine calculation
SELECT
    record_id,
    student_id,
    book_id,
    due_date,
    return_date,
    DATEDIFF(return_date, due_date) * 5 AS fine
FROM borrow_records
WHERE return_date > due_date;


-- • Search functionality with multiple filters
SELECT * FROM books
WHERE author = 'J.K. Rowling';
-- +---------+--------------+--------------+---------+--------------+------------------+
-- | book_id | title        | author       | genre   | total_copies | available_copies |
-- +---------+--------------+--------------+---------+--------------+------------------+
-- |       2 | Harry Potter | J.K. Rowling | Fantasy |            3 |                3 |
-- +---------+--------------+--------------+---------+--------------+------------------+

-- OR --
SELECT *
FROM books
WHERE genre = 'Fantasy'
AND author = 'J.K. Rowling';
-- +---------+--------------+--------------+---------+--------------+------------------+
-- | book_id | title        | author       | genre   | total_copies | available_copies |
-- +---------+--------------+--------------+---------+--------------+------------------+
-- |       2 | Harry Potter | J.K. Rowling | Fantasy |            3 |                3 |
-- +---------+--------------+--------------+---------+--------------+------------------+
