const vm = new Vue({
    el: "#app",
    data: {
        catatan: '',
        query: '',
        editCatatan: '',
        idxNow: null,
        daftarCatatan: [],
        modal: null
    },
    methods: {
        tambah() {
            if (this.catatan) {
                this.daftarCatatan.push(this.catatan);
            }
        },
        edit(idx) {
            this.editCatatan = this.daftarCatatan[idx];
            this.idxNow = idx;
            this.modal.show();
        },
        simpan() {
            if (this.editCatatan) {
                this.daftarCatatan.splice(this.idxNow, 1, this.editCatatan);
                this.modal.hide();
            }
        },
        hapus(idx) {
            if (this.daftarCatatan && idx > -1) {
                this.daftarCatatan.splice(idx, 1);
            }
        }
    },
    mounted() {
        this.modal = new bootstrap.Modal(document.getElementById('editModal'));
    },
    computed: {
        filterCatatan() {
            return this.daftarCatatan.reduce((prev, curr, idx) => {
                if (curr.toLowerCase().match(this.query.toLowerCase())) {
                    prev.push({
                        id: idx,
                        val: curr
                    });
                }
                return prev;
            }, []);
        }
    },
});
