<?php
if (isset($_POST['judul'])) {
    $judul = $_POST['judul'];
    $tgl_pinjam = date("Y-m-d");
    $tgl_kembali = date("Y-m-d", strtotime("+5 day"));

    require_once("koneksi.php");
    $query = "INSERT INTO tbl_peminjaman(id_transaksi, judul, tanggal_pinjam, tanggal_kembali, tanggal_dikembalikan, `status`, denda) VALUES(NULL, '$judul', '$tgl_pinjam', '$tgl_kembali', NULL, 'pinjam', 0)";
    $ret = mysqli_query($con, $query);
    $jum = mysqli_affected_rows($con);
    if ($jum > 0) {
        header("Location: index.php");
    } else {
        echo "Terjadi kesalahan".$query;
    }
}
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Tambah Peminjaman</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
</head>
<body>
    <form action="" method="post">
        <table border="1">
            <tr>
                <th colspan="3" align="left">Form Tambah Pinjam Buku</th>
            </tr>
            <tr>
                <td>Judul Buku</td>
                <td>:</td>
                <td>
                    <input type="text" name="judul" id="judul">
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <button type="submit">Tambah</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>