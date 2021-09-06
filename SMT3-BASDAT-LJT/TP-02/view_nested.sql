CREATE VIEW view1 AS
    SELECT m.nim, m.nama, m.nilai, d.nama AS nama_dosen
    FROM tbl_mahasiswa m
    JOIN tbl_dosen d ON d.id_dosen = m.id_dosen;

SELECT * FROM view1;



CREATE VIEW view2 AS SELECT * FROM view1 ORDER BY nilai DESC LIMIT 1;

SELECT * FROM view2;