<?php
require_once("koneksi.php");
$query = "SELECT * FROM tbl_peminjaman";
$ret = mysqli_query($con, $query);
$jum = mysqli_num_rows($ret);
?>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Tugas 8b</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
</head>
<body>
    <table border="1">
        <tr>
            <td colspan="8" style="text-align: right;">
                <button onclick="document.location='tambah.php'">Tambah Pinjam</button>
            </td>
        </tr>
        <tr>
            <td>No</td>
            <td>Judul</td>
            <td>Tanggal Pinjam</td>
            <td>Tanggal Kembali</td>
            <td>Tanggal Dikembalikan</td>
            <td>Status</td>
            <td>Denda</td>
            <td>Aksi</td>
        </tr>
        <?php
        if ($jum > 0) {
            $i = 0;
            while ($data = mysqli_fetch_row($ret)) {
                $i++;?>
                <tr>
                    <td><?= $i ?></td>
                    <td><?= $data[1] ?></td>
                    <td><?= $data[2] ?></td>
                    <td><?= $data[3] ?></td>
                    <td><?= $data[4] ?></td>
                    <td><?= $data[5] ?></td>
                    <td><?= $data[6] ?></td>
                    <td>
                        <?= ($data[5] == "pinjam") ? "<a href='kembali.php?data=$data[0]'>kembali</a>" : "" ?>
                    </td>
                </tr>
            <?php
            }
        }
        ?>
    </table>
</body>
</html>