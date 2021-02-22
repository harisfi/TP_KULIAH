<?php
    if (!empty($_POST)) {
        $bil_max = $_POST['bil_max'];
        $total = 0;
        for ($i=1; $i <= $bil_max; $i++) { 
            $total += $i;
        }
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
        <label for="bil_max">Masukkan Bilangan Maksimum: </label>
        <input id="bil_max" name="bil_max" placeholder="Masukkan bilangan maksimum" type="number">
        <input type="submit" value="Submit">
    </form>
    <?php
        if (!empty($_POST)) {
            echo "
            <div class='output'>
                <span>Bilangan Maksimum: $bil_max</span>
                <span>Total nilai: $total</span>
            </div>";
        }
    ?>
</body>
</html>