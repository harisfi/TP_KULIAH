const vm = new Vue({
    el: "#app",
    data: {
        nama: '',
        barang: []
    },
    methods: {
        submit() {
            if (this.nama) {
                this.barang.push(this.nama);
            }
        },
        hapus(idx) {
            if (this.barang && idx > -1) {
                this.barang.splice(idx, 1);
            }
        }
    }
});
