USE testing;

DROP TABLE wisata_indonesia;

CREATE TABLE wisata_indonesia (
    id_wisata INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    tempat_wisata VARCHAR(45) NOT NULL,
    deskripsi_wisata TEXT NOT NULL,
    FULLTEXT idx (tempat_wisata, deskripsi_wisata)
) ENGINE=InnoDB;

INSERT INTO wisata_indonesia (tempat_wisata, deskripsi_wisata) VALUES
    ("Gunung Ijen", "Gunung Ijen adalah sebuah gunung berapi yang terletak di perbatasan Kabupaten Banyuwangi dan Kabupaten Bondowoso, Jawa Timur, Indonesia."),
    ("Ranu Kumbolo", "Ranu Kumbolo adalah sebuah danau yang terletak di dalam Taman Nasional Bromo Tengger Semeru, Jawa Timur, Indonesia. Danau ini merupakan bagian dari rute termudah yang berasal dari Ranu Pani menuju puncak Gunung Semeru."),
    ("Ranu Pani", "Ranu Pani adalah objek wisata berupa danau di Desa Ranu Pani, Kecamatan Senduro, Kabupaten Lumajang, Jawa Timur."),
    ("Rambut Monte", "Rambut Monte adalah sebuah tempat di Desa Krisik, Kecamatan Gandusari, Kabupaten Blitar, kurang lebih 30 km dari Kota Blitar."),
    ("Ranu Bedali", "Ranu Bedali adalah sebuah danau di kecamatan Ranuyoso, Lumajang, Jawa Timur. dan merupa salah satu tempat wisata alami yang ada di Kabupaten Lumajang, letaknya sekitar kurang lebih 15 km di sebelah utara kota Lumajang."),
    ("Ranu Klakah", "Ranu Klakah adalah sebuah danau di kecamatan Klakah, Lumajang, Jawa Timur. Letaknya sekitar 10 km di sebelah utara kota Lumajang."),
    ("Ranu Regulo", "Ranu Regulo adalah sebuah danau yang terbentuk secara alami dengan warna air biru kehijauan. Luas Ranu Regulo kurang dari satu hektar."),
    ("Telaga Ngebel", "Telaga Ngebel adalah sebuah danau alami yang terletak di Kecamatan Ngebel, Kabupaten Ponorogo."),
    ("Telaga Sarangan", "Telaga Sarangan, juga dikenal sebagai Telaga Pasir adalah telaga alami yang berada di ketinggian 1.200 meter di atas permukaan laut dan terletak di lereng Gunung Lawu,Kecamatan Plaosan, Kabupaten Magetan, Jawa Timur."),
    ("Ranu Tompe", "Ranu Tompe adalah danau gunung yang terletak di kawasan Taman Nasional Bromo Tengger Semeru. Secara administratif daerah terletak di Kabupaten Lumajang, Jawa Timur.");

SELECT * FROM wisata_indonesia WHERE MATCH(tempat_wisata, deskripsi_wisata) AGAINST ("Kumbolo");