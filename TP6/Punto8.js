var num1 = null;
var num2 = null;
var operadorAUsar;
var valorInput;
var operadorIngresado = false;

function concatenar(num) {
    valorInput = document.getElementById('inputField').value;
    valorInput = valorInput.concat(num.toString());
    document.getElementById('inputField').value = valorInput.toString();
}

function operacion(operador) {

    if(operadorIngresado){
        return;
    }

    borrar();
    operadorAUsar = operador;
    num1 = valorInput;
    valorInput = null;
    operadorIngresado = true;
}

function borrar() {
    document.getElementById('inputField').value = null;
    operadorIngresado = false;
}

function realizarOperacion() {

    if(num1 == null){
        return;
    }else{
        num2 = valorInput;
    }

    borrar();

    if(num2 == null){
        document.getElementById('inputField').value = num1;
        return;
    }

    switch (operadorAUsar) {
        case '+': 
            document.getElementById('inputField').value = suma();
            break;
        case '-': 
            document.getElementById('inputField').value = resta();
            break;
        case '*': 
            document.getElementById('inputField').value = multiplicacion();
            break;
        case '/': 
            document.getElementById('inputField').value = division();
            break;
        default:
            break;
    }
    operadorIngresado = false;
}

function suma(){
    return parseInt(num1) + parseInt(num2);
}

function resta(){
    return parseInt(num1) - parseInt(num2);
}

function multiplicacion(){
    return parseInt(num1) * parseInt(num2);
}

function division(){
    return parseInt(num1) / parseInt(num2);
}