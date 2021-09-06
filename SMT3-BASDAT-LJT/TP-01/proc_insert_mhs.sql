DELIMITER //
CREATE PROCEDURE insert_mhs(IN nama varchar(255), IN id_dosen int)
BEGIN
    INSERT INTO tbl_mahasiswa VALUES (NULL, nama, id_dosen);
END
DELIMITER ;