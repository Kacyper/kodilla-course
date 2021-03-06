USE KODILLA_COURSE;

CREATE TABLE STATS
(
    STAT_ID INT(11) AUTO_INCREMENT,
    STAT_DATE DATETIME NOT NULL,
    STAT VARCHAR (20) NOT NULL,
    VALUE INT (11) NOT NULL,
    PRIMARY KEY (STAT_ID)
);

CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(*) AS BESTSELLERS
FROM BOOKS
WHERE BESTSELLER = 1;

DELIMITER $$

CREATE EVENT UPDATE_BESTSELLER_COUNT
    ON SCHEDULE EVERY 1 MINUTE
    DO
BEGIN
CALL UpdateBestsellers();
INSERT INTO STATS (STAT_DATE, STAT, VALUE) VALUES (CURDATE(), 'BESTSELLERS', (SELECT * FROM BESTSELLERS_COUNT));
COMMIT;
end $$

DELIMITER ;

DROP EVENT UPDATE_BESTSELLER_COUNT;