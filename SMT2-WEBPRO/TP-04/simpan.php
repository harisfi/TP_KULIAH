<?php
require_once("koneksi.php");
session_start();

if (isset($_POST['nama']) && isset($_POST['email'])) {
    $nama = htmlentities($_POST['nama']);
    $email = htmlentities($_POST['email']);
    $username = htmlentities($_SESSION['username']);

    $source = $_FILES['foto']['tmp_name'];
    $filename = $_FILES['foto']['name'];
    $ext = pathinfo($filename, PATHINFO_EXTENSION);
    $newname = uniqid().'-'.time().'.'.$ext;
    $dest = 'foto/'.$newname;
    
    if (move_uploaded_file($source, $dest)) {
        $query = "UPDATE tbl_user SET nama = '$nama', email = '$email', foto = '$newname' WHERE username = '$username'";
        $ret = mysqli_query($con, $query);
        if ($ret) {
            $_SESSION['nama'] = $nama;
            $_SESSION['email'] = $email;
            $_SESSION['foto'] = $newname;
            header("location: index.php");
        } else {
            echo "gagal " . mysqli_errno($con);
        }
    } else {
        echo "Foto Gagal diupload";
    }
}
