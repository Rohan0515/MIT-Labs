SET SERVEROUTPUT ON

DECLARE 
    I NUMBER;
    STRINP VARCHAR(20);
    STRREV VARCHAR(20);
BEGIN
    STRINP := '&String';
    I := (LENGTH(STRINP));
    WHILE I >= 1
    LOOP
        STRREV := CONCAT(STRREV , SUBSTR(STRINP,I,1));
    I := I - 1;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('Reverse of string is: ' || STRREV);
END;
/