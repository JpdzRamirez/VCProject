#include "AdministradorProductos.h"

using	namespace std;


AdministradorProductos::AdministradorProductos() {
	this->listaProductos = new ListaGenerica();
	this->contadorProductos = 1;
}

void AdministradorProductos::imprimirProductos_Header() {
	if (this->contadorProductos-1==0)
	{
		cout << "********************Lista de productos Vacia*********************" << endl;
		cout << "|            Cantidad de productos : " << this->contadorProductos - 1 << " Items             |" << endl;
	}
	else
	{
		cout << "********************Lista de productos *********************" << endl;
		cout << "|            Cantidad de productos : " << this->contadorProductos - 1 << " Items             |" << endl;
	}
	
}
void AdministradorProductos::modificarProducto(string _codigo)
{
	this->listaProductos->modificarItem(_codigo);

}
void AdministradorProductos::imprimirListaProductos()
{
	this->listaProductos->imprimirCompleto();
}
void AdministradorProductos::imprimirListaCodigos()
{
	this->listaProductos->imprimir();
}
void AdministradorProductos::agregarProducto(int _posicion, Zapato _zapato)
{
	this->listaProductos->insertar(_posicion, _zapato);
	this->contadorProductos++;
	
}


ListaGenerica* AdministradorProductos::getListaProductos() {
	return this->listaProductos;
}

int AdministradorProductos::getContadorProductos()
{
	return this->contadorProductos;
}

