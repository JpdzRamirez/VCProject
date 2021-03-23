//este es un ejemplo de comentario
/*
este es otro ejemplo de comentario
*/
// El tipo de comentario se opera con doble diagonal o diagonal puntero, esto permite realizar comentarios de linea 
//o comentarios con salto de linea contenidos entre puntero diagonal.
#include <iostream> // Se importan las librerias las cuales continene la intelligencia , variables declaradas y funciones para agilizar 
#include <vector> //   el desarrollo del algoritmo.
#include <string>

using namespace std;   // Se define std para abreviar la de claración de las funcioens "cin y cout".

int main()
{
int a, b;  // Se decaran las variables enteras para ingresar los numeros utilizados para los calculos en el algoritmo.
 cout << "Ingresa el primer numero"<<endl;// Se utiliza cout para imprimir el mensaje en la pantalla de la terminal, se hace un salto de linea
 cin >> a; // Se utiliza el cin para solicitar entrada de un numero entero, si se ingresa una letra esta se traduce a factor numerico segun el ASCII
 cout << "Ingresa el segundo numero"<<endl;
 cin >> b;
 cout <<"La suma de los numeros es: "<< a+b <<endl; //Se imprimen los mensajes en la pantalla y se realizan operaciones con los numeros
 cout <<"La resta de los numeros es: "<< a-b <<endl;
 cout <<"La multiplicacion de los numeros es: "<< a*b <<endl;
 cout <<"La division de los numeros es: "<< a/b <<endl;
 cout <<"El residuo es: "<< a%b <<endl;

 system("pause"); // Se genera un apausa para evitar que finalice el programa hasta generar la orden
 return EXIT_SUCCESS;


}