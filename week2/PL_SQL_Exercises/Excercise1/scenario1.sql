BEGIN
    UPDATE Accounts
    SET InterestRate = InterestRate - 1
    WHERE CustomerID IN (
        SELECT CustomerID
        FROM Customers
        WHERE FLOOR(MONTHS_BETWEEN(SYSDATE, DOB) / 12) > 60
    );
END;