ALTER TABLE Customers ADD IsVIP VARCHAR2(5);

DECLARE
    v_status VARCHAR2(5);
BEGIN
    FOR cust IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust.Balance > 10000 THEN
            v_status := 'TRUE';
        ELSE
            v_status := 'FALSE';
        END IF;

        UPDATE Customers
        SET IsVIP = v_status
        WHERE CustomerID = cust.CustomerID;
    END LOOP;

    COMMIT;
END;
/
