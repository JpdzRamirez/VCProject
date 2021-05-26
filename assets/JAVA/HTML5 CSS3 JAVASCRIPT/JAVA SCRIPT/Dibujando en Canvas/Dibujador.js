var d=document.getElementById("Dibujito");
var lienzo= d.getContext("2d");
var parametroLinea=document.getElementById("entradaText");
var boton=document.getElementById("bottonOK");
var limpiar=document.getElementById("clear");
var yi,xf;


boton.addEventListener("click",asignarLineas);
limpiar.addEventListener("click",borrarTablero);


Dibujar("black",1,1,1,300);
Dibujar("black",1,299,299,299);
Dibujar("black",299,1,299,299);
Dibujar("black",1,1,299,1);

function Dibujar(color, xinicial, yinicial, xfinal, yfinal){

    lienzo.beginPath();
    lienzo.strokeStyle=color;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal,yfinal);
    lienzo.stroke();
    lienzo.closePath();

}
function asignarLineas(){

    var x;
    x=parseInt(parametroLinea.value);
     /* Repetidor lineas inferior*/
            for (var i =0; i<x;i++){

                yi=10*i;
                xf=10*(i+1);
                Dibujar("Red",0,yi,xf,300);
                
                
            }
            /* Repetidor lineas superior*/ 
            for (var u =0; u <x;u++){

                yi=10*u;
                xf=10*(u+1);
                Dibujar("Brown",xf,0,300,yi);
                  
            }
}

function borrarTablero(){
    lienzo.clearRect(0,0, d.clientWidth, d.height);
    Dibujar("black",1,1,1,300);
    Dibujar("black",1,299,299,299);
    Dibujar("black",299,1,299,299);
    Dibujar("black",1,1,299,1);
}




