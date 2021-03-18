<body class="ui three column grid" style="display: grid; align-content: center; background-color: mintcream;">
    <div class="column centered">
        <div class="ui fluid card">
            <div class="content">
                <div class="center aligned ui huge header">Log In</div>
                <form class="ui form" action="cekLogin.php" method="POST">
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
                    <div class="ui divider"></div>
                    <button class="fluid ui blue animated button" tabindex="0" type="submit">
                        <div class="visible content">Login</div>
                        <div class="hidden content">
                            <i class="right arrow icon"></i>
                        </div>
                    </button>
                </form><br>
                <div class="ui inverted segment">
                    <div class="ui inverted accordion">
                        <div class="title">
                            <i class="dropdown icon"></i>
                            Akun yang bisa login
                        </div>
                        <div class="content">
                            <ul class="list">
                                <li>username: admin</li>
                                <li>password: admin123</li>
                            </ul>
                        </div>
                    </div>
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
</body>
<script>
    $('.ui.accordion').accordion('refresh');
</script>