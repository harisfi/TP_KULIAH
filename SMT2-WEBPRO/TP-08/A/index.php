<?php
if (isset($_GET['salah'])) {?>
    <script>
        alert("Maaf, format data pelamar salah")
    </script>
<?php } ?>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Tugas 8a</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
</head>
<body>
    <form action="konfirmasi_daftar.php" method="post">
        <label for="pelamar">Data Pelamar:</label>
        <input type="text" name="pelamar" id="pelamar" value="muhammad haris firmansyah19sidoarjo#085707881672">
        <br>
        <button type="submit">Daftar</button>
    </form>
</body>
</html>