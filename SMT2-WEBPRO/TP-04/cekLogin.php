<?php
    require_once("koneksi.php");
    session_start();
    if (isset($_POST)) {
        $username = $_POST['username'];
        $password = $_POST['password'];
        $query = "SELECT nama, email, foto FROM tbl_user WHERE username = '$username' AND password = '$password'";
        $ret = mysqli_query($con, $query);
        $jum = mysqli_num_rows($ret);

        if ($jum > 0) {
            $data = mysqli_fetch_row($ret);
            $_SESSION['nama'] = $data[0];
            $_SESSION['email'] = $data[1];
            $_SESSION['foto'] = $data[2];
            $_SESSION['username'] = $username;
            header("location: index.php");
        } else {
            session_destroy();
            header("location: index.php?error");
        }
    }
?>