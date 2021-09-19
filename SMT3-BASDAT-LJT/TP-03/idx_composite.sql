USE db_bimbingan;

CREATE INDEX max_mhs ON tbl_dosen(nama, jumlah_mahasiswa);

ANALYZE SELECT nama, jumlah_mahasiswa FROM tbl_dosen WHERE jumlah_mahasiswa > 1;