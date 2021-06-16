import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
public class HolaMundo extends MIDlet{ // Se heredan los metodos y atributos propios de la clase MIDlet
    
    private Display pantalla;  // se definen las variables
private Form formulario = null;

public HolaMundo(){ // Se crea clase Hola mundo
pantalla = Display.getDisplay(this); // se inicializa las variables
formulario = new Form(“Hola Mundo”);
}
public void startApp(){ // Se inicializa la APP
pantalla.setCurrent(formulario);
}
public void pauseApp(){ // se define metodo pausa para 
}
public void destroyApp(boolean unconditional){
pantalla = null;
formulario = null;
notifyDestroyed();
}



}

