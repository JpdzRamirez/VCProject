var d=document.getElementById("Tablero");
var lienzoT=d.getContext("2d");
varvariable;
var x=150;
var y=150;
alert("variable")
document.addEventListener("keyup",dibujarConTeclado);

var teclas={
    UP: 38,
    DOWN: 40,
    LEFT: 37,
    RIGHT: 39

};

dibujarLinea("Red",149,149,151,151,lienzoT);



function dibujarConTeclado(eventoJava){
    
    var colorS="Brown";
    var movimiento=10;
    if(eventoJava.keyCode==teclas.UP){

        dibujarLinea(colorS, x,y,x,y-movimiento,lienzoT);
        y=y-movimiento;
    } else if(eventoJava.keyCode==teclas.DOWN){
        dibujarLinea(colorS, x,y,x,y+movimiento,lienzoT);
        y=y+movimiento;
    } else if(eventoJava.keyCode==teclas.LEFT){
        dibujarLinea(colorS, x,y,x-movimiento,y,lienzoT);
        x=x-movimiento;
    } else  if(eventoJava.keyCode==teclas.RIGHT){
        dibujarLinea(colorS, x,y,x+movimiento,y,lienzoT);
        x=x+movimiento;
    }
   
}
function dibujarLinea(color,xinicial,yinicial,xfinal,yfinal,lienzo){

    lienzo.lineWidth=3;
    lienzo.beginPath();
    lienzo.strokeStyle=color;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal,yfinal);
    lienzo.stroke();
    lienzo.closePath();

}