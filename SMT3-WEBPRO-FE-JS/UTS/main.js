const navbar = document.getElementsByClassName('navbar')[0];
const li = navbar.getElementsByTagName('li')[1];

const newEl = document.createElement('li');
const link = document.createElement('a');
link.innerText = "Location";
link.href = "#";
newEl.appendChild(link);
navbar.insertBefore(newEl, li);

const gambarProduk = document.getElementsByClassName('gambar')[0];
gambarProduk.src = "https://lh3.googleusercontent.com/rCWhDwE6AZYYIsfmceH0WGoS3zF_nOLtQ7BtZgerNCRob3jbs7LwLpEmav86KLcV-1BWW8Gyuwveo8M=w1366-h626";