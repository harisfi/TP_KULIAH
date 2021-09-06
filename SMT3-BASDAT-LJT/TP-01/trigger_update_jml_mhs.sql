DELIMITER //
CREATE TRIGGER update_jml_mhs
AFTER INSERT ON tbl_mahasiswa FOR EACH ROW
BEGIN
    UPDATE tbl_dosen
    SET jumlah_mahasiswa = (
        SELECT COUNT(NEW.id_dosen) FROM tbl_mahasiswa
        WHERE tbl_dosen.id_dosen = tbl_mahasiswa.id_dosen
    );
END//
DELIMITER ;