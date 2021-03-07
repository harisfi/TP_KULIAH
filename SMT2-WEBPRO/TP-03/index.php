<!DOCTYPE html>
<html>

<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Latihan 8</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/semantic-ui@2.4.2/dist/semantic.min.js"></script>
    <style>
        body {
            display: grid;
            align-content: center;
            background-color: mintcream;
        }
    </style>
</head>
<?php
    session_start();
    if (!empty($_SESSION['nama']) && !empty($_SESSION['email'])) {
        include("profil.php");
    } else {
        session_destroy();
        include("form.php");
    }
?>
</html>