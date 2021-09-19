<?php
class Database {
    private $koneksi;

    public function __construct() {
        $host = 'localhost';
        $dbname = 'katalog_buku';
        $dbuser = 'root';
        $dbpass = '';

        $opts = [
            PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION
        ];
        $dsn = "mysql:host=$host;charset=utf8;dbname=$dbname;";

        try {
            $this->koneksi = new PDO($dsn, $dbuser, $dbpass, $opts);
        } catch (PDOException $e) {
            echo "Koneksi gagal " . $e->getMessage();
        }
    }

    public function getKoneksi()
    {
        return $this->koneksi;
    }
}
?>