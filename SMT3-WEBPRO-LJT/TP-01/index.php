<?php
require('./libs/Database.php');
require('./libs/Penerbit.php');

$penerbit = new Penerbit();
$notif = [
    'msg' => null,
    'err' => false
];

if (isset($_POST['submit'])) {
    $nama = $_POST['penerbit'];
    $alamat = $_POST['alamat'];

    switch ($_POST['submit']) {
        case 'create':
            if ($penerbit->store($nama, $alamat)) {
                $notif['msg'] = 'Berhasil menambah penerbit';
            } else {
                $notif['msg'] = 'Gagal menambah penerbit';
                $notif['err'] = true;
            }
            break;
        case 'edit':
            $id = $_POST['id'];
            if ($penerbit->update($id, $nama, $alamat)) {
                $notif['msg'] = 'Berhasil mengedit penerbit';
            } else {
                $notif['msg'] = 'Gagal mengedit penerbit';
                $notif['err'] = true;
            }
            break;
        case 'delete':
            $id = $_POST['id'];
            if ($penerbit->destroy($id)) {
                $notif['msg'] = 'Berhasil menghapus penerbit';
            } else {
                $notif['msg'] = 'Gagal menghapus penerbit';
                $notif['err'] = true;
            }
            break;
        default:
            break;
    }
}

$dataPenerbit = $penerbit->index();
?>

<!DOCTYPE html>
<html lang="en">

<?php include('./partials/head.html') ?>

<body>
    <?php include('./partials/navbar.html') ?>
    <main class="container my-5">
        <?php if ($notif['msg'] != null) { ?>
            <div class="alert alert-<?= $notif['err'] ? 'danger' : 'success' ?> alert-dismissible fade show" role="alert">
                <?= $notif['msg'] ?>
                <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        <?php } ?>
        <table class="table table-bordered border-dark table-striped table-hover">
            <thead>
                <tr class="table-dark">
                    <th scope="col">#</th>
                    <th scope="col">Penerbit</th>
                    <th scope="col">Alamat</th>
                    <th scope="col">Aksi</th>
                </tr>
            </thead>
            <tbody>
                <?php
                $cnt = 1;
                foreach ($dataPenerbit as $key) { ?>
                    <tr>
                        <th scope="row"><?= $cnt ?></th>
                        <td><?= $key['penerbit'] ?></td>
                        <td><?= $key['alamat'] ?></td>
                        <td>
                            <button type="button" class="btn btn-warning btn-sm" data-bs-toggle="modal" data-bs-target="#modal_edit<?= $key['id_penerbit'] ?>">
                                Edit
                            </button>
                            <button type="button" class="btn btn-danger btn-sm" data-bs-toggle="modal" data-bs-target="#modal_delete<?= $key['id_penerbit'] ?>">
                                Hapus
                            </button>
                        </td>
                    </tr>
                <?php $cnt++;
                } ?>
            </tbody>
        </table>
    </main>

    <?php
    include('./partials/create.php');
    foreach ($dataPenerbit as $key) {
        include('./partials/edit.php');
        include('./partials/delete.php');
    }
    include('./partials/footer.html');
    ?>
</body>

</html>