var open= document.getElementById('open');
var close= document.getElementById('close');
var ventana= document.getElementById('modal_container');

open.addEventListener('click', abrirVentana);

function abrirVentana(){
    ventana.classList.add('show');
}

close.addEventListener('click', cerrarVentana);

function cerrarVentana(){
    ventana.classList.remove('show');
}