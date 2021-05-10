<?php
if (isset($_POST['pelamar'])) {
    $re = '/([a-z\s]+)(\d+)([a-z]+)#(\d+)/m';
    $str = strtolower($_POST['pelamar']);
    
    $ret = preg_match_all($re, $str, $matches, PREG_SET_ORDER, 0);
    if ($ret && (sizeof($matches) == 1) && (sizeof($matches[0]) == 5)) {
        $matches = $matches[0];
        $matches[1] = ucwords($matches[1]);
        $matches[3] = strtoupper($matches[3]);
        $matches[4] = substr_replace($matches[4], "62", 0, 1);

        $con = mysqli_connect("127.0.0.1", "root", "", "db_tugas8");
        if (!$con) {
            die("Error in connection: ".mysqli_connect_errno());
        }

        $query = "INSERT INTO tbl_peserta(id_peserta, nama, usia, kota, hp) VALUES (NULL, '$matches[1]','$matches[2]','$matches[3]','$matches[4]')";
        $ret = mysqli_query($con, $query);
        $jum = mysqli_affected_rows($con);
        
        if ($jum > 0) {
            echo "Terima kasih. Anda berhasil mendaftar, berikut data diri anda:<br>";
            echo "Nama Anda: $matches[1]<br>";
            echo "Usia Anda: $matches[2]<br>";
            echo "Kota Anda: $matches[3]<br>";
            echo "No HP Anda: $matches[4]<br>";
        } else {
            echo "Maaf, terjadi kesalahan";
        }
    } else {
        header("Location: index.php?salah");
    }
}