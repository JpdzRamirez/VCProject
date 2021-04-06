<H1 align="center"> Actividad de Apropiación del conocimiento <br>(Conceptualización y Teorización).</H1>

## Taller: Implementación de las sentencias de repetición.
<p align="center">
  <img width="200px" src="https://www.codesdope.com/staticroot/images/cs/l2.gif"/> 
</p>

<H1 align="center"> Implementaciones adicionales; Programación orientada a objetos , punteros y asignación dinamica de punteros</H1>

### Actividad 4 – Evidencia 1: Taller: Implementación de las sentencias de repetición.

<p style=»text-align: justify;> Teniendo en cuenta lo anterior y el material de formación, analice la siguiente
situación y elija la estructura de repetición que más se ajuste a la necesidad: realice una
aplicación en C++ que solicite al usuario la cantidad de notas que desea digitar. Una vez
obtenido este valor el programa pedirá al usuario que digite dicha cantidad de notas. Al
finalizar el programa debe mostrar en pantalla el promedio de las notas digitadas.
Recuerde usar valores entre 0.0 y 5.0.
Una vez realizado el programa en el IDE Dev C++ o el IDE de su preferencia, compile y ejecute el código para generar el archivo con extensión .CPP, el cual debe
enviar por la opción. </p>

## Archivos de origen // Codigo principal MAIN.cpp

```

#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
#include "promedio.h" //INCLUIMOS EN CABECERA LA CLASE PROMEDIO CREADA


using namespace std;
// **************************POO ; PROGRAMACION ORIENTADA A OBJETOS C++********************************//

int main() {

	// INDICAMOS EL TAMAÑO DEL ARREGLO
	int entrada;
	float sumador,p;
	promedio Resultados;

	sumador = NULL;

	cout << " Cunatas notas ingresará ? (Digite el numero)" << endl;
	cin >> entrada;
	Resultados.setvectorNotas(entrada);
	

	for (int i = 1; i <= Resultados.getNotas(); i++)
	{
		cout << "Ingrese la nota: " << i << " " << endl;
		cin >> p;
		Resultados.valoresVectorNotas(i,p);  // Agregamos notas en el vector
		sumador += p;
	}
	
	cout << "El promedio de las notas es: " << Resultados.calcularPromedio(sumador) << endl;

	system("PAUSE");
	return EXIT_SUCCESS;
}


```

##  Archivos de origen // codigo de la clase primedio.cpp

```
#include "promedio.h"
#include <iostream>

// IMPLEMENTACIÓN DE CLASE PROMEDIO

promedio::promedio()  //POLIMORFISMO
{
	NumNotas=0;
	punteroNotas = NULL;
	suPromedio = 0;
}

promedio::promedio(int nNotas, float vPromedio) //POLIMORFISMO
{
	NumNotas = nNotas;
	suPromedio = vPromedio;
	punteroNotas = NULL;

}
promedio::~promedio() //DESTRUCTOR
{
}


//RETORNADORES

float promedio::getpromedio()
{
	return suPromedio;
}

int promedio::getNotas()
{
	return NumNotas;
}

// SET VARIABLES Y CALCULOS                
void promedio::setvectorNotas(int i)
{
	punteroNotas = new float[i];
	NumNotas = i;
}
void promedio::valoresVectorNotas(int i, float val)
{
	punteroNotas[i] = val;
}


//DEFINIMOS EL METODO PARA OBTENER EL PROMEDIO
float promedio::calcularPromedio(float valor)
{
	suPromedio = valor / NumNotas;
	return suPromedio;
}

```

## Archivos de cabecera // Declaración de la clase promedio.h

```
#pragma once
class promedio
{
public:
	promedio();
	promedio(int nNotas, float y);
	float getpromedio();
	int getNotas();
	void setvectorNotas(int i);
	void valoresVectorNotas(int i, float val);
	float calcularPromedio(float valor);
	virtual ~promedio();

private:

	float *punteroNotas;
	int NumNotas;
	float suPromedio;


};
```
