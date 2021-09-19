<div class="modal fade" id="modal_delete<?= $key['id_penerbit'] ?>" tabindex="-1" aria-labelledby="modal_delete_label" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <form class="modal-content" method="POST">
            <div class="modal-header">
                <h5 class="modal-title" id="modal_delete_label">Hapus Penerbit</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <span>Apakah anda yakin ingin menghapus penerbit ini?</span>
                <input name="id" value="<?= $key['id_penerbit'] ?>" hidden>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Batal</button>
                <button type="submit" class="btn btn-danger" name="submit" value="delete">Hapus</button>
            </div>
        </form>
    </div>
</div>