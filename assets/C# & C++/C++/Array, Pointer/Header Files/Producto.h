#ifndef Producto_HEADER
#define Producto_HEADER

#include <iostream>
#include <stdlib.h>

using namespace std;


class Producto
{
	//variables privadas
private:

	float precio;
	string nombre;
	string codigo;

	//variables publicas
public:
	Producto();
	Producto(string _nombre, float _precio); // CONSTRUCTOR
	~Producto();
	void setNombre(string _nombre);
	void setPrecio (float _precio);
	void setCodigo(string _codigo);

	float getPrecio();
	string getNombre();
	string getCodigo();
	
};


#endif
