<?php
$con = mysqli_connect("127.0.0.1", "root", "", "db_tugas8");
if (!$con) {
    die("Error in connection: ".mysqli_connect_errno());
}