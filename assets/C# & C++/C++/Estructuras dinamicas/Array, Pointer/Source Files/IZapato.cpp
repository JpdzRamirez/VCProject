#include "Zapato.h"

Zapato::Zapato() : Producto()
{
	this->talla = "";
	this->tipo = "";

}

Zapato::Zapato(string _nombre, float _precio, int _talla, string _tipo) :Producto(_nombre, _precio)
{
	this->talla= _talla;
	this->tipo=_tipo;
	
}

Zapato::~Zapato()
{
	this->talla = "";
	this->tipo = "";
}

//setters

void Zapato::setTipo(string _tipo)
{
	this->tipo = _tipo;
}
void Zapato::setTalla(string _talla)
{
	this->talla = _talla;
}

bool Zapato::validarContenido() {
	if (this->getNombre()==""||this->getCodigo()==""||this->getPrecio()==0||this->getTalla()==""||this->getTipo()=="")
	{
		return false;
	}
	return true;
}


//getters

string Zapato::getTalla()
{
	return this->talla;
}

string Zapato::getTipo()
{
	return this->tipo;
}
