<?php
    session_start();
    if (isset($_POST)) {
        $nama = $_POST['nama'];
        $email = $_POST['email'];
        $username = $_POST['username'];
        $password = $_POST['password'];
        if ($username == "admin" && $password == "z") {
            $_SESSION['nama'] = $nama;
            $_SESSION['email'] = $email;
            header("location: index.php");
        } else {
            session_destroy();
            header("location: index.php?error");
        }
    }
?>