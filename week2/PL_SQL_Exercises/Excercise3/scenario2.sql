CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    Dept IN VARCHAR2,
    Bonus IN NUMBER 
) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * Bonus / 100)
    WHERE Department = Dept;
    COMMIT;
END;
/
