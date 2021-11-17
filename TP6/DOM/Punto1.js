var peque = document.getElementById('peque');
var media = document.getElementById('media');
var grande = document.getElementById('grande');
var parrafo = document.getElementById('miparrafo');

peque.addEventListener('click', fuentePeque);
media.addEventListener('click', fuenteMedia);
grande.addEventListener('click', fuenteGrande);

function fuentePeque(){
    parrafo.classList.remove('media');
    parrafo.classList.remove('grande');
    parrafo.classList.add('peque');
}

function  fuenteMedia(){
    parrafo.classList.remove('peque');
    parrafo.classList.remove('grande');
    parrafo.classList.add('media');
}

function fuenteGrande(){
    parrafo.classList.remove('peque');
    parrafo.classList.remove('media');
    parrafo.classList.add('grande');
}