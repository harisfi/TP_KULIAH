let iframe = document.querySelector('iframe');

document.querySelector('form').addEventListener('submit', (e) => {
  const data = Object.fromEntries(new FormData(e.target).entries());
  switch (data.pilih) {
    case '0':
      iframe.src = './tugas/TP-04/index.html';
      break;
    case '1':
      iframe.src = './tugas/TP-06/index.html';
      break;
    case '2':
      iframe.src = './tugas/TP-08/01/index.html';
      break;
    case '3':
      iframe.src = './tugas/TP-08/02/index.html';
      break;
    case '4':
      iframe.src = './tugas/TP-07/index.html';
      break;
    default:
      iframe.src = 'home.html';
      break;
  }
  e.preventDefault();
});