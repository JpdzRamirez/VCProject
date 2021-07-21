#ifndef AdministradorProductos_HEADER
#define AdministradorProductos_HEADER

#include <iostream>
#include "Zapato.h"
#include "ListaGenerica.h"

using namespace std;


class AdministradorProductos
{
private:

	int contadorProductos=1;
	ListaGenerica* listaProductos= new ListaGenerica();
public:
	
	AdministradorProductos();
	void agregarProducto(int posicion, Zapato _zapato);
	ListaGenerica* getListaProductos();
	int getContadorProductos();
	void imprimirProductos_Header();
	void modificarProducto(string _codigo);
	void imprimirListaProductos();
	void imprimirListaCodigos();
};

#endif