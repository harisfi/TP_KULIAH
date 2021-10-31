document.addEventListener("DOMContentLoaded", function (event) {
    const formMhs = document.frm_data_mhs;

    const table = document.getElementsByClassName('table')[0];
    const hNim = document.getElementById('h_nim');
    const hNama = document.getElementById('h_nama');
    const hAgama = document.getElementById('h_agama');
    const hJurusan = document.getElementById('h_jurusan');
    const hGender = document.getElementById('h_gender');
    const hStatus = document.getElementById('h_status');
    const hKomen = document.getElementById('h_komentar');

    formMhs.onsubmit = (event) => {
        event.preventDefault();
        if (validateForm()) {
            const txNim = formMhs.nim.value;
            const txNama = formMhs.nama.value;
            const cbAgama = formMhs.agama.value;
            const cbJurusan = formMhs.jurusan.value;
            const rdGender = formMhs.gender.value;
            const rdStatus = formMhs.status.value;
            const taKomen = formMhs.komentar.value;

            hNim.innerText = txNim;
            hNama.innerText = txNama;
            hAgama.innerText = cbAgama;
            hJurusan.innerText = cbJurusan;
            hGender.innerText = rdGender;
            hStatus.innerText = rdStatus;
            hKomen.innerText = taKomen;

            formMhs.hidden = true;
            table.hidden = false;
        } else {
            alert('Error, form tidak tervalidasi');
        }
    }

    function validateForm() {
        const txNim = formMhs.nim.value;
        const txNama = formMhs.nama.value;
        const cbAgama = formMhs.agama.value;
        const cbJurusan = formMhs.jurusan.value;
        const rdGender = formMhs.gender.value;
        const rdStatus = formMhs.status.value;
        const taKomen = formMhs.komentar.value;

        if (!txNim) {alert('NIM harus diisi!'); return false;}
        if (!txNama) {alert('Nama harus diisi!'); return false;}
        if (!cbAgama) {alert('Agama harus diisi!'); return false;}
        if (!cbJurusan) {alert('Jurusan harus diisi!'); return false;}
        if (!rdGender) {alert('Jenis kelamin harus diisi!'); return false;}
        if (!rdStatus) {alert('Status harus diisi!'); return false;}
        if (!taKomen) {alert('Komentar harus diisi!'); return false;}
        return true;
    }
});
