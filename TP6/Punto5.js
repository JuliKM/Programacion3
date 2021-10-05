function validate() {
    var edad = document.querySelector('input[name="edad"]:checked').value;

    if (edad == "Si") {
        alert("Usted puede ingresar al sitio");
    } else {
        alert("Usted no puede ingresar al sitio");
    }
}