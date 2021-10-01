DROP Table IF EXISTS tbl_mobil;

CREATE Table tbl_mobil (
    id INT,
    nama VARCHAR(255),
    tahun INT,
    transmisi INT
)
-- PARTITION BY RANGE (tahun) (
--     PARTITION p0 VALUES LESS THAN (2019),
--     PARTITION p1 VALUES LESS THAN (2020),
--     PARTITION p2 VALUES LESS THAN MAXVALUE
-- );
-- PARTITION BY LIST (id) (
--     PARTITION Toyota VALUES IN (1, 4, 7, 10),
--     PARTITION Daihatsu VALUES IN (2, 5),
--     PARTITION Honda VALUES IN (3, 6),
--     PARTITION Mitsubishi VALUES IN (8, 9)
-- );
-- PARTITION BY HASH (tahun) PARTITIONS 3;

INSERT INTO tbl_mobil VALUES 
    (1, 'Avanza', 2017, 0),
    (2, 'Terios', 2017, 0),
    (3, 'Jazz', 2018, 0),
    (4, 'Fortuner', 2018, 0),
    (5, 'Ayla', 2019, 0),
    (6, 'Brio', 2019, 0),
    (7, 'Alphard', 2020, 1),
    (8, 'Pajero Sport', 2020, 0),
    (9, 'Xpander', 2021, 1),
    (10, 'Supra', 2021, 1);

SELECT PARTITION_NAME, PARTITION_METHOD, PARTITION_DESCRIPTION, TABLE_ROWS FROM INFORMATION_SCHEMA.PARTITIONS WHERE TABLE_SCHEMA = 'testing' AND TABLE_NAME = 'tbl_mobil';