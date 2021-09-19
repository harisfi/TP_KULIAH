<?php
class Penerbit {
    private $db;

    public function __construct() {
        $this->db = new Database();
        $this->db = $this->db->getKoneksi();
    }

    public function index()
    {
        $penerbit = $this->db->prepare("SELECT * FROM penerbit ORDER BY penerbit");

        $penerbit->execute();
        $data = $penerbit->fetchAll();

        return $data;
    }

    public function store($nama, $alamat)
    {
        $penerbit = $this->db->prepare("INSERT INTO penerbit (penerbit, alamat) VALUES (?, ?)");

        $penerbit->bindParam(1, $nama);
        $penerbit->bindParam(2, $alamat);
        $penerbit->execute();

        return $penerbit;
    }

    public function show($id)
    {
        $penerbit = $this->db->prepare("SELECT * FROM penerbit WHERE id_penerbit = ?");

        $penerbit->bindParam(1, $id);
        $penerbit->execute();

        return $penerbit->fetch();
    }

    public function update($id, $nama, $alamat)
    {
        $penerbit = $this->db->prepare("UPDATE penerbit SET penerbit = ?, alamat = ? WHERE id_penerbit = ?");

        $penerbit->bindParam(1, $nama);
        $penerbit->bindParam(2, $alamat);
        $penerbit->bindParam(3, $id);
        $penerbit->execute();

        return $penerbit;
    }

    public function destroy($id)
    {
        $penerbit = $this->db->prepare("DELETE FROM penerbit WHERE id_penerbit = ?");

        $penerbit->bindParam(1, $id);
        $penerbit->execute();

        return $penerbit;
    }
}
?>