CREATE OR REPLACE PROCEDURE disp IS
BEGIN 
    DBMS_OUTPUT.PUT_LINE('Good day to you.');
END;
/

BEGIN
    disp;
END;
/