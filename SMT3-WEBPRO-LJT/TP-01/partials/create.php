<div class="modal fade" id="modal_create" tabindex="-1" aria-labelledby="modal_create_label" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <form class="modal-content" method="POST">
            <div class="modal-header">
                <h5 class="modal-title" id="modal_create_label">Tambah Penerbit</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div class="mb-3">
                    <label for="penerbit" class="form-label">Penerbit</label>
                    <input type="text" class="form-control" name="penerbit" placeholder="Nama penerbit" required>
                </div>
                <div class="mb-3">
                    <label for="alamat" class="form-label">Alamat</label>
                    <input type="text" class="form-control" name="alamat" placeholder="Alamat penerbit" required>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Batal</button>
                <button type="submit" class="btn btn-primary" name="submit" value="create">Simpan</button>
            </div>
        </form>
    </div>
</div>