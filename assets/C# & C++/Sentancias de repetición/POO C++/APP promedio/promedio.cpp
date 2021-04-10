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
