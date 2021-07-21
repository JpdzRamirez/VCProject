#ifndef MenuHeader_HEADER
#define MenuHeader_HEADER

#include <iostream>
#include<stdlib.h>
#include <stdio.h>
#include <list>

#include"Producto.h"
#include"Zapato.h"

using namespace std;

class Menu
{

private:


public:

	Menu();
	~Menu();

	void showTitle() {
	
		cout << "********************************************************"<<endl;
		cout << "BIENVENIDO AL PROGRAMA DE INVENTARIOS DE LA TIENDA ZAPATOS S.A.S" << endl;
		cout << "********************************************************************"<<endl;
		cout << "Seleccione la opcion con el numero" << endl;

	}
	void showOptions() {
	
		cout << " 1. Agregar registro de producto" << endl;
		cout << " 2. Mostrar lista de registo de productos" << endl;
		cout << " 3. Modificar Producto de la lista" << endl;
		cout << " 4. Salir" << endl;
		
	}
	void showOption_1() {
		cout << "Creador de listado de zapatos" << endl;
		cout << "Por favor ingrese los datos:" << endl;
		cout << "1. Ingresar nombre del producto: " << endl;
		cout << "2. Ingresar talla:" << endl;
		cout << "3. Ingrese el precio:" << endl;
		cout << "4. Ingrese el tipo de calzado: " << endl;
		cout << "5. Ingrese el codigo de calzado: " << endl;
		cout << "6. Regresar al menu principal" << endl;

	}
	void showOption_2() {
		cout << "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" << endl;
		cout << "++++++++++++++++++++++++++++++PRODUCTOS+++++++++++++++++++++++++" << endl;

	}
	void showOption_Default() {
		cout << "La opcion seleccionada no es la correcta" << endl;
		cout << "¿Desea salir del programa?" << "Y/N" << endl;

	}
	
	void limpiar() {
		system("cls");
	}

private:

};

Menu::Menu()
{
}

Menu::~Menu()
{
}


#endif