<?php
    $roti = array("Bluder", "Donat");
    $text = "Harga dari roti %s adalah %d<br>";

    for ($i=0; $i < sizeof($roti); $i++) { 
        $harga = ($roti[$i] == "Bluder") ? 10000 : 8000;
        printf($text, $roti[$i], $harga);
    }
?>