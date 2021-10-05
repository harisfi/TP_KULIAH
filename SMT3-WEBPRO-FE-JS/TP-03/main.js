// 1. Manipulasi text h1 dengan text “Pemrograman Frontend, ukuran font: 50px, center”
var h1 = document.querySelector('h1')
h1.innerText = 'Pemrograman Frontend';
h1.style.fontSize = '50px'
h1.style.textAlign = 'center'

// 2. Replace salah satu elemen class
document.body.classList.replace('border-top', 'replaced')


// 3. Tambahkan elemen paragraph baru sebelum paragraph terakhir
var article = document.getElementsByClassName('article')[0]
var child = document.createElement('p')
child.innerText = 'Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru Tambahan paragraf baru'
article.appendChild(child)

// 4. Ganti gambar profil dengan menggunakan javascript
var imgProfile = document.getElementsByClassName('img-profile')[0]
imgProfile.src = 'https://cf.shopee.co.id/file/962e5544f481d1032bd1dfd3137c4355_tn'

// 5. Replace paragraph terakhir dengan isi paragraph baru
var article = document.getElementsByClassName('article')[0]
var lastChild = article.children[article.children.length-1]
lastChild.innerText = 'mengganti paragraf terakhir mengganti paragraf terakhir mengganti paragraf terakhir mengganti paragraf terakhir'