<?php
    if (!empty($_POST)) {
        $gaji_pokok = $_POST['gaji_pokok'];
        $golongan = $_POST['golongan'];
        switch ($golongan) {
            case 1:
                $tunjangan = $gaji_pokok * 3.5;
                break;
            case 2:
                $tunjangan = $gaji_pokok * 2.5;
                break;
            default:
                $tunjangan = $gaji_pokok * 1.5;
                break;
        }
        $pajak = ($gaji_pokok >= 1e6) ? ($gaji_pokok * 0.5) : 0;
        $gaji_bersih = $gaji_pokok + $tunjangan - $pajak;
    }
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Praktikum 2a</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <style>
        body {
            display: grid;
            place-content: center;
        }
        form, .output {
            display: grid;
            grid-gap: 3px;
            margin: 20px;
            padding: 20px;
            border: 1px solid gray;
            border-radius: 4px;
        }
    </style>
</head>
<body>
    <form method="POST">
        <label for="gaji_pokok">Gaji Pokok: </label>
        <input id="gaji_pokok" name="gaji_pokok" placeholder="Masukkan gaji pokok" type="number">
        <label for="golongan">Golongan: </label>
        <input id="golongan" name="golongan" placeholder="Masukkan golongan" type="number">
        <input type="submit" value="Submit">
    </form>
    <?php
        if (!empty($_POST)) {
            echo "
            <div class='output'>
                <span>Gaji Pokok: $gaji_pokok</span>
                <span>Golongan: $golongan</span>
                <hr>
                <span>Besar Tunjangan: $tunjangan</span>
                <span>Pajak: $pajak</span>
                <span>Gaji Bersih: $gaji_bersih</span>
            </div>";
        }
    ?>
</body>
</html>