<?php
    $arr = array(7, 2, 3, 8, 1, 4);
    $urut = $arr;
    for ($i=0; $i < sizeof($arr); $i++) {
        for ($j = $i + 1; $j < sizeof($arr); $j++) {
            if ($urut[$i] > $urut[$j]) {
                $tmp = $urut[$i];
                $urut[$i] = $urut[$j];
                $urut[$j] = $tmp;
            }
        }
    }
    echo "Nilai Array: ";
    foreach ($arr as $arr) echo $arr." ";
    echo "<br>Data Terurut: ";
    foreach ($urut as $u) echo $u." ";
?>