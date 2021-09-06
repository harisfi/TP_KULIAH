DELIMITER //
CREATE FUNCTION nilai_mahasiswa(nilai INT)
RETURNS VARCHAR(45) DETERMINISTIC
BEGIN
    DECLARE nilai2 VARCHAR(45);
    SELECT 
        (CASE
            WHEN nilai > 82 AND nilai < 101 THEN 'A'
            WHEN nilai > 75 AND nilai < 81 THEN 'B+'
            WHEN nilai > 69 AND nilai < 76 THEN 'B'
            WHEN nilai > 60 AND nilai < 70 THEN 'C+'
            WHEN nilai > 55 AND nilai < 61 THEN 'C'
            WHEN nilai > 50 AND nilai < 56 THEN 'D+'
            WHEN nilai > 44 AND nilai < 51 THEN 'D'
            ELSE 'E'
        END)
    INTO nilai2;
    RETURN nilai2;
END //
DELIMITER ;

SELECT nim, nama, nilai_mahasiswa(nilai) AS 'nilai' FROM tbl_mahasiswa;