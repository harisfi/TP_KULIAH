const vm = new Vue({
    el: "#app",
    data: {
        nama: '',
        kelas: '',
        ket: '',
        hasil: []
    },
    methods: {
        submit() {
            alert("Berhasil");
        },
        summary() {
            alert(
                "Nama: " + this.nama +
                "\nKelas: " + this.kelas +
                "\nKeterangan: " + this.ket + 
                "\nYang dipelajari hari ini: " + this.hasil
            );
        }
    }
});
