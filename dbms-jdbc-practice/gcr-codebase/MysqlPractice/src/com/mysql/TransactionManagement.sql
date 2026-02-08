use practice_capge;

CREATE TABLE accounts (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    account_name VARCHAR(100),
    balance DECIMAL(10,2) NOT NULL
);

CREATE TABLE transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    from_account INT,
    to_account INT,
    amount DECIMAL(10,2),
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (from_account) REFERENCES accounts(account_id),
    FOREIGN KEY (to_account) REFERENCES accounts(account_id)
);

INSERT INTO accounts (account_name, balance)
VALUES 
('Lucky', 90000000.00),
('Ramrudra', 1000000.00),
('Arvind', 40000.00),
('Titu', 50000.00);



-- Implement a banking system with:
-- • Transfer money between accounts (use transactions)
START TRANSACTION;

-- Deduct from sender
UPDATE accounts
SET balance = balance - 200
WHERE account_id = 1;

-- Add to receiver
UPDATE accounts
SET balance = balance + 200
WHERE account_id = 2;

-- Record transaction
INSERT INTO transactions (from_account, to_account, amount)
VALUES (1, 2, 200);

COMMIT;

-- • Check balance
SELECT account_name, balance FROM accounts WHERE account_id = 1;
-- +--------------+-------------+
-- | account_name | balance     |
-- +--------------+-------------+
-- | Lucky        | 90000000.00 |
-- +--------------+-------------+

-- • Transaction history
SELECT 
    t.transaction_id,
    a1.account_name AS sender,
    a2.account_name AS receiver,
    t.amount,
    t.transaction_date
FROM transactions t
JOIN accounts a1 ON t.from_account = a1.account_id
JOIN accounts a2 ON t.to_account = a2.account_id
ORDER BY t.transaction_date DESC;
