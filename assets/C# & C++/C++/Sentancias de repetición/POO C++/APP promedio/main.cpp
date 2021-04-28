#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
#include "promedio.h" //INCLUIMOS EN CABECERA LA CLASE PROMEDIO CREADA


using namespace std;
// **************************POO ; PROGRAMACION ORIENTADA A OBJETOS C++********************************//

int main() {

	// INDICAMOS EL TAMAÑO DEL ARREGLO
	int entrada, llave,indice;
	float sumador,p; 
	char respuesta;


	llave = NULL;
	indice = 0;
	sumador = 0;
	respuesta = NULL;

	cout << "Ingrese el numero de estudiantes : " << endl;
	cin >> entrada;
	promedio* lista = new promedio[entrada];

	do
	{
		p = NULL;
		cout << " Cunatas notas se ingresa ? (Digite el numero)" << endl;
		cin >> entrada;
		lista[indice].setvectorNotas(entrada);
		for (int i = 1; i <= lista[indice].getNotas(); i++)
		{
			cout << "Ingrese la nota: " << i << " " << endl;
			cin >> p;
			lista[indice].valoresVectorNotas(i,p);
			sumador += p;
		}

		cout << "El promedio de las notas es: " << lista[indice].calcularPromedio(sumador) << endl; 

		cout << "Desea calcular otro promedio? <y/n> " << endl;
		cin >> respuesta;

		if (respuesta == 110)
		{
			llave = 1;
			break;
		}
		else
		{
			indice++;
		}
	} while (llave != 1);


	lista->~promedio; // Limpiamos la memoria 
	system("PAUSE");
	return EXIT_SUCCESS;
}