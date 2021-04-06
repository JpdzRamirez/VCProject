#include <iostream>
#include <stdlib.h>
#include <cstdlib>
#include <string>
#include "promedio.h" //INCLUIMOS EN CABECERA LA CLASE PROMEDIO CREADA


using namespace std;
// **************************POO ; PROGRAMACION ORIENTADA A OBJETOS C++********************************//

int main() {

	// INDICAMOS EL TAMAÑO DEL ARREGLO
	int entrada, llave;
	float sumador,p;
	promedio Resultados;
	llave=0;
	sumador = NULL;

	do
	{
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

	cout<< "Desea calcular otro promedio? "<< endl;

	} while (llave!=1);
	
	

	system("PAUSE");
	return EXIT_SUCCESS;
}