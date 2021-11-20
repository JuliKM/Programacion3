

function  contador(){
    var elemento = document.getElementById("elemento");
    var num = parseInt(elemento.childNodes[0].nodeValue);
    num += 1;
    elemento.childNodes[0].nodeValue = num;
}
