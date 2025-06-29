CREATE OR REPLACE PROCEDURE TransferFunds (
    FromAccountID IN NUMBER,
    ToAccountID   IN NUMBER,
    TransferFunds IN NUMBER
) IS
    FromBalance NUMBER;
BEGIN
    SELECT Balance
    INTO FromBalance
    FROM Accounts
    WHERE AccountID = FromAccountID
    FOR UPDATE;

    IF FromBalance < TransferFunds THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in the source account.');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - TransferFunds,
        LastModified = SYSDATE
    WHERE AccountID = FromAccountID;

    UPDATE Accounts
    SET Balance = Balance + TransferFunds,
        LastModified = SYSDATE
    WHERE AccountID = ToAccountID;

    COMMIT;
END;
/
