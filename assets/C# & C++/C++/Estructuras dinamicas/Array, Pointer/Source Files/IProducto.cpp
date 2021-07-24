
#include "Producto.h"

Producto::Producto()
{
	this->precio = 0;
	this->nombre = "";
	this->codigo = "";
}

Producto::Producto(string _nombre, float _precio) {
	this->precio = _precio;
	this->nombre = _nombre;
}
Producto::~Producto() {
	this->precio = 0;
	this->nombre = "";
	this->codigo = "";
}

void Producto::setNombre(string _nombre)
{
	this->nombre = _nombre;
}

void Producto::setPrecio(float _precio)
{
	this->precio = _precio;
}
void ::Producto::setCodigo(string _codigo) {
	this->codigo = _codigo;
}

float Producto::getPrecio()
{
	return this->precio;
}

string Producto::getNombre()
{
	return this->nombre;
}
string Producto::getCodigo() {
	return this->codigo;
}
