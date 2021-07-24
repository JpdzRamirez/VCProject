#ifndef Zapato_HEADER
#define Zapato_HEADER

#include <iostream>
#include "Producto.h"
using namespace std;

class Zapato : public Producto
{
private:
	string talla;
	string tipo;
	

public:

	Zapato();
	Zapato(string _nombre, float _precio, int _talla, string _tipo);
	~Zapato();


	void setTipo(string _tipo);
	void setTalla(string _talla);

	bool validarContenido();
	string getTalla();
	string getTipo();
};
#endif