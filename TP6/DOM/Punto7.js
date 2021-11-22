function validar(){
    var nombre = document.getElementById('nombre').value;
    var pass1 = document.getElementById('pass1').value;
    var pass2 = document.getElementById('pass2').value;

    if(nombre == "" || pass1 == "" || pass2 == ""){
        alert("Debe completar todos los campos");
    }

    if(pass1.toString() != pass2.toString()){
        alert("Las claves son distintas");
    }
}