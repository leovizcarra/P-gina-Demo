var btnTriste = document.getElementById('triste');
var btnFeliz = document.getElementById('agradecido');

function cargarContenido() {

    var xhr = new XMLHttpRequest();
    xhr.open("GET", "respuesta1.txt", true);

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {

            var contenido = document.getElementById('contenido');
            contenido.innerHTML = xhr.responseText;
        }
    };

    xhr.send();

}

function cargarContenido2() {

    var xhr = new XMLHttpRequest();
    xhr.open("GET", "respuesta2.txt", true);

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) { 
            var contenido = document.getElementById('contenido');
            contenido.innerHTML = xhr.responseText;
        }
    };

    xhr.send();

}

btnTriste.addEventListener('click', cargarContenido);
btnFeliz.addEventListener('click', cargarContenido2);