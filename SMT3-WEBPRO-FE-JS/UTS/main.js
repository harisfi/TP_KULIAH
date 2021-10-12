const navbar = document.getElementsByClassName('navbar')[0];
const li = navbar.getElementsByTagName('li')[1];

const newEl = document.createElement('li');
const link = document.createElement('a');
link.innerText = "Location";
link.href = "#";
newEl.appendChild(link);
navbar.insertBefore(newEl, li);

const gambarProduk = document.getElementsByClassName('gambar')[0];
gambarProduk.src = "./produk3resize.jpg";

var para = document.getElementsByClassName('paragraf')[1];
console.log(para.parentNode.className);
var newPara = document.createElement('div');
newPara.className = 'paragraf';
newPara.innerText = 'paragraf';
para.parentNode.replaceChild(newPara, para);