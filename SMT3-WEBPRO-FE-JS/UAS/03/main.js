const images = [
  './images/melanie-andersen-Agbtans6EUM-unsplash.jpg',
  './images/remi-remino-E9kVmtiqqGE-unsplash.jpg',
  './images/rene-peters-kD4AXcuvnTE-unsplash.jpg',
  './images/the-lucky-neko-w2ii07oH92s-unsplash.jpg'
];

let img = document.getElementsByClassName('col-6');
let mainImg = document.getElementsByClassName('col-12')[0];

mainImg.innerHTML = 'Silakan Pilih Gambar';
[...img].map((el, id) => {
  el.style.backgroundImage = `url(${images[id]})`;
  el.addEventListener('click', () => {
    mainImg.innerHTML = null;
    mainImg.style.backgroundImage = el.style.backgroundImage;
  });
});
