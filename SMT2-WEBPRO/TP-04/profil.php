<?php
if (isset($_GET['logout'])) {
    session_destroy();
    header("Refresh:0");
} else if (isset($_GET['home'])) {
    header("location: index.php");
} else {
    $nama = htmlentities($_SESSION['nama']);
    $email = htmlentities($_SESSION['email']);
    $foto = htmlentities($_SESSION['foto']);
    $username = htmlentities($_SESSION['username']);
}
?>

<body>
    <div class="ui one column grid container">
        <div class="column">
            <div class="ui grid" style="margin-top: 8px;">
                <div class="three column row">
                    <div class="column">
                        <form method="GET">
                            <input name="home" value="1" hidden>
                            <button class="ui fluid button" type="submit">Home</button>
                        </form>
                    </div>
                    <div class="column">
                        <form method="GET">
                            <input name="edit" value="1" hidden>
                            <button class="ui fluid button" type="submit">Edit Profil</button>
                        </form>
                    </div>
                    <div class="column">
                        <form method="GET">
                            <input name="logout" value="1" hidden>
                            <button class="ui red fluid button" type="submit">Logout</button>
                        </form>
                    </div>
                </div>
            </div>
            <div class="ui segment">
                <?php
                if (isset($_GET['edit'])) {
                    echo "<div class='center aligned ui huge header'>Edit Profil</div>";
                } else {
                    echo "<div class='center aligned ui huge header'>Selamat Datang!</div>";
                }
                ?>
                <div class="ui grid">
                    <?php
                    if (isset($_GET['edit'])) {
                        echo "<div class='sixteen wide column'>"
                            . "<div class='ui header'>Koreksi kembali sebelum menyimpan data</div>"
                            . "<form method='POST' class='ui form' enctype='multipart/form-data' action='simpan.php'>"
                            . "<div class='field'>"
                            . "<label>Nama</label>"
                            . "<input type='text' name='nama' value='$nama' required>"
                            . "</div>"
                            . "<div class='field'>"
                            . "<label>Email</label>"
                            . "<input type='email' name='email' value='$email' required>"
                            . "</div>"
                            . "<div class='field'>"
                            . "<label>Foto</label>"
                            . "<input type='file' name='foto'>"
                            . "</div>"
                            . "<button class='ui button black' type='submit'>Simpan</button>"
                            . "</form>";
                    } else {
                        echo "<div class='four wide column'>"
                            . "<img class='ui fluid image' src='foto/$foto'>"
                            . "</div>"
                            . "<div class='twelve wide column'>"
                            . "<div class='ui header'>Anda berhasil login</div>"
                            . "<p>Nama Anda: <strong>$nama</strong></p>"
                            . "<p>Email Anda: <strong>$email</strong></p>"
                            . "<div class='ui divider'></div>"
                            . "<form method='GET'>
                                    <input name='edit' value='1' hidden>
                                    <button class='ui button blue' type='submit'>Edit Profil</button>
                                </form>";
                    }
                    ?>
                </div>
            </div>
        </div>
    </div>
    </div>
</body>