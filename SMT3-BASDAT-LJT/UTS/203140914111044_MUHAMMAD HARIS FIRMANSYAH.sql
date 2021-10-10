-- Nama: Muhammad Haris Firmansyah
-- NIM: 203140914111044
-- Kelas: SI/3B

-- 1. Buat database beserta relasinya untuk setiap tabel seperti pada Gambar 1.
DROP DATABASE IF EXISTS db_sukamaju;
CREATE DATABASE db_sukamaju;

USE db_sukamaju;

CREATE Table stok_barang (
  id_produk INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  nama_produk VARCHAR(20) NOT NULL,
  total_stok INT NOT NULL
) ENGINE=InnoDB;

CREATE Table pembelian (
  id_pembelian INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_produk INT NOT NULL,
  total_pembelian INT,
  FOREIGN KEY (id_produk) REFERENCES stok_barang(id_produk)
) ENGINE=InnoDB;

CREATE Table penjualan (
  id_penjualan INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  id_produk INT NOT NULL,
  total_penjualan INT,
  FOREIGN KEY (id_produk) REFERENCES stok_barang(id_produk)
) ENGINE=InnoDB;

-- 2. Buat record pada tabel stok_barang seperti pada Gambar 2.
INSERT INTO stok_barang(nama_produk, total_stok) VALUES
  ('sabun', 20),
  ('shampoo', 5),
  ('pasta gigi', 10),
  ('mie instan', 20),
  ('minyak goreng', 3);

-- 3. Buat trigger sehingga total_stok di tabel stok_barang otomatis aG
--    akan bertambah setiap penambahan data baru dilakukan pada tabel pembelian.
DELIMITER //
CREATE Trigger trig_inc_total_stok
AFTER INSERT ON pembelian FOR EACH ROW
BEGIN
  UPDATE stok_barang
  SET total_stok = (
    SELECT (total_stok + NEW.total_pembelian) FROM stok_barang
    WHERE NEW.id_produk = stok_barang.id_produk
  ) WHERE NEW.id_produk = stok_barang.id_produk;
END//
DELIMITER ;

-- 4. Buat trigger sehingga total_stok di tabel stok_barang otomatis Fy
--    akan berkurang setiap penambahan data baru dilakukan pada tabel penjualan.
DELIMITER //
CREATE Trigger trig_dec_total_stok
AFTER INSERT ON penjualan FOR EACH ROW
BEGIN
  UPDATE stok_barang
  SET total_stok = (
    SELECT (total_stok - NEW.total_penjualan) FROM stok_barang
    WHERE NEW.id_produk = stok_barang.id_produk
  ) WHERE NEW.id_produk = stok_barang.id_produk;
END//
DELIMITER ;

-- 5. Buat trigger sehingga setiap dilakukan update data total_penjualan pada tabel penjualan,
--    total_stok di tabel stok_barang otomatis aX akan berubah mengikuti perubahan total_penjualan
--    pada tabel penjualan.
DELIMITER //
CREATE Trigger trig_upd_total_stok
BEFORE UPDATE ON penjualan FOR EACH ROW
BEGIN
  UPDATE stok_barang
  SET total_stok = (
    SELECT (total_stok + OLD.total_penjualan - NEW.total_penjualan) FROM stok_barang
    WHERE NEW.id_produk = stok_barang.id_produk
  ) WHERE NEW.id_produk = stok_barang.id_produk;
END//
DELIMITER ;

-- 6. Pada saat transaksi penjualan suatu barang dibatalkan, maka record pada tabel penjualan 
--    dihapus. Buat trigger sehingga pada saat record tabel penjualan dihapus, maka total_stok pada 
--    tabel stok_barang otomatis M= akan berubah.
DELIMITER //
CREATE Trigger trig_del_total_stok
BEFORE DELETE ON penjualan FOR EACH ROW
BEGIN
  UPDATE stok_barang
  SET total_stok = (
    SELECT (total_stok + OLD.total_penjualan) FROM stok_barang
    WHERE OLD.id_produk = stok_barang.id_produk
  ) WHERE OLD.id_produk = stok_barang.id_produk;
END//
DELIMITER ;

-- 7. Buat stored procedure untuk melakukan penambahan data baru setiap kolom pada tabel pembelian.
DELIMITER //
CREATE PROCEDURE proc_insert_pembelian()
BEGIN
  DECLARE int_val INT DEFAULT 0;
  looping: LOOP
    IF (int_val = 10) THEN
      LEAVE looping;
    END IF;
    INSERT INTO pembelian(id_produk, total_pembelian) VALUES (RAND() * (4)+1, RAND() * (7)+1) ;
    SET int_val = int_val + 1;
  END LOOP looping;
END//
DELIMITER ;

-- 8. Buat stored procedure untuk melakukan penambahan data baru setiap kolom pada tabel penjualan.
DELIMITER //
CREATE PROCEDURE proc_insert_penjualan()
BEGIN
  DECLARE int_val INT DEFAULT 0;
  looping: LOOP
    IF (int_val = 10) THEN
      LEAVE looping;
    END IF;
    INSERT INTO penjualan(id_produk, total_penjualan) VALUES (RAND() * (4)+1, RAND() * (7)+1) ;
    SET int_val = int_val + 1;
  END LOOP looping;
END//
DELIMITER ;

-- 9. Buat stored procedure untuk melakukan update data total_penjualan yang dilakukan
-- berdasarkan id_penjualan pada tabel penjualan.
DELIMITER //
CREATE PROCEDURE proc_upd_total_penjualan(IN par_id_penjualan INT, IN par_total_penjualan INT)
BEGIN
  UPDATE penjualan SET total_penjualan = par_total_penjualan WHERE id_penjualan = par_id_penjualan;
END//
DELIMITER ;

-- 10. Buat stored procedure untuk melakukan delete data berdasarkan id_penjualan pada tabel penjualan.
DELIMITER //
CREATE PROCEDURE proc_del_penjualan(IN par_id_penjualan INT)
BEGIN
  DELETE FROM penjualan WHERE id_penjualan = par_id_penjualan;
END//
DELIMITER ;

-- 11. Buat view pada tabel stok_barang yang berisikan id_produk, nama_produk, dan total_stok untuk 
--     semua barang dengan total_stok = 0.
CREATE View vw_zero_stock AS SELECT id_produk, nama_produk, total_stok FROM stok_barang WHERE total_stok = 0;

-- 12. Buat composite index untuk kolom nama_produk dan total_stok pada tabel stok_barang dengan 
--     tipe index BTREE.
ALTER Table stok_barang
  ADD INDEX idx_nama_produk (nama_produk) USING BTREE,
  ADD INDEX idx_total_stok (total_stok) USING BTREE;