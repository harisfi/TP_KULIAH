<?php
    if (isset($_GET['logout'])) {
        session_destroy();
        header("Refresh:0");
    }
    $nama = htmlentities($_SESSION['nama']);
    $email = htmlentities($_SESSION['email']);
?>
<body>
    <div class="ui two column grid">
        <div class="column centered">
            <div class="ui fluid card">
                <div class="content">
                    <div class="center aligned ui huge header">Selamat Datang!</div>
                    <div class="ui grid">
                        <div class="four wide column">
                            <img class="ui fluid image" src="https://semantic-ui.com/images/wireframe/white-image.png">
                        </div>
                        <div class="twelve wide column">
                            <div class="ui header">Anda berhasil login</div>
                            <p>Nama Anda:  <?php echo $nama;?></p>
                            <p>Email Anda: <?php echo $email;?></p>
                            <div class="ui divider"></div>
                            <form method="GET">
                                <input name="logout" value="1" hidden>
                                <button class="negative ui button" type="submit">Logout</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>