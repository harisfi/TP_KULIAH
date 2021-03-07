<body>
    <div class="ui two column grid">
        <div class="column centered">
            <div class="ui fluid card">
                <div class="content">
                    <div class="center aligned ui huge header">Log In</div>
                    <form class="ui form" action="cekLogin.php" method="POST">
                        <div class="two fields">
                            <div class="required field">
                                <label>Nama</label>
                                <input type="text" name="nama" placeholder="Nama" required>
                            </div>
                            <div class="required field">
                                <label>Email</label>
                                <input type="email" name="email" placeholder="Email" required>
                            </div>
                        </div>
                        <div class="two fields">
                            <div class="required field">
                                <label>Username</label>
                                <div class="ui left icon input">
                                    <input type="text" name="username" placeholder="Username" required>
                                    <i class="user icon"></i>
                                </div>
                            </div>
                            <div class="required field">
                                <label>Password</label>
                                <div class="ui left icon input">
                                    <input type="password" name="password" placeholder="Password" required>
                                    <i class="lock icon"></i>
                                </div>
                            </div>
                        </div>
                        <div class="ui divider"></div>
                        <button class="fluid ui blue animated button" tabindex="0" type="submit">
                            <div class="visible content">Login</div>
                            <div class="hidden content">
                                <i class="right arrow icon"></i>
                            </div>
                        </button>
                    </form>
                    <div class="ui info message">
                        <div class="header">Akun yang bisa login</div>
                        <ul class="list">
                            <li>username: admin</li>
                            <li>password: z</li>
                        </ul>
                    </div>
                    <?php
                        if (isset($_GET['error'])) {
                            echo "
                            <div class='ui negative message'>
                                <div class='header'>Oops!</div>
                                <p>Maaf username atau password Anda salah</p>
                            </div>";
                        }
                    ?>
                </div>
            </div>
        </div>
    </div>
</body>