<?php
if (!isset($_GET['data'])) {
    header("Location: index.php");
}
$data_id = $_GET['data'];

if (isset($_POST['status'])) {
    $status = $_POST['status'];
    if ($status == "kembali") {
        require_once("koneksi.php");
        $query = "SELECT tanggal_kembali FROM tbl_peminjaman WHERE id_transaksi = '$data_id'";
        $ret = mysqli_query($con, $query);
        $jum = mysqli_num_rows($ret);
        if ($jum > 0) {
            $data = mysqli_fetch_row($ret);
            $tgl_kembali = date_create($data[0]);
            $tgl_dikembalikan = date_create('now');
            $selisih = date_diff($tgl_kembali, $tgl_dikembalikan);
            $tgl_dikembalikan = $tgl_dikembalikan->format("Y-m-d");
            if ($selisih->format("%R") == "+") {
                $denda = $selisih->format("%a") * 1000;
                $query = "UPDATE tbl_peminjaman SET tanggal_dikembalikan = '$tgl_dikembalikan', `status` = '$status', denda = $denda WHERE id_transaksi = $data_id";
                $ret = mysqli_query($con, $query);
                $jum = mysqli_affected_rows($con);
                if ($jum > 0) {
                    header("Location: index.php");
                } else {
                    echo "Terjadi kesalahan 1";
                }
            } else {
                $query = "UPDATE tbl_peminjaman SET tanggal_dikembalikan = '$tgl_dikembalikan', `status` = '$status' WHERE id_transaksi = $data_id";
                $ret = mysqli_query($con, $query);
                $jum = mysqli_affected_rows($con);
                if ($jum > 0) {
                    header("Location: index.php");
                } else {
                    echo "Terjadi kesalahan 2".$query;
                }
            }
        } else {
            echo "Terjadi kesalahan 3";
        }
    }
}
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Kembali Buku</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
</head>
<body>
    <form action="" method="post">
        <table border="1">
            <tr>
                <th colspan="3" align="left">Form Kembali Buku</th>
            </tr>
            <tr>
                <td>Status</td>
                <td>:</td>
                <td>
                    <select name="status" id="status">
                        <option value="kembali">Kembali</option>
                        <option value="pinjam">Pinjam</option>
                    </select>
                    <input type="hidden" name="data" value="<?= $data_id ?>">
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <button type="submit">Simpan</button>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>